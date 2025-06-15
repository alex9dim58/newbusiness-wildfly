#!/bin/bash
cd C:/workspaces/playground/Docker/newbusiness-wildfly/target/newbusiness-wildfly .
docker build -t newbusiness-wildfly:v1 .
read -rsp $'Press enter to continue...\n'
