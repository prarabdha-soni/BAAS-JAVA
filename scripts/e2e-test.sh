#!/bin/bash

services=(
  user-service:9001
  project-service:9002
  model-service:9003
  inference-service:9004
  vector-service:9005
  billing-service:9006
  notification-service:9007
  audit-service:9008
  admin-service:9000
  config-service:8888
  discovery-service:8761
  gateway-service:8080
)

for svc in "${services[@]}"; do
  name=${svc%%:*}
  port=${svc##*:}
  echo -n "Checking $name (http://localhost:$port/actuator/health): "
  curl -s http://localhost:$port/actuator/health | grep -q 'UP' && echo "UP" || echo "DOWN"
done 