FROM alibabadragonwell/dragonwell:17-anolis

WORKDIR /iddm-demo

ARG JAR_FILE=target/iddm-demo.jar

COPY ${JAR_FILE} app.jar

EXPOSE 7001

ENV TZ=Asia/Shanghai JAVA_OPTS="-Xms128m -Xmx256m -Djava.security.egd=file:/dev/./urandom"

CMD sleep 60; java $JAVA_OPTS -jar app.jar
