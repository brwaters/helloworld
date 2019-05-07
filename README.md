1. Import into IDE and point Gradle to build.gradle.
2. Run `./gradlew bootWar` to generate WAR file.
3. Move into `/usr/local/Cellar/tomcat/9.0.19/libexec/webapps` or wherever you have installed tomcat.
4. Apache Tomcat should automatically reload.
5. Check localhost:8080/greeting to test server is running.
6. Should see JSON object with `Hello, world`.