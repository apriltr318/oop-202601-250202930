# Catatan Minggu 04: Polymorphism

## Yang saya kerjakan
Pada minggu ini saya mengerjakan materi polymorphism dengan menerapkan overriding pada method hitungDenda() di class Aset, Ruang, Laptop, dan AlatLab. Saya juga membuat dua method cari() dengan parameter berbeda pada class KatalogAset untuk menerapkan overloading.

## Keputusan desain
Saya menggunakan method hitungDenda() pada class Aset sebagai perhitungan dasar. Kemudian, setiap subclass melakukan overriding untuk menyesuaikan pengali denda berdasarkan jenis aset. Ruang menggunakan pengali 1, Laptop 2, dan AlatLab 4. Tarif dasar tetap mengambil nilai dari Varian.aktif().dendaPerHari.

## Kendala
Awalnya saya masih perlu memahami perbedaan overriding dan overloading. Setelah mempelajari kembali contoh dan menerapkannya pada program, saya mulai memahami bahwa overriding digunakan untuk mengubah perilaku method dari class induk, sedangkan overloading menggunakan nama method yang sama dengan parameter berbeda.

## Penggunaan AI
- Alat yang dipakai: ChatGPT
- Bagian yang dibantu AI: Implementasi method hitungDenda() pada class Aset dan subclass, serta method cari() pada KatalogAset.
- Prompt utama: Bantu saya mengerjakan tugas Minggu 4 tentang polymorphism sesuai aturan dan pengujian yang tersedia.
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya menyesuaikan kode dengan struktur project yang sudah tersedia.
- Satu hal yang saya pahami lebih baik sekarang: Saya memahami perbedaan overriding dan overloading serta bagaimana dynamic binding menjalankan method sesuai objek sebenarnya.