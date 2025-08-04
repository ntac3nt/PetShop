# 🐾 Pet Shop Management App

> Bài tập lớn môn Lập trình Hướng đối tượng (OOP) - Java Swing

---

## 📌 Giới thiệu

Ứng dụng quản lý thú cưng được xây dựng bằng Java và thư viện giao diện Swing. Ứng dụng cho phép người dùng thực hiện các chức năng cơ bản để quản lý thông tin các loại thú cưng như **Chó**, **Mèo**, **Hamster**, bao gồm:

- Thêm thú cưng
- Hiển thị danh sách
- Tìm kiếm theo tên hoặc ID
- Sửa thông tin thú cưng
- Xóa thú cưng
- Lưu / đọc dữ liệu từ file
- [Có thể mở rộng thêm: đăng nhập, phân quyền, thống kê,...]

---

## 🧰 Công nghệ sử dụng

- Java 8+
- Swing GUI
- OOP Design (Lớp cha `Pet`, lớp con `Cat`, `Dog`, `Hamster`)
- Serialization (`ObjectOutputStream` / `ObjectInputStream`)

---

## 📁 Cấu trúc thư mục

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
