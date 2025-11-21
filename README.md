Siap, ini **versi singkat & padat** untuk README **Latihan 4 (ISP)** dan **Latihan 5 (DIP)**. Tinggal paste ke file README atau Notion kamu.

**Latihan 4 – Interface Segregation Principle (ISP)**

**Nama:** Adrian Valentino
**NIM:** 2481042

 **Poin Penting (Singkat):**

1. **BAD version** memakai 1 interface besar (contoh: `Sender`) yang memaksa semua class mengimplementasi method yang tidak mereka butuhkan.
2. Terjadi **fat interface**, class jadi punya method kosong atau tidak relevan → melanggar ISP.
3. **GOOD version** memecah interface menjadi bagian kecil seperti `EmailSender`, `NotificationSender`, dll.
4. Class hanya mengimplementasikan interface yang benar-benar diperlukan → lebih bersih dan fleksibel.
5. Sistem lebih **modular**, lebih mudah dirawat & ditambah fitur.

 **Latihan 5 – Dependency Inversion Principle (DIP)**

**Nama:** Adrian Valentino
**NIM:** 2481042

**Poin Penting (Singkat):**

1. **BAD version:** `PaymentService` bergantung langsung pada class konkret (new CardValidator(), new PaymentGateway(), dll) → tight coupling.
2. Susah diganti implementasinya (misal ganti gateway), dan susah di-test karena tidak bisa di-mock.
3. **GOOD version:** semua dependency berupa **interface** (`CardValidator`, `PaymentGateway`, dll).
4. `PaymentService` menerima dependency lewat constructor (dependency injection).
5. Kode menjadi **fleksibel, mudah diuji, gampang ganti implementasi** tanpa merubah main logic.



