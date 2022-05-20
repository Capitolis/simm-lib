#!/usr/bin/env bash
# Usage:
# ./update-version.sh - to automatically generate version
# ./update-version.sh 1.2.3 - to force a specific version

if [[ -f "$(cd `dirname $0` && pwd)/mvnw" ]]; then MVN="$(cd `dirname $0` && pwd)/mvnw"; else MVN="mvn"; fi
GIT_STATUS=$(git status --porcelain)
if [ -n "$GIT_STATUS" ]; then
    echo "Uncommitted changes detected, fix and re-run this script";
    echo $GIT_STATUS
    exit 1
fi

GIT_BRANCH=$(git rev-parse --abbrev-ref HEAD)
LAST_TAG=$(git tag -l --sort=-v:refname | head -n 1)
if [ -n "$1" ]; then
    NEW_TAG=$1
else
    if [ -n "$LAST_TAG" ]; then
        ver=( ${LAST_TAG//./ } )
        ((ver[1]++))
        ver[2]=0
        NEW_TAG="${ver[0]}.${ver[1]}.${ver[2]}"
    fi
    NEW_TAG=${NEW_TAG:-0.1.0}
fi

echo "Current detected version is: '$LAST_TAG'"
echo "New release version will be: '$NEW_TAG'\n"

read -p "Perform release? [y/n]" -n 1 -r
echo    # (optional) move to a new line
if [[ $REPLY =~ ^[Yy]$ ]]
then
    echo "Updating version... "
    if [[ $(git tag -l "${NEW_TAG}") ]]; then
        echo "tag '${NEW_TAG}' exists, aborting"
        exit 1
    else
        if (${MVN} versions:set -DnewVersion="${NEW_TAG}" &&\
            git commit --allow-empty -m "'${NEW_TAG}'" pom.xml && ${MVN} versions:commit &&\
            git tag -a $NEW_TAG -m "release $NEW_TAG" && git push -u origin $GIT_BRANCH --tags) ; then
            echo "updated pom to '${NEW_TAG}', created git tag and pushed to: '$GIT_BRANCH'"
        else
            echo "failed, reverting" && ${MVN} versions:revert
            exit 1
        fi
    fi
fi
