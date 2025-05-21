# 🧪 Register API Test Automation

This project showcases API test automation using **Java**, **RestAssured**, **Cucumber**, and **Allure Reports**.  
It's built as part of a QA Automation Engineer task to demonstrate test design, code structure, and reporting — even when the API itself is read-only.

---

## 📌 About the API

The `/register` endpoint is a **mock AWS service**:
- No write permission
- Always returns `"Internal server error"`
- The goal is to **demonstrate correct implementation**, not actual success/fail responses.

---

## 🧰 Tech Stack

| Tool         | Purpose                          |
|--------------|----------------------------------|
| Java         | Programming language             |
| RestAssured  | API request automation           |
| Cucumber     | BDD-style test scenarios         |
| JUnit        | Test framework                   |
| Maven        | Dependency & build management    |
| Allure       | Test report generation           |

---

## 🧪 Test Scenarios

Defined in `register.feature`:
- ✅ Successful registration
- ✅ Username already exists
- ✅ Missing parameters
- ✅ Short password
- ✅ Password equals username
- ✅ Confirm password mismatch

Each test sends a POST request and prints the response.

---

## 🚀 How to Run

### 📦 Using Maven (Recommended)

```bash
mvn clean test
