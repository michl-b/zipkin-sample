# zipkin-sample
Zipkin Sample with Spring Boot, Eureka, Docker &amp; Zipkin

## run environment
```bash
docker-compose -d up
```
is running following:
- mysql DB as storage
- Zipkin Server
- Zipkin UI
- Eureka Server for Service Dicovery

## rest-service
is a Restful Spring Boot Service with a simple API /api/test/ping

## rest-client
is a simple Spring Boot App which is using the API of rest-service via Feign Interface
