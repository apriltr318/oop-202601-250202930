# Catatan Minggu 07: Koleksi dan Jadwal Peminjaman

## Yang saya kerjakan

Pada minggu ini saya mengerjakan pengelolaan jadwal peminjaman aset menggunakan struktur data Java. Saya membuat fitur untuk memeriksa bentrok jadwal, mengurutkan peminjaman berdasarkan waktu mulai, mengelompokkan peminjaman berdasarkan kode aset, dan menghapus data peminjaman berdasarkan ID. Saya juga menambahkan pengujian sendiri untuk menentukan aturan batas waktu bentrok.

## Keputusan desain

Saya menggunakan `List` dengan implementasi `ArrayList` untuk menyimpan daftar peminjaman karena data dapat ditambahkan dan dihapus dengan mudah. Untuk mengelompokkan peminjaman berdasarkan kode aset, saya menggunakan `Map` dengan implementasi `LinkedHashMap`. Pengurutan jadwal dilakukan menggunakan `Comparator` berdasarkan waktu mulai.

Untuk aturan batas waktu, saya memutuskan bahwa dua peminjaman pada aset yang sama tidak dianggap bentrok apabila waktu selesai peminjaman pertama tepat sama dengan waktu mulai peminjaman berikutnya. Alasannya, aset dapat langsung digunakan kembali setelah peminjaman sebelumnya selesai. Keputusan ini dicatat pada `docs/asumsi.md` dan dibuktikan melalui tes `BatasBentrokTest.selesaiSamaDenganMulai()`.

## Kendala

Kendala yang saya temui adalah memastikan tes tambahan yang dibuat sendiri ikut dijalankan oleh script pengujian. Awalnya, tes batas waktu tidak muncul dalam hasil pengujian karena belum menggunakan tag `week7`. Setelah menambahkan anotasi `@Tag("week7")`, tes tersebut berhasil dijalankan bersama tes minggu lainnya.

## Penggunaan AI

- **Alat yang dipakai:** ChatGPT.
- **Bagian yang dibantu AI:** Implementasi metode `bentrok()`, `semuaUrutMulai()`, `perAset()`, dan `hapus()` pada kelas `JadwalPeminjaman`, serta penyusunan tes `BatasBentrokTest`.
- **Prompt utama:**
  1. "Bantu saya mengerjakan Week 7 tentang koleksi dan jadwal peminjaman berdasarkan aturan pada dokumen tugas."
  2. "Jelaskan cara menentukan bentrok jadwal peminjaman jika waktu selesai peminjaman pertama sama dengan waktu mulai peminjaman kedua."
  3. "Bantu periksa mengapa tes BatasBentrokTest tidak muncul saat menjalankan script pengujian."
- **Yang saya ubah atau tolak dari saran AI, dan alasannya:** Saya memilih aturan bahwa jadwal yang bersebelahan tidak dianggap bentrok karena aset bisa langsung digunakan oleh peminjam berikutnya. Saya juga menambahkan tag `@Tag("week7")` agar tes buatan sendiri ikut dijalankan oleh script.
- **Satu hal yang saya pahami lebih baik sekarang:** Saya lebih memahami perbedaan penggunaan `List` dan `Map`, serta cara menggunakan `Comparator` untuk mengurutkan data. Saya juga memahami bahwa pengujian harus menggunakan tag yang sesuai agar dapat dijalankan oleh script yang sudah disediakan.

