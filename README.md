# Graduation Project - Automated Testing Framework

This repository contains an advanced automated testing framework for an e-commerce website using Selenium, TestNG, and Cucumber. It includes complete test coverage for core functionalities such as Registration, Login, Cart, Wishlist, and Contact Us.

*Live Demo Site:*  
[https://demo.opencart.com.gr/index.php?route=common/home](https://demo.opencart.com.gr/index.php?route=common/home)

---

## *Table of Contents*
- [Project Structure](#project-structure)
- [Technologies Used](#technologies-used)
- [Tested Features](#tested-features)
- [Failure Handling](#failure-handling)
- [Reporting](#reporting)
  - [Allure Report](#1-allure-report)
  - [Manual Reports](#2-test-cases--bugs-report)
- [Screenshots](#screenshots)
- [How to Run](#how-to-run)
- [Author](#author)
- [License](#license)

---

## *Project Structure*

GraduationProject/ ├── src/                       # Source code ├── screenshots/               # Failure screenshots ├── allure-results/            # Raw Allure data ├── allure-report/             # Generated Allure reports ├── reports/                   # TestCasesReport.xlsx & BugsReport.xlsx ├── pom.xml                    # Maven build file ├── .gitignore └── README.md

---

## *Technologies Used*
- *Java 17+*
- *Selenium WebDriver*
- *TestNG*
- *Cucumber (BDD with Gherkin)*
- *Allure Reporting*
- *Maven (Build & Dependency Manager)*

---

## *Tested Features*

| Feature             | Status  | Framework   | Screenshot on Fail    | Cucumber Used    |
|---------------------|---------|-------------|-----------------------|----------------- |
| *Registration*      | ✅ Done | TestNG      | ✅                   | ❌              |
| *Login*             | ✅ Done | Cucumber    | ✅                   | ✅              |
| *Add to Cart*       | ✅ Done | TestNG      | ✅                   | ❌              |
| *Add to Wishlist*   | ✅ Done | TestNG      | ✅                   | ❌              |
| *Contact Us*        | ✅ Done | TestNG      | ✅                   | ❌              |

---

## *Failure Handling*
Whenever a test fails, a screenshot is automatically captured and stored in the screenshots/ directory. The file is named with the test case name and a timestamp for easy reference.

---

## *Reporting*

### 1. *Allure Report*
Allure provides an interactive report with:
- Full test step breakdown
- Visual representation of passed/failed cases
- Integrated screenshots for failed tests

*To generate Allure Report:*
```bash
mvn clean test
allure serve allure-results

Sample Preview:





---

2. Test Cases & Bugs Report

Manual documents stored in the reports/ folder:

Download Test Cases Report

Download Bugs Report


Each Excel file includes:

Description of the test/bug

Steps to reproduce

Expected vs Actual results

Severity & Priority



---

Screenshots

Failure screenshots are saved automatically. Sample:

Test	Screenshot

Registration	
Add to Cart	



---

How to Run

Clone & Navigate:

git clone https://github.com/Ahmed-Gio6/GraduationProject2.git
cd GraduationProject/GraduationProject

Run Tests:

mvn clean test

View Report:

allure serve allure-results


---

Author

Ahmed Saad
22 y/o - Embedded Systems & Automation Engineer
Menoufia University
Instructor at Ischool
Embedded Software at Redcon Sreel
Graduate of ITI & Samsung Innovation Campus

> LinkedIn | Email | [Phone: 01127091832]




---

License

This project is intended for academic and educational purposes only.


