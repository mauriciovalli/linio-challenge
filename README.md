[![CircleCI](https://circleci.com/gh/mauriciovalli/linio-challenge.svg?style=shield&circle-token=f546068af510735a08f43ba5fdb318d7458d12a3)](https://circleci.com/gh/mauriciovalli/linio-challenge)

# Linio Challenge

## Environment

### Requirements
- Java 8 or 11

### Installation and Test
1. Download or clone the repository
2. Compile
```
    ./mvnw clean compile    
```
3. Print Numbers to CommandLine
```
    ./mvnw exec:java -Dexec.mainClass="com.linio.CommanLineApp" 
```
4. Run SpringBoot App
```
    ./mvnw spring-boot:run
```
5. Test RestAPI Numbers 1-100
```
    curl -X GET http://localhost:8080/rest/
```
6. Test RestAPI one number
```
    curl -X GET http://localhost:8080/rest/print?number=30
```
7. Print numbers on webpage
```
    http://localhost:8080/print
```

### JUnit tests
1. Run the JUnit tests
```
    ./mvnw test
```

### Online Test

This project is deploy in Okteto Cloud with Kubernetes

1. Test RestAPI Numbers 1-100
```
    curl -X GET https://linio-challenge-mauriciovalli.cloud.okteto.net/rest/
```
2. Test RestAPI one number
```
    curl -X GET https://linio-challenge-mauriciovalli.cloud.okteto.net/rest/print?number=30
```
3. Print numbers on webpage
```
    https://linio-challenge-mauriciovalli.cloud.okteto.net/print
```

### Postman

You can use postman project for test
- Export file ./Linio.postman_collection.json