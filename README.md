# spring-cloud
To perform project about spring cloud

# Enable to set config repo, avoid use bootstrap deprecated in app properties
spring.config.import=configserver:http://localhost:8888

# Dependency config client to Spring boot 3.x or above https://funcionaenmimaquina.com/aprende-spring-cloud-config-server-en-3-pasos/
```
<dependency>
  <groupId>org.springframework.cloud</groupId>
  <artifactId>spring-cloud-config-client</artifactId>
  <version>4.0.1</version>
</dependency>
```

# MariaDB Configurations
```
# Connection to MariaDB
spring.datasource.url=jdbc:mariadb://localhost:3306/usersdb
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=root

# Hibernate
spring.jpa.database-platform=org.hibernate.dialect.MariaDBDialect
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=true
```
# Config connection from STS to Github
https://stackoverflow.com/questions/30421875/cant-connect-to-any-uri-error-while-commiting-code-from-eclipse-to-git-reposito
To resolve this issue, do the followings

login to your GitHub account
go to https://github.com/settings/tokens
click on "Generate new token"
make necessary selections (but must select repo)
click on "save"
System will have a token
use this token instead of a password in the eclipse or other tools you are using
Now push your code from Github and it will work.
