# Minggu 3: Inheritance

## Yang Saya Kerjakan

Pada minggu ketiga, saya mempelajari inheritance atau pewarisan dalam pemrograman berorientasi objek. Pada tugas ini, saya membuat tiga class turunan, yaitu `Ruang`, `Laptop`, dan `AlatLab`, yang mewarisi atribut dan method dari class induk `Aset`.

Pada class `Ruang`, saya menambahkan atribut kapasitas yang nilainya harus lebih dari 0. Pada class `Laptop`, saya menambahkan atribut spesifikasi dan nomor inventaris yang tidak boleh kosong. Sementara itu, pada class `AlatLab`, saya menambahkan atribut laboratorium dan tingkat risiko. Nama laboratorium tidak boleh kosong dan tingkat risiko tidak boleh bernilai null.

Saya juga membuat konstruktor, getter, dan method `getJenis()` pada setiap class. Konstruktor class turunan menggunakan `super(kode, nama)` untuk memanggil konstruktor dari class `Aset`, sehingga validasi kode dan nama tetap berjalan.

## Keputusan Desain

Menurut saya, atribut yang digunakan oleh semua jenis aset sebaiknya diletakkan di class induk `Aset`, seperti kode, nama, status, dan kondisi. Dengan begitu, atribut yang sama tidak perlu ditulis ulang pada setiap class turunan.

Sementara itu, atribut yang hanya digunakan oleh jenis aset tertentu diletakkan pada class masing-masing. Contohnya, kapasitas hanya dimiliki `Ruang`, spesifikasi dan nomor inventaris dimiliki `Laptop`, sedangkan laboratorium dan tingkat risiko dimiliki `AlatLab`.

Dengan cara ini, kode program menjadi lebih teratur dan lebih mudah dikembangkan. Method `getJenis()` juga dibuat berbeda pada setiap class agar dapat mengembalikan jenis aset yang sesuai, yaitu `RUANG`, `LAPTOP`, dan `ALAT_LAB`.

## Keterbatasan Inheritance

Menurut saya, inheritance tidak selalu cocok digunakan untuk semua hubungan antarkelas. Contohnya, pada sistem Aset-Pinjam, class `Peminjaman` kurang tepat jika dibuat sebagai turunan dari class `Aset`. Hal ini karena peminjaman bukan merupakan jenis aset, melainkan proses yang menggunakan aset.

Untuk kasus tersebut, komposisi lebih tepat digunakan. Class `Peminjaman` dapat memiliki atribut berupa objek `Aset` yang menunjukkan barang yang sedang dipinjam. Dengan begitu, hubungan antara peminjaman dan aset menjadi lebih sesuai.

## Hasil Pengujian

Saya menjalankan pengujian menggunakan perintah `.\scripts\uji.ps1 3` melalui PowerShell. Hasilnya, seluruh 19 tes dari Minggu 1 sampai Minggu 3 berhasil dijalankan, dengan 0 kegagalan dan 0 error. Proses build juga menunjukkan status `BUILD SUCCESS`.

Hasil tersebut menunjukkan bahwa class `Ruang`, `Laptop`, dan `AlatLab` sudah memenuhi aturan yang ditentukan dalam tugas Minggu 3.

## Penggunaan AI

Dalam mengerjakan tugas ini, saya menggunakan ChatGPT dan Claude AI untuk membantu memahami konsep inheritance, menentukan atribut yang sesuai pada class induk dan class turunan, serta membantu memeriksa kode program.

Saya menggunakan bantuan AI sebagai bahan belajar, kemudian menjalankan pengujian sendiri melalui PowerShell untuk memastikan program berjalan sesuai dengan ketentuan tugas.
