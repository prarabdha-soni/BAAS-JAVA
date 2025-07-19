# AI BaaS Platform

A cloud-native, enterprise-grade Backend-as-a-Service for AI startups and enterprises. Inspired by Netflix/Uber architectures and the piomin/sample-spring-microservices-new repo.

## Structure

- **admin-service**: Monitoring and admin UI
- **config-service**: Centralized configuration
- **discovery-service**: Service registry (Eureka/Nacos)
- **gateway-service**: API Gateway
- **user-service**: User management and authentication
- **project-service**: Project/workspace management
- **model-service**: Model registration and management
- **inference-service**: AI inference endpoints
- **vector-service**: Vector DB integration
- **billing-service**: Usage metering and billing
- **notification-service**: Email, SMS, webhooks
- **audit-service**: Audit logs and compliance
- **common**: Shared code, DTOs, security
- **k8s/**: Kubernetes manifests
- **scripts/**: DevOps scripts

## Getting Started

Each service is a Spring Boot microservice. Use Maven to build all modules:

```sh
./mvnw clean install
```

See each service's README for details. # BAAS-JAVA
