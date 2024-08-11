# RADS
Restaurant API Distributed Systems

1) Setup the Eureka Server

(i) Created "discovery-server" project
(ii) Add "spring-cloud-starter-netflix-eureka-server" dependencies
(iii) Enable the Eureka Server by adding "@EnableEurekaServer" to the main application class.
(iv) Configure application.properties file

2) Setup the Cloud Config Server

(i) Created "config-server" project
(ii) Add "spring-cloud-config-server" dependencies
(iii) Enable the Config Server with "@EnableConfigServer".
(iv) Configure "application.yml"

3) Setup Load Balancing

(i) Created "gateway-server" project
(ii) Add "spring-cloud-starter-netflix-ribbon", "spring-cloud-starter-netflix-zuul" dependencies.
(iii) Configure "application.yml"

4) Added Microservice projects

(i) Created "api-service", "api-orders" project
(ii) Add "spring-cloud-starter-gateway" dependencies.
(iii) Configure property files with Config Server
(iv) Add Controller Classes