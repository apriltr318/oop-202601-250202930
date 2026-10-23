# Catatan Minggu 02: Class, Object, dan Encapsulation

## Yang Saya Kerjakan

Pada minggu kedua, saya mengerjakan class `Aset` pada proyek Aset-Pinjam. Dalam pengerjaan ini, saya melengkapi beberapa bagian program, seperti field, konstruktor, getter, setter, dan validasi. Tujuannya agar data aset dapat disimpan dan diubah sesuai dengan aturan yang sudah ditentukan.

## Keputusan Desain

Saya menggunakan access modifier `private` pada setiap field agar data di dalam class tidak bisa diakses secara langsung dari luar class. Field `kode` saya buat menggunakan `final` karena nilainya tidak boleh diubah setelah objek dibuat. Selain itu, status awal aset diatur menjadi `TERSEDIA` dan kondisinya `BAIK`. Saya juga menambahkan validasi untuk menolak kode atau nama yang kosong, serta mencegah status dan kondisi diisi dengan nilai `null`.

## Kendala

Kendala yang saya temui adalah memahami penggunaan getter, setter, dan validasi dalam konsep encapsulation. Awalnya, saya perlu memahami perbedaan fungsi getter untuk mengambil data dan setter untuk mengubah data. Setelah mempelajari cara kerjanya dan mencoba menjalankan pengujian, saya menjadi lebih memahami bagaimana data dalam sebuah objek dapat dijaga agar tetap sesuai dengan aturan program.

## Penggunaan AI

- **Alat yang digunakan:** ChatGPT dan Claude AI.
- **Bagian yang dibantu AI:** Membantu memahami konsep class, object, dan encapsulation, serta memberikan arahan dalam menyusun konstruktor, getter, setter, dan validasi pada class `Aset`.
- **Prompt utama:** Membantu mengerjakan tugas OOP Minggu 2 pada proyek Aset-Pinjam, khususnya dalam melengkapi class `Aset` sesuai aturan yang ditentukan.
- **Bagian yang saya sesuaikan dari saran AI:** Saya menyesuaikan kode dengan struktur folder, ketentuan tugas, dan kebutuhan pengujian yang terdapat dalam proyek.
- **Hal yang saya pahami lebih baik:** Saya memahami bahwa encapsulation digunakan untuk membatasi akses langsung terhadap data objek. Dengan getter, setter, dan validasi, data dapat dikelola dengan lebih teratur dan sesuai aturan program.