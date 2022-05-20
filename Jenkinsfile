#!/usr/bin/env groovy
/*
    This script is a Jenkins pipeline (see: 'https://jenkins.io/doc/book/pipeline/getting-started/').
    Plugins needed: pipeline, workflow-multibranch, pipeline-utility-steps
*/
node("docker") {
    echo "Running job: ${env.BUILD_ID} on ${env.JENKINS_URL}"
    step([$class: 'WsCleanup'])
    //
    def repository = params.repository
    def gitTag = ""
    def highestGitTag = ""
    def dockerImage = 'adoptopenjdk/maven-openjdk11'
    def dockerMounts= '-v $HOME/.m2:/root/.m2 -v $PWD:/root'

    stage('Checkout') {
        echo "Checkout stage..."
        checkout scm
        try{
            gitTag = sh(script: "git  describe --exact-match --tags HEAD", returnStdout: true).trim();
            highestGitTag = sh(script: "git tag -l --sort=-v:refname | head -n 1", returnStdout: true).trim();
            println "gitTag: ${gitTag} [highestGitTag: ${highestGitTag}]"
            //
            String applicationName = (notEmpty(params.applicationName))? params.applicationName: getArtifactId()
            currentBuild.displayName = "${applicationName}:${gitTag}-${env.BUILD_ID}"
        }catch(Throwable t){
            println "Failed to retrieve tag: "+t.getMessage()
            error("Make sure code is tagged in GIT, un-tagged release will fail.")
        }
    }

    stage('Build') {
        echo "Build stage..."
        //
        echo "Running build script..."
        sh"docker run --rm ${dockerMounts} ${dockerImage} mvn -f /root/pom.xml clean package -DskipTests=true"
    }

    stage('Test') {
        echo "Test stage..."
        sh"docker run --rm ${dockerMounts} ${dockerImage} mvn -f /root/pom.xml test -Dspring.profiles.active=test"
    }

    stage('Publish') {
        echo "Publish stage..."
        sh"docker run --rm ${dockerMounts} ${dockerImage} mvn -f /root/pom.xml deploy -DskipTests=true -DaltDeploymentRepository=${altDeploymentRepository}"
    }
}

static boolean notEmpty(str) {
    return str!=null && str.trim().length()>0
}

static String getArtifactId() {
    def matcher = readFile('pom.xml') =~ '<artifactId>(.+?)</artifactId>'
    matcher ? matcher[0][1] : "na"
}
