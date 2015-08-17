#!/usr/bin/env bash

export JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk-amd64
export PATH=$JAVA_HOME/bin:$PATH
export CATALINA_HOME=/home/michel/apache-tomcat-8.0.20

PID=$(ps -fe | grep apache-tomcat-8\\.0\\.20 | tr -s " "|cut -d" " -f2)
if [ -n "$PID" ]
then
  echo -e "\e[00;32mTomcat is already running (pid: $PID)\e[00m"
else
  echo -e "\e[00;32mStarting tomcat\e[00m"
  sh $CATALINA_HOME/bin/startup.sh
fi
