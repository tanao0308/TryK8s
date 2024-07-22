# 使用OpenJDK作为基础镜像
FROM openjdk:17-jdk-slim

# 设置环境变量
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME

# 复制JAR文件到容器中
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# 运行JAR文件
ENTRYPOINT ["java", "-jar", "app.jar"]
