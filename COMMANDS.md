curl -F file=@cat.mp4 -F start=0 -F end=0 -F speed=1 -F repeat=0 localhost:8080/upload

mvn clean package

java -jar just-gif-it-0.0.1-SNAPSHOT.jar --debug

