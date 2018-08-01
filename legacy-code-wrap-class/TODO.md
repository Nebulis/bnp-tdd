## Legacy code & refactoring - Wrap Class

### 1. Goals

Learn to :
- Add new functionalities into untested code.
- Use the *Wrap class* pattern.

### 2. Steps

- Assumption : Impossible to had tests to the existing code (not enough time, too hard).
- With the provided code, follow these steps :
  - Create a new class or method for the new functionality.
  - Do not modify any existing code.
  - Using TDD, code the call to the third party application (using mocks or stubs).
- Information : There is a `main` method within `SecurityManagerTest`.
- Context : the method to extend is an instance method (non static method).
