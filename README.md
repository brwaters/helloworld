1. Import into IDE. It should recognize it is a Gradle based Project.
2. Run `./gradlew runBoot` to compile applet that Tomcat will automatically deploy (still figuring out how and where).
3. Check localhost:8080 or localhost:8080/greeting or localhost:8080/index.html.
4. Should see JSON object with `Hello, world` when reaching /greeting.

//** Trying to figure out Gradle Scripting language as current scripts are hard to follow and contain deprecated code.
Presumably we want separate WAR files for client side, and API code.

TO-DO:
- Be able to build separate WAR files
- Create a test index page with React components and render information from an API model.
- Query a PostgreSQL and render.
