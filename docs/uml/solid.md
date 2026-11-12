# Penerapan Prinsip SOLID pada Sistem Aset-Pinjam

## 1. Open/Closed Principle (OCP)

Prinsip Open/Closed Principle terlihat pada interface `AturanDenda` yang memiliki method `hitung()`. Interface ini diimplementasikan oleh kelas `DendaFlat` dan `DendaProgresif`. Dengan adanya interface tersebut, sistem dapat memiliki beberapa jenis perhitungan denda. Jika nantinya ingin menambahkan aturan denda baru, kita cukup membuat kelas baru yang mengimplementasikan `AturanDenda` tanpa harus mengubah interface yang sudah ada. Kelas `LayananDenda` juga dirancang untuk menerima `AturanDenda`, tetapi implementasinya masih dalam tahap TODO Minggu 10.

## 2. Dependency Inversion Principle (DIP)

Prinsip Dependency Inversion Principle dapat dilihat pada kelas `JdbcPeminjamanDAO`. Kelas ini menggunakan interface `AsetDAO` sebagai parameter pada konstruktornya, bukan langsung bergantung pada kelas konkret `JdbcAsetDAO`. Selain itu, kelas tersebut menerima `Supplier<Connection>` melalui konstruktor. Dengan cara ini, ketergantungan terhadap implementasi tertentu menjadi lebih rendah. Penggunaan interface juga memudahkan pengujian karena implementasi pengganti dapat diberikan saat pengujian. Namun, method operasi database pada DAO masih dalam tahap TODO Minggu 11.