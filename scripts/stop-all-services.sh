#!/bin/bash

echo "Stopping all Spring Boot microservices..."

# Find and kill all 'spring-boot:run' processes started by Maven
PIDS=$(ps aux | grep '[m]vnw spring-boot:run' | awk '{print $2}')

if [ -z "$PIDS" ]; then
  echo "No running Spring Boot services found."
else
  echo "Killing the following PIDs: $PIDS"
  kill $PIDS
  echo "All services stopped."
fi 