#!/bin/bash
dir
cd C:/workspaces/playground/Docker/newbusiness-wildfly
dir
docker run -it --rm -p 8081:8080 newbusiness-wildfly:v1
docker ps
