#!/usr/bin/env bash

WAR=hello.war

# Clean
rm -rf build/$WAR build/web

# Copy
cp -rf web build/web

# Compile Java code
CP=.:/home/michel/apache-tomcat-8.0.20/lib/servlet-api.jar
D=build/web/WEB-INF/classes
SRC=src/com/michelpm/*.java
mkdir -p $D
javac -cp $CP -d $D $SRC

if [ $? -eq 1 ]
then
  echo "Fix the errors!" >&2
  exit 1
fi

# Build WAR
pushd build/web
jar -cvf ../$WAR *
popd
