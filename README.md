# 🐾 Pet Shop Management Application

> Final Project for Object-Oriented Programming Course - Java Swing GUI

---

## 📌 Introduction

This is a desktop application developed using Java Swing to manage pets in a pet shop. The application supports basic CRUD functionalities, allowing users to:

- Add new pets
- Display all pets
- Search pets by ID or name
- Edit pet information
- Delete pets
- Save and load pet data from file
- *(Optional: login, statistics, reports, etc.)*

---

## 🧰 Technologies Used

- Java 8 or later
- Java Swing (GUI)
- Object-Oriented Programming (Inheritance, Polymorphism)
- Java Serialization (`ObjectOutputStream` / `ObjectInputStream`)

---

## 📁 Project Structure



```plaintext
petshop/
│
├── models/
│   ├── Pet.java
│   ├── Cat.java
│   ├── Dog.java
│   └── Hamster.java
│
├── controller/
│   ├── FrPetShop.java       // Giao diện chính
│   ├── FindInfo.java        // Giao diện tìm kiếm
│   ├── EditPetForm.java     // Giao diện sửa
│   └── LoginForm.java       // (Nếu có chức năng đăng nhập)
│
├── pets.dat                 // File lưu dữ liệu nhị phân
├── README.md
└── ...

## 🚀 How to Run the Application

### ✅ Option 1: Using an IDE (recommended)

1. Open the project in **NetBeans**, **IntelliJ IDEA**, or any Java IDE.
2. Locate and run the file: `FrPetShop.java` inside the `controller` package.
3. The main window will appear. You can now:
   - Add new pets
   - Save or load data from `pets.dat`
   - Search, edit, or delete pets
   - View pet list in a table

### ✅ Option 2: Compile and run from terminal

```bash
# Navigate to project directory
cd petshop

# Compile all classes (adjust if needed)
javac -d bin src/models/*.java src/controller/*.java

# Run the main GUI
java -cp bin controller.FrPetShop


### 🖼️ Screenshots

**Main Window**

![Main](https://github.com/ntac3nt/PetShop/blob/main/images/ps1.png)

**Display Pet Form**

![Display](https://github.com/ntac3nt/PetShop/blob/main/images/ps2.png)

**Search Result**

![Search](https://github.com/ntac3nt/PetShop/blob/main/images/ps3.png)