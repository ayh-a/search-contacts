# Contact Search
This is a simple program that simulates the search function for a contact phonebook. Created with MongoDB, Spring Boot, and vanilla JS.

## Running the program locally
The following dependancies are required:

**Node.js**
**Java 17+**
**Maven** (Can also use maven wrapper)

## **Frontend setup**
**Navigate to the frontend directory**:
```
cd frontend
```
**Install Dependencies**:
```
npm install
```

**Start server (port 5500)**:
```
npm run dev
```

**Navigate to port on browser**:
* http://localhost:5500

## **Backend Setup**
* Note: use mvnw instead of mvn if using maven wrapper
**Navigate to backend directory**:
```
cd Assignment1
```

**Build Project with Maven**
```
mvn clean install
```

**Run Spring boot application**
```
mvn spring-boot:run
```

## TODO
***
* Fuzzy matching
* caching
* real time search results
* loading
* order objects