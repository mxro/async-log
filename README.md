# Async Log

[Async Log](https://github.com/mxro/async-log) is a minimal implementation for asynchronous logging in Java.

## Usage

### Log a Text Entry

```java
PropertyNode logs = Logs.create();

logs.record(Logs.entry("log1", "entry 1"));
logs.record(Logs.entry("log1", "entry 2"));
``` 

### Retrieving Logged Entries

The log written in the previous example can be retrieved as follows:

```java
String log1 = logs.retrieve("log1", StringLog.class).get().toString();

System.out.println(log1);

logs.stop().get();
```

**Note**: Before the application terminates `logs.stop().get();' should always be called to ascertain that
the thread used by the logging node is released.

### Preventing Log from Overflowing

### Maven Dependency

```xml
<dependency>
    <groupId>de.mxro.async.log</groupId>
	<artifactId>async-log</artifactId>
	<version>[latest version]</version>
</dependency>
```

Find latest version [here](http://modules.appjangle.com/lightweight-java-metrics/latest/project-summary.html).

Add repository if required:

```xml
<repositories>
	<repository>
		<id>Appjangle Releases</id>
		<url>http://maven.appjangle.com/appjangle/releases</url>
	</repository>
</repositories>
```

## Compatibility

This project is compatible with the following environments:

- Java 1.6+
- GWT 2.5.0+
- Android (any)
- OSGi (any)

## Further Resources

- [JavaDocs](http://modules.appjangle.com/async-log/latest/apidocs/)
- [Project Reports](http://modules.appjangle.com/async-log/latest/project-reports.html)
- [Rendered README](http://documentup.com/mxro/async-log)
- [ReadTheDocs](http://async-log.rtfd.org/)

[![Documentation Status](https://readthedocs.org/projects/async-log/badge/?version=latest)](https://readthedocs.org/projects/async-log/?badge=latest)
  

