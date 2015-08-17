#!/usr/bin/env bash

export CATALINA_HOME=/home/michel/apache-tomcat-8.0.20

PATHNAME=hello
WAR=build/hello.war

cp $WAR $CATALINA_HOME/webapps/$PATHNAME.war
( xdg-open http://localhost:8080/$PATHNAME >/dev/null ) &
