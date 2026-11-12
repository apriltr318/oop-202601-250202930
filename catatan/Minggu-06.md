# Catatan Minggu 6: UML dan SOLID

## Yang saya kerjakan

Pada minggu keenam, saya mengerjakan dokumentasi UML dan mempelajari prinsip SOLID pada project Aset-Pinjam. Saya membuat Class Diagram untuk menunjukkan susunan kelas, atribut, method, serta hubungan antar kelas yang ada di dalam program.

Selanjutnya, saya membuat Sequence Diagram yang menjelaskan proses pengajuan peminjaman. Diagram tersebut memiliki dua kondisi, yaitu ketika pengajuan berhasil dan ketika pengajuan ditolak karena jadwal peminjaman bentrok. Saya juga membuat penjelasan mengenai dua prinsip SOLID, yaitu Open/Closed Principle (OCP) dan Dependency Inversion Principle (DIP).

Setelah selesai, saya menjalankan pengujian menggunakan perintah `.\scripts\uji.ps1 6`. Hasilnya, seluruh 35 pengujian berhasil dijalankan tanpa ada yang gagal.

## Keputusan desain

Saya memilih OCP dan DIP karena kedua prinsip tersebut dapat ditemukan pada struktur kode project Aset-Pinjam.

Penerapan OCP dapat dilihat pada interface `AturanDenda` yang digunakan oleh kelas `DendaFlat` dan `DendaProgresif`. Dengan adanya interface tersebut, aturan denda baru bisa ditambahkan melalui kelas lain tanpa perlu mengubah struktur yang sudah ada.

Sementara itu, penerapan DIP dapat dilihat pada kelas `JdbcPeminjamanDAO` yang menggunakan interface `AsetDAO` sebagai ketergantungan. Hal ini membuat kelas tersebut tidak bergantung langsung pada satu implementasi tertentu.

Untuk Sequence Diagram, saya menggambarkan proses pengajuan peminjaman berdasarkan dua kemungkinan, yaitu jadwal tidak bentrok dan jadwal mengalami bentrok. Alur tersebut masih berupa rancangan karena method `ajukan()` dan `bentrok()` belum selesai diimplementasikan.

## Kendala

Kesulitan yang saya alami adalah menentukan hubungan antar kelas yang tepat saat membuat Class Diagram. Saya juga sempat mengalami kesulitan memahami penggunaan Sequence Diagram, terutama bagian `alt` untuk menggambarkan kondisi yang berbeda.

Untuk mengatasinya, saya memeriksa kembali kode Java dan aturan bisnis yang sudah tersedia. Saya juga menggunakan ekstensi Mermaid Editor di VS Code agar lebih mudah melihat dan memeriksa diagram yang dibuat.

## Penggunaan AI

- **Alat yang dipakai:** ChatGPT dan Mermaid Editor di VS Code.
- **Bagian yang dibantu AI:** Membantu memahami struktur UML, menyusun Class Diagram dan Sequence Diagram, serta mencari contoh penerapan prinsip OCP dan DIP.
- **Prompt utama:**
  1. "Bantu saya mengerjakan tugas OOP minggu 6 sesuai dengan panduan yang diberikan."
  2. "Bantu membuat Class Diagram berdasarkan struktur kode Java pada project Aset-Pinjam."
  3. "Bantu membuat Sequence Diagram proses pengajuan peminjaman dengan kondisi berhasil dan bentrok."
- **Yang saya ubah atau tolak dari saran AI, dan alasannya:** Saya menyesuaikan isi diagram dengan kode program yang sudah tersedia agar hubungan dan alur yang ditampilkan sesuai dengan kondisi project saat ini.
- **Satu hal yang saya pahami lebih baik sekarang:** Saya lebih memahami cara membuat diagram UML untuk menggambarkan struktur dan alur program. Saya juga mulai memahami bagaimana prinsip OCP dan DIP dapat membantu membuat kode program lebih mudah dikembangkan dan dikelola.