# Test Automation Project

## Project Description

This project is an example of web test automation using **Selenium**, **JUnit 5**, **Page Object Model (POM)**, and **WebDriverManager** by Boni Garcia. The project covers the automation of the login process on a sample website and follows good design practices such as Page Factory and base class inheritance.

## Technologies Used

- **Java 21**
- **Maven**
- **JUnit 5**
- **Selenium WebDriver**
- **WebDriverManager**
- **Page Object Model (POM)**

## Setup Instructions

### Step 1: Clone the Repository

```bash
git clone https://github.com/sosnovvski/interview-task.git
```

### Step 2: Add Dependencies

The project uses Maven for dependency management. All required dependencies are listed in the `pom.xml` file:

```xml
<dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.25.0</version>
    </dependency>
    <dependency>
        <groupId>io.github.bonigarcia</groupId>
        <artifactId>webdrivermanager</artifactId>
        <version>5.9.2</version>
    </dependency>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>5.8.2</version>
    </dependency>
</dependencies>
```

### Step 3: Run the Tests

To run the tests, use the following command:

```bash
mvn test
```

## Usage

### Adding New Tests

1. Create a new class in the `src/main/java/pages` folder to add a new page using the Page Object Model pattern.
2. Create a corresponding test class in the `src/test/java/tests` folder.
3. Inherit from the `BasePage` class to get access to `WebDriver` and `WebDriverWait`.

### Sample Test Code (`LoginTest.java`)

```java
@Test
public void testLogin() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.login("test01@example.com", "pass123");

    String actualMessage = loginPage.getSuccessMessage();
    assertEquals("Login successful", actualMessage, "Login attempt was unsuccessful.");
}
```

## Authors

- **Kamil Sosnowski** - [GitHub Profile](https://github.com/sosnovvski)

## Support

If you have any questions or issues, open a new `Issue` on this repository or contact me directly via email: [kamsosnows@gmail.com](mailto:your.email@example.com).
