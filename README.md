# Java Echo Server

This project implements a simple Echo Server in Java using the `java.net` package. The server listens for incoming client connections and echoes back any received messages. The project utilizes several modern Java libraries and tools to streamline development and ensure code quality, such as Lombok for code generation, JCommander for argument parsing, SLF4J for logging, JUnit 5 for testing, and Mockito for mocking.

## Features

- **Echo Server**: Implements a TCP server that listens on a configurable port and echoes client messages.
- **Boilerplate Code Generation**: Uses Lombok to eliminate boilerplate code (getters, setters, etc.).
- **Command-line Argument Parsing**: Uses JCommander for easy parsing of command-line arguments like port configuration.
- **Logging**: SLF4J is used for logging server activities, errors, and client communication.
- **Unit Testing**: JUnit 5 is used for writing unit tests, with Mockito for mocking dependencies in tests.
- **Gradle Build**: Uses Gradle with Kotlin DSL to manage dependencies, compile the code, and run tests.
- **Fat JAR Generation**: Customized Gradle build to create a fat JAR for easy deployment and execution.

## Getting Started

### Prerequisites

To build and run the project, you need the following software installed:

- Java 11 or later
- Gradle
- Git

### Clone the Repository

git clone https://github.com/yourusername/echo-server.git
cd echo-server
