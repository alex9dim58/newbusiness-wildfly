FROM quay.io/wildfly/wildfly:latest-jdk21
#FROM jboss/wildfly
COPY target/newbusiness-wildfly.war /opt/jboss/wildfly/standalone/deployments/
EXPOSE 8081
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0"]
