# Identify Courses

## Overview
Identify Courses is a Java Selenium automation project that automates the Coursera website to search for beginner-level Web Development courses offered in English. The application extracts the first two course names, their total duration, and ratings. It also retrieves all available languages and proficiency levels with their respective counts. Additionally, the project validates error handling by capturing error messages for invalid search inputs.

## Features
- Search for beginner-level Web Development courses.
- Filter courses available in English.
- Display the first two course names.
- Extract course duration and ratings.
- List all available languages and their total count.
- List all proficiency levels and their total count.
- Capture error messages for invalid search input.

## Technologies Used
- Java
- Selenium WebDriver
- TestNG
- Apache POI (for Excel data handling)
- Eclipse IDE
- ChromeDriver

## Project Structure
- `src/test/java` – Selenium automation test scripts
- `testData` – Excel input files
- `screenshots` – Test execution screenshots (if included)
- `reports` – Automation execution reports (if included)
- `pom.xml` – Maven project dependencies
- `testng.xml` – TestNG suite configuration

## How to Run
1. Clone this repository.
2. Open the project in Eclipse.
3. Update the project dependencies.
4. Ensure Google Chrome and the correct ChromeDriver are installed.
5. Run the TestNG suite to execute the automation.

## Expected Output
- Displays the first two beginner-level Web Development courses.
- Displays each course's duration and rating.
- Lists available languages and proficiency levels with their counts.
- Captures and displays an error message for invalid input.

## Author
**Malleswari Gangulappa**
