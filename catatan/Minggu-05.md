# Catatan Minggu 5: Abstraction

## Yang saya kerjakan

Pada minggu kelima, saya mempelajari konsep abstraction dalam pemrograman berorientasi objek. Dalam pengerjaan ini, saya mengubah class `Aset` menjadi abstract class karena class tersebut digunakan sebagai dasar untuk beberapa jenis aset, seperti `Ruang`, `Laptop`, dan `AlatLab`.

Saya juga mengisi method `bisaDipinjam()` sesuai ketentuan, yaitu aset hanya bisa dipinjam apabila statusnya tersedia dan kondisinya bukan rusak berat.

Selain itu, saya mengimplementasikan interface `AturanDenda` pada class `DendaFlat` dan `DendaProgresif`. Kedua class tersebut digunakan untuk menerapkan aturan perhitungan denda yang berbeda. Denda flat mengikuti hasil perhitungan dari masing-masing aset, sedangkan denda progresif memiliki tambahan perhitungan berdasarkan jumlah hari keterlambatan.

## Keputusan desain

Dalam pengerjaan ini, saya memilih menggunakan abstract class pada `Aset` karena class tersebut menjadi dasar bagi beberapa jenis aset yang memiliki struktur dan fungsi yang hampir sama. Method `hitungDenda()` dibuat abstract agar setiap subclass memiliki implementasi perhitungan dendanya sendiri.

Saya juga menggunakan interface `AturanDenda` supaya aturan perhitungan denda dapat diterapkan dengan cara yang berbeda. Untuk denda progresif, saya menggunakan rumus denda flat ditambah kenaikan berdasarkan jumlah hari keterlambatan. Rumus tersebut dipilih agar hasil denda progresif tidak lebih murah dari denda flat dan nilainya terus meningkat ketika jumlah hari keterlambatan bertambah.

## Kendala

Saat mengerjakan bagian ini, saya sempat mengalami kesulitan ketika mengubah method `hitungDenda()` menjadi abstract. Awalnya saya masih bingung karena method tersebut tidak lagi memiliki isi perhitungan di class `Aset`. Setelah dipahami, ternyata proses perhitungan denda harus dibuat langsung pada masing-masing subclass, yaitu `Ruang`, `Laptop`, dan `AlatLab`.

Selain itu, saya juga perlu memahami cara kerja interface agar dapat digunakan oleh class `DendaFlat` dan `DendaProgresif`. Setelah mencoba menerapkan dan menjalankan pengujian, saya mulai memahami perbedaan penggunaan abstract class dan interface.

## Penggunaan AI

- **Alat yang dipakai:** ChatGPT.
- **Bagian yang dibantu AI:** Memahami konsep abstraction, penggunaan abstract class dan interface, serta membantu memahami implementasi perhitungan denda.
- **Prompt utama:** Meminta bantuan untuk mengerjakan tugas Minggu 5 tentang abstraction berdasarkan instruksi dan ketentuan yang diberikan.
- **Yang saya ubah atau tolak:** Saya menyesuaikan kode yang diberikan dengan struktur project dan aturan tugas, kemudian menjalankan pengujian untuk memastikan hasilnya sesuai.
- **Satu hal yang saya pahami lebih baik sekarang:** Saya menjadi lebih memahami bahwa abstract class dapat digunakan sebagai dasar bagi subclass, sedangkan interface berfungsi sebagai kontrak yang harus diterapkan oleh class yang menggunakannya.
