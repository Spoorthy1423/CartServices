About:
Our objective is to develop a Spring Boot aplication that functions as a Cart Service, which internally makes API calls to the Fake Store API.
This is a demo project for practicing Spring + Thymeleaf + SpringBoot. The idea was to build some basic cart services.

It was made using Spring Boot, Spring Security, Thymeleaf, Spring Data JPA, Spring Data REST and Docker. Database is in memory H2.

There is a login and registration functionality included.

Users can shop for products. Each user has his own shopping cart (session functionality). Checkout is transactional.
<!-- we need memory h2,src/resources/  -->
Configuration Files
Folder src/resources/ contains config files for shopping-cart Spring Boot application.

src/resources/application.properties - main configuration file. Here it is possible to change admin username/password, as well as change the port number.
Once the app starts, go to the web browser and visit http://localhost:8070/home

HAL REST Browser
Go to the web browser and visit http://localhost:8070/

You will need to be authenticated to be able to see this page.

H2 Database web interface
Go to the web browser and visit http://localhost:8070/h2-console

In field JDBC URL put

jdbc:h2:mem:shopping_cart_db
