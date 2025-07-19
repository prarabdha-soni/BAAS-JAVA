#!/bin/bash

# Build all services
./mvnw clean install -DskipTests

# List of service directories
services=(
  admin-service
  config-service
  discovery-service
  gateway-service
  user-service
  project-service
  model-service
  inference-service
  vector-service
  billing-service
  notification-service
  audit-service
)

echo "Starting all services..."

for service in "${services[@]}"; do
  (
    cd "$service" || exit
    echo "Starting $service..."
    ../mvnw spring-boot:run > "../$service.log" 2>&1 &
    cd ..
  )
done

echo "All services are starting in the background. Logs are in <service>.log files." 