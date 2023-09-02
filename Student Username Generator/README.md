# User Input and Username Generation

This Java program, consisting of the `Driver` and `Username` classes, allows users to input their first name, last name, and student number. It then generates a unique student username based on the provided information.

## Table of Contents

- [Introduction](#introduction)
- [Usage](#usage)
- [Code Overview](#code-overview)
- [Requirements](#requirements)
- [Contributing](#contributing)

## Introduction

The `Driver` class serves as the main entry point of the program and interacts with the user to gather input. It utilizes the `Username` class to create a student username based on the provided information. The username generation follows specific rules:

- The last character of the first name.
- The first three digits of the student number.
- The first three characters of the last name.

## Usage

To use this program, follow these steps:

1. Clone or download this repository.
2. Compile the Java program using a Java development environment or command-line compiler.
3. Run the compiled program.

Follow the on-screen prompts to enter your first name, last name, and student number. The program will generate and display your student username based on the provided information.

## Code Overview

### `Driver` Class

The `Driver` class interacts with the user, collects input, and generates the student username.

### `Username` Class

The `Username` class encapsulates the logic for creating a student username. It includes the following methods:

- `CreateUsername`: Combines the last character of the first name, the first three digits of the student number, and the first three characters of the last name to create a unique student username.

## Requirements

- Java development environment or JDK installed.

## Contributing

Contributions to this project are welcome. Feel free to submit issues or pull requests.
