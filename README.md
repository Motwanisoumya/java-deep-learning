# JUnit Assertion Tests

This folder contains sample unit tests using JUnit for basic assertion methods in Java.

---

## Files

### 1. `AssertionsTest.java`

- Contains a test class `AssertionsTest` with a single test method `testAssertions()`.
- Demonstrates the use of various JUnit assertions:
  - `assertEquals` for checking equality.
  - `assertTrue` and `assertFalse` for boolean conditions.
  - `assertNull` and `assertNotNull` for null checks.

**Example:**
```java
@Test
public void testAssertions() {
    assertEquals("Addition failed", 5, 2 + 3);
    assertTrue("Condition should be true", 10 > 1);
    assertFalse("Condition should be false", 2 > 3);
    assertNull("Expected null", null);
    assertNotNull("Expected non-null", new Object());
}
```

### 2. `Test.java`

- A placeholder annotation file for `@Test`.
- In real projects, use the JUnit library's `@Test` annotation.

---

## Running the Tests

- The tests can be run using a Java test runner (such as the VS Code Test Runner for Java).
- The test results will show whether all assertions pass.

---

## Sample Test Output

Below is a screenshot showing the test results in VS Code:

![Test Results](![alt text](image.png))

> Save the pasted image as `test-results.png` in this folder for it to display here.

---
----------------------------------------------------------------------------------------------------------------------
# JUnit Assertion Tests

This folder contains sample unit tests using JUnit for basic assertion methods in Java.

---

## Files

### 1. `AssertionsTest.java`

- Contains a test class `AssertionsTest` with a single test method `testAssertions()`.
- Demonstrates the use of various JUnit assertions:
  - `assertEquals` for checking equality.
  - `assertTrue` and `assertFalse` for boolean conditions.
  - `assertNull` and `assertNotNull` for null checks.

**Example:**
```java
@Test
public void testAssertions() {
    assertEquals("Addition failed", 5, 2 + 3);
    assertTrue("Condition should be true", 10 > 1);
    assertFalse("Condition should be false", 2 > 3);
    assertNull("Expected null", null);
    assertNotNull("Expected non-null", new Object());
}
```

---

### 2. `CalculatorTest.java` (AAA Pattern Example)

- Contains unit tests for the `Calculator` class.
- Demonstrates the **AAA (Arrange-Act-Assert)** pattern, a common structure for writing clear and maintainable tests:
  - **Arrange:** Set up the objects and prepare the prerequisites for your test.
  - **Act:** Perform the actual work (call the method under test).
  - **Assert:** Check that the result is as expected.

**Example:**
```java
@Test
public void testAddition() {
    // Arrange
    int a = 5;
    int b = 3;

    // Act
    int result = calculator.add(a, b);

    // Assert
    assertEquals(8, result);
}
```
- The `CalculatorTest` class also uses `@Before` and `@After` to set up and tear down the test environment for each test method.

---

### 3. `Test.java`

- A placeholder annotation file for `@Test`.
- In real projects, use the JUnit library's `@Test` annotation.

---

## Running the Tests

- The tests can be run using a Java test runner (such as the VS Code Test Runner for Java).
- The test results will show whether all assertions pass.

---

## Sample Test Output

Below is a screenshot showing the test results in VS Code:

![Test Results](![alt text](image-1.png))

> Save the pasted image as `test-results.png` in this folder for it to display
------------------------------------------------------------------------------------------------------------
# JUnit Assertion Tests

This folder contains sample unit tests using JUnit for basic assertion methods in Java.

---

## Files

### 1. `AssertionsTest.java`

- Contains a test class `AssertionsTest` with a single test method `testAssertions()`.
- Demonstrates the use of various JUnit assertions:
  - `assertEquals` for checking equality.
  - `assertTrue` and `assertFalse` for boolean conditions.
  - `assertNull` and `assertNotNull` for null checks.

**Example:**
```java
@Test
public void testAssertions() {
    assertEquals("Addition failed", 5, 2 + 3);
    assertTrue("Condition should be true", 10 > 1);
    assertFalse("Condition should be false", 2 > 3);
    assertNull("Expected null", null);
    assertNotNull("Expected non-null", new Object());
}
```

---

### 2. `CalculatorTest.java` (AAA Pattern Example)

- Contains unit tests for the `Calculator` class.
- Demonstrates the **AAA (Arrange-Act-Assert)** pattern, a common structure for writing clear and maintainable tests:
  - **Arrange:** Set up the objects and prepare the prerequisites for your test.
  - **Act:** Perform the actual work (call the method under test).
  - **Assert:** Check that the result is as expected.

**Example:**
```java
@Test
public void testAddition() {
    // Arrange
    int a = 5;
    int b = 3;

    // Act
    int result = calculator.add(a, b);

    // Assert
    assertEquals(8, result);
}
```
- The `CalculatorTest` class also uses `@Before` and `@After` to set up and tear down the test environment for each test method.

---

### 3. `MyServiceTest.java` (Service Layer Test with Mocking)

- Contains a unit test for the `MyService` class, which depends on an external API (`ExternalApi`).
- Uses **Mockito** to mock the external dependency, allowing you to test the service logic in isolation.
- Demonstrates how to use dependency injection and mocking in unit tests.

**Example:**
```java
@Test
public void testFetchDataReturnsApiData() {
    // Arrange: create a mock ExternalApi
    ExternalApi mockApi = mock(ExternalApi.class);
    when(mockApi.getData()).thenReturn("mocked data");

    MyService service = new MyService(mockApi);

    // Act
    String result = service.fetchData();

    // Assert
    assertEquals("mocked data", result);
}
```
- This approach ensures your service logic is tested without making real API calls, making tests fast and reliable.

---

### 4. `Test.java`

- A placeholder annotation file for `@Test`.
- In real projects, use the JUnit library's `@Test` annotation.

---

## Running the Tests

- The tests can be run using a Java test runner (such as the VS Code Test Runner for Java).
- The test results will show whether all assertions pass.

---

## Sample Test Output

Below is a screenshot showing the test results in VS Code:

![Test Results](![alt text](image-2.png))

> Save your screenshot as `test-results.png` in this folder for it to display here.