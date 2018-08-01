## Legacy code & refactoring - Sprout Method

### 1. Goals

Learn to :
- Add a new functionality into untested code.
- Use the *Sprout method* pattern.

### 2. Steps

- Assumption : Impossible to add tests to the existing code (not enough time, too hard).
- With the provided code, follow these steps :
  - After data validation, add a method call to dispatch user information to a third party application.
  - Do not modify any code outside of this call.
  - Using TDD, code the call to the third party application (using mocks or stubs).
- Information : There is a `main` method within `SecurityManagerTest`.
