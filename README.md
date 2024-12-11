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
spring.jpa.show-sql=true```
