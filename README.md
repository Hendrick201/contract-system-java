# Contract System Processor

This project was developed to practice **Object-Oriented Programming (OOP)** concepts in Java, following a clean and modular structure.  
It simulates the processing of a contract by splitting its value into monthly installments. Each installment is calculated using:

- **Monthly simple interest**
- **Online payment service fees (PayPal model)**
- **Accurate date handling with LocalDate**

The application was built as a console program to reinforce understanding of OOP architecture, interfaces, dependency injection, exception handling, and service layers.

---

## 🚀 Features

- Read contract data from the console  
- Strict validation of dates, integers, and monetary values  
- Generate monthly installments based on:
  - Simple interest per month  
  - Payment service fee (2%)  
- Apply dependency injection to select the payment service  
- Display an accurate schedule of due dates and final installment values  
- Demonstrate OOP concepts such as:
  - Interfaces  
  - Upcasting  
  - Encapsulation  
  - Responsibility separation  

---

## 🧠 Concepts Practiced

### **Object-Oriented Programming**
- Abstraction  
- Encapsulation  
- Polymorphism  
- Interfaces and implementations  

### **Service Layer Architecture**
- `ContractService` handles business rules  
- `OnlinePaymentService` defines a payment service contract  
- `PaypalService` implements the service logic  

### **Dependency Injection**
The payment service is injected into the contract processor, allowing flexibility and extensibility.

---
## 📦 Project Structure
```
src/
├── application/
│ └── Program.java
├── entities/
│ ├── Contract.java
│ ├── Installment.java
├── entities/services/
│ ├── ContractService.java
│ ├── OnlinePaymentService.java
│ ├── PaypalService.java
```
---

## 🧮 How It Works

1. The user inputs:
   - Contract number  
   - Contract date (`dd/MM/yyyy`)  
   - Contract total value  
   - Number of installments  

2. The system:
   - Splits the total value into equal base amounts  
   - Applies 1% interest per month (simple interest)  
   - Applies a 2% PayPal fee  
   - Calculates each due date using `LocalDate.plusMonths()`  
   - Prints the installment list  

---

## 📊 Example Output
Enter contract data:
Number: 1234
Date (dd/MM/yyyy): 25/06/2018
Contract value: 600.00
Number of installments: 3

INSTALLMENTS:
2018-07-25 - 206.04
2018-08-25 - 208.08
2018-09-25 - 210.12


---

## 🛠️ Technologies Used

- Java 17+
- Java Time API (LocalDate, DateTimeFormatter)
- Eclipse IDE
- Git version control

---

## 📘 Purpose

This project was developed as part of my Java studies and inspired by exercises from professor Nelio Alves.  
It serves as a demonstration of good OOP practices, clean architecture, and real-world financial calculations.

---

## 📄 License

This project is open-source under the MIT License.


