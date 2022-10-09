FROM maven:3.8.2-jdk-11

WORKDIR /KT_TKPM_2_10
COPY . .
RUN mvn clean install

CMD mvn spring-boot:run