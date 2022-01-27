FROM alpine
WORKDIR /root/desafio-dio-banco
COPY Main.java /root/desafio-dio-banco

RUN apk add openjdk17
ENV JAVA_HOME /usr/lib/jvm/java-17.0.1-openjdk
ENV PATH $PATH:$JAVA_HOME/bin

RUN javac Main.java

ENTRYPOINT java desafio-dio-banco
