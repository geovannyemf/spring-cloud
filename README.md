# spring-cloud
To perform project about spring cloud

# Enable to set config repo, avoid use bootstrap deprecated in app properties
spring.config.import=configserver:http://localhost:8888

# Dependency config client to Spring boot 3.x or above https://funcionaenmimaquina.com/aprende-spring-cloud-config-server-en-3-pasos/
<dependency>
  <groupId>org.springframework.cloud</groupId>
  <artifactId>spring-cloud-config-client</artifactId>
  <version>4.0.1</version>
</dependency>


# Spring Gateway
