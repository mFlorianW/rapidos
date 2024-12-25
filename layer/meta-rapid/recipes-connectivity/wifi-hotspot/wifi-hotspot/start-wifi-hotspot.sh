#!/bin/bash
SSID="Rapid-Laptimer"
PASSWORD="rapid-laptimer"
RETRIES=5
DELAY=5

for i in $(seq 1 $RETRIES); do
    output=$(connmanctl tether wifi on "$SSID" "$PASSWORD" 2>&1)
    if echo "$output" | grep -q "Not supported"; then
        echo "Attempt $i failed. Retrying in $DELAY seconds..."
        sleep $DELAY
    else
        exit 0
    fi
done

echo "Wi-Fi hotspot failed after $RETRIES attempts."
exit 1
