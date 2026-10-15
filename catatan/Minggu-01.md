# Catatan Minggu 01: Paradigma Pemrograman dan Setup

## Yang saya kerjakan

Pada minggu pertama, saya mengerjakan program sederhana Aset-Pinjam menggunakan tiga paradigma pemrograman, yaitu prosedural, Object-Oriented Programming (OOP), dan fungsional. Pada paradigma prosedural, saya menggunakan metode `sapa()` untuk menghasilkan kalimat sapaan yang berisi nama dan NIM mahasiswa. Pada paradigma OOP, saya membuat class `HelloOOP` dengan field `private` untuk menyimpan nama dan NIM serta metode `sapa()` untuk menghasilkan sapaan. Sementara itu, pada paradigma fungsional, saya menggunakan lambda melalui metode `pembuatSapaan()` yang mengembalikan fungsi untuk menghasilkan sapaan. Setelah menyelesaikan implementasi, saya menjalankan pengujian menggunakan perintah `.\scripts\uji.ps1` dan memperoleh hasil `BUILD SUCCESS` dengan lima tes berhasil tanpa kegagalan.

## Keputusan desain

Saya memutuskan untuk menggunakan format kalimat sapaan yang sama pada ketiga paradigma, yaitu `Hello Aset-Pinjam, saya [nama] ([NIM])`. Keputusan ini diambil agar hasil ketiga implementasi dapat dibandingkan secara langsung dan memenuhi pengujian yang tersedia.

Pada paradigma prosedural, saya menggunakan metode statis karena proses yang dilakukan masih sederhana. Pada paradigma OOP, saya menggunakan field `private` dan `final` agar data nama dan NIM tersimpan di dalam objek dan tidak dapat diubah setelah objek dibuat. Pada paradigma fungsional, saya menggunakan `Function<String, String>` dan lambda agar fungsi pembuat sapaan dapat menerima nama sebagai masukan dan menghasilkan teks sebagai keluaran. Saya juga mengisi konfigurasi mahasiswa menggunakan nama dan NIM sendiri agar program dapat membaca data mahasiswa dengan benar.

## Kendala

Kendala yang saya temui adalah pengujian awal mengalami error pada bagian pembacaan data mahasiswa. Pesan error menunjukkan bahwa program membaca nama `April Triadi` sebagai NIM, sehingga validasi digit terakhir NIM gagal. Saya memeriksa kembali konfigurasi mahasiswa dan memperbaiki masalah tersebut. Setelah itu, saya menjalankan ulang perintah `.\scripts\uji.ps1`. Hasil pengujian menunjukkan lima tes berhasil, tanpa kegagalan maupun error, dan proses pembangunan proyek berakhir dengan `BUILD SUCCESS`.

## Penggunaan AI

- **Alat yang dipakai:** ChatGPT.
- **Bagian yang dibantu AI:** Implementasi metode `sapa()` pada class `HelloOOP`, metode `pembuatSapaan()` pada class `HelloFungsional`, pemeriksaan konfigurasi mahasiswa, serta penelusuran error ketika menjalankan pengujian.
- **Prompt utama:**
  1. "Kamu langsung buatkan codingannya."
  2. "Buka terminal pada folder utama proyek, lalu jalankan: `.\scripts\uji.ps1`."
  3. "Ini sudah benar belum?" dengan menyertakan hasil pengujian dari terminal.
- **Yang saya ubah atau tolak dari saran AI, dan alasannya:** Saya memeriksa kembali konfigurasi mahasiswa dan hasil pengujian sebelum melanjutkan. Saya tidak langsung menganggap program berhasil hanya karena kode sudah dibuat, tetapi menjalankan tes untuk memastikan implementasinya sesuai dengan pengujian yang tersedia. Perbaikan konfigurasi dilakukan berdasarkan pesan error yang muncul.
- **Satu hal yang saya pahami lebih baik sekarang:** Saya memahami bahwa paradigma prosedural berfokus pada fungsi, paradigma OOP menggabungkan data dan perilaku dalam objek, sedangkan paradigma fungsional dapat menggunakan fungsi sebagai nilai. Saya juga memahami pentingnya membaca pesan error dan menjalankan pengujian setelah melakukan perubahan kode.
