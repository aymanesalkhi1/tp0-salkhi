# Jakarta EE conversation app

Web application for a guided conversation. The page is Facelets and PrimeFaces, the logic sits in a JSF backing bean, and a Jakarta servlet answers on `/hello-servlet`.

Java 17, Jakarta EE 10, PrimeFaces 13, packaged as a WAR.

## Build

```bash
./mvnw package
```

Deploy the WAR on a Jakarta EE 10 server such as Payara or WildFly.
