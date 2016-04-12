FROM tomcat:9.0
COPY ./target/cis.war $CATALINA_HOME/webapps