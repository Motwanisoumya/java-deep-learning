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