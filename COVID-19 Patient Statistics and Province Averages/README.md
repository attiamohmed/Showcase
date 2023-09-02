# COVID-19 Statistics Calculator

This Java program calculates the average number of COVID-19 patients in different provinces based on provided data. It also displays patient data in a tabular format and calculates the total number of recovered patients for each month.

## Table of Contents

- [Introduction](#introduction)
- [Usage](#usage)
- [Code Overview](#code-overview)
- [Requirements](#requirements)
- [Contributing](#contributing)

## Introduction

The `CovidStatistics` class in this program provides functionality to calculate the average number of COVID-19 patients in a specific province using a 2D array of patient data. Additionally, it displays patient data for each province and calculates the average number of patients for each province.

## Usage

To use this program, follow these steps:

1. Clone or download this repository.
2. Compile the Java program using a Java development environment or command-line compiler.
3. Run the compiled program.

You can customize the patient data and province names in the `main` method to analyze different datasets.

## Code Overview

The program consists of two main parts:

1. `aveByProvince` Method:
   - Calculates the average number of patients in a specified province based on the 2D array of patient data.
   - Parameters:
     - `patients`: A 2D array representing the number of patients on each day and in each province.
     - `R`: The province's index for which the average will be determined.

2. `main` Method:
   - Initializes patient information over several months for various provinces.
   - Displays patient data in a table format, including the average number of patients for each province.
   - Calculates and displays the total number of recovered patients for each month.

## Requirements

- Java development environment or JDK installed.

## Contributing

Contributions to this project are welcome. Feel free to submit issues or pull requests.

