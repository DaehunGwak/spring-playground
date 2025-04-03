FROM eclipse-temurin:21-jdk-alpine as build
WORKDIR /workspace/app

# 그래들 관련 파일 복사
COPY gradle gradle
COPY gradlew .
COPY settings.gradle.kts .
COPY build.gradle.kts .

# 그래들 의존성 캐싱을 위한 레이어
RUN ./gradlew dependencies --no-daemon

# 소스 코드 복사
COPY src src

# 애플리케이션 빌드
RUN ./gradlew bootJar --no-daemon

FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

# 보안을 위한 비루트 사용자 추가
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

# 빌드 단계에서 생성된 JAR 파일 복사
COPY --from=build /workspace/app/build/libs/*.jar app.jar

# 컨테이너에서 사용할 포트 노출
EXPOSE 8080

# 애플리케이션 실행
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
