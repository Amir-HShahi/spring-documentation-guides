# Quotation

An application that uses Spring’s RestTemplate to retrieve a random Spring Boot quotation every five seconds from
another [REASTful API](https://github.com/spring-guides/quoters)

```java
RestTemplate restTemplate = (new RestTemplateBuilder()).build();
```