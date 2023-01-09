FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG DEPENDENCY=target/dependency
ENTRYPOINT ["java","-cp","app:app/lib/*","LmtClientApplication.java"]