#!/bin/bash
cp ../target/newbusiness-wildfly.war .
docker build -t newbusiness-wildfly:v1 .
read -rsp $'Press enter to continue...\n'
