#!/usr/bin/env bash

WAR=hello.war

# Clean
rm -rf build/$WAR build/web

# Copy
cp -rf web build/web

# Compile Java code
JAR_SERVLET=/home/michel/apache-tomcat-8.0.20/lib/servlet-api.jar
JAR_JSP=/home/michel/apache-tomcat-8.0.20/lib/jsp-api.jar
D=build/web/WEB-INF/classes
SRC=src/com/michelpm/*.java
mkdir -p $D
javac -cp $JAR_SERVLET:$JAR_JSP -d $D $SRC

if [ $? -eq 1 ]
then
  echo "Fix the errors!" >&2
  exit 1
fi

# Build WAR
pushd build/web
jar -cvf ../$WAR *
popd
