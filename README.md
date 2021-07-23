# Linio Challenge

## Print Numbers in CommandLine
./mvnw compile    
./mvnw exec:java -Dexec.mainClass="com.linio.CommanLineApp" 

## SpringBoot App
### Start SpringBoot
./mvnw compile
./mvnw spring-boot:run

### Check RestAPI Print all numbers 0-100 Numbers  
curl -X GET http://localhost:8080/rest/

### Check RestAPI Print one number 
curl -X GET http://localhost:8080/rest/print?number=30