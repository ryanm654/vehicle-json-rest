# vehicle-json-rest

REST interface for my earlier coding task vehicle-json

## To Build
From base directory run 'mvn package'. Maven must be installed for this to build so the latest target jar has been included

## To Run
From base directory:
```bash
java -jar target/vehicle-json-rest-1.0.0.jar
```

By default the service will launch on localhost:8080.

## Current endpoints
1. /ex1: Runs and returns the result of the first exercise, printing in ascending order of price
2. /ex2: Runs and returns the result of the second exercise, printing the spec of each vehicle
3. /ex3: Runs and returns the result of the third exercise, printing the highest rated supplier per car type
4. /ex4: Runs and returns the result of the third exercise, printing the highest scoring vehicles in descending order
