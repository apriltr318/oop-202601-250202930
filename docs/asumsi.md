# Asumsi dan Keputusan Desain

Isi bagian ini sendiri. Satu entri per keputusan. Dinilai dari kejelasan alasan dan konsistensi dengan kode dan tes Anda,
bukan dari jawaban "benar".

Format tiap entri:

```
## A-NN: judul singkat
- Pertanyaan: ...
- Keputusan: ...
- Alasan: ...
- Dampak ke kode: ... (kelas/metode)
- Tes yang membuktikan: ... (nama tes di folder mahasiswa/)
```

## Aturan ambigu dari docs/aturan-bisnis.md

Salin setiap pertanyaan ambigu (nomor 1 sampai 7) ke sini dan jawab. Contoh:

## A-01: Batas waktu bentrok
- Pertanyaan: Apa definisi bentrok di batas waktu? Apakah peminjaman pukul 09:00–11:00 dan 11:00–13:00 pada aset yang sama dianggap bentrok?
- Keputusan: Kedua peminjaman tidak dianggap bentrok karena waktu selesai peminjaman pertama sama dengan waktu mulai peminjaman berikutnya.
- Alasan: Aset dapat langsung digunakan oleh peminjam berikutnya setelah peminjaman sebelumnya selesai.
- Dampak ke kode: Metode `bentrok()` pada kelas `JadwalPeminjaman` menggunakan perbandingan waktu untuk memeriksa apakah dua jadwal saling tumpang tindih.
- Tes yang membuktikan: `BatasBentrokTest.selesaiSamaDenganMulai()`.

## Asumsi lain

- Denda progresif dihitung dari denda flat ditambah kenaikan sebesar denda flat dikalikan jumlah hari keterlambatan, kemudian dibagi 30. Rumus yang digunakan adalah:

  **Denda Progresif = Denda Flat + (Denda Flat × Hari Terlambat / 30)**

Dengan rumus ini, denda progresif tidak lebih murah dari denda flat dan nilainya meningkat seiring bertambahnya hari keterlambatan.
