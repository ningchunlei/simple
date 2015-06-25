#!/bin/sh

### create database #####

### create database #####
mysqladmin -u root --password=mysqlniutest -f drop test;
mysql -u root --password=mysqlniutest < backend/src/main/resources/sql/simple.sql

find ./  -name "pom.xml" -exec sed -i "s/<version>\${business-simple-version}/<version>$1/g" {} \;

mvn -U -Dversion=$1 -Dspring.profiles.active=build clean deploy
