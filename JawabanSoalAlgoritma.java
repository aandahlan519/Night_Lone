/* JAWABAN 50 SOAL ALGORITMA DAN PEMROGRAMAN + 20 FORMASI BINTANG
 * Bahasa: Java
 *
 * Cara pakai:
 *   javac JawabanSoalAlgoritma.java
 *   java JawabanSoalAlgoritma
 * lalu pilih nomor soal dari menu (1-50, atau B1-B20 untuk formasi bintang).
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JawabanSoalAlgoritma {

    static final Scanner in = new Scanner(System.in);

    // ---------- Helper input ----------
    static String bacaTeks(String label) {
        System.out.print(label);
        return in.nextLine();
    }

    static int bacaInt(String label) {
        while (true) {
            System.out.print(label);
            String s = in.nextLine().trim();
            try {
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Masukan harus bilangan bulat.");
            }
        }
    }

    static String ulangKarakter(char c, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append(c);
        return sb.toString();
    }

    // ============================================================
    // BAGIAN A : SOAL 1 - 50
    // ============================================================

    // Soal 1 : membalik kalimat
    static void soal1() {
        String s = bacaTeks("Masukkan kalimat: ");
        StringBuilder hasil = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) hasil.append(s.charAt(i));
        System.out.println("Hasil terbalik: " + hasil);
    }

    // Soal 2 : jumlah kemunculan sebuah huruf
    static void soal2() {
        String s = bacaTeks("Masukkan kalimat: ");
        String h = bacaTeks("Huruf yang dicari: ");
        if (h.isEmpty()) { System.out.println("Huruf tidak boleh kosong."); return; }
        char target = Character.toLowerCase(h.charAt(0));
        int jml = 0;
        for (char c : s.toCharArray()) if (Character.toLowerCase(c) == target) jml++;
        System.out.println("Huruf '" + h.charAt(0) + "' muncul " + jml + " kali.");
    }

    // Soal 3 : jumlah karakter
    static void soal3() {
        String s = bacaTeks("Masukkan kalimat: ");
        int total = 0, tanpaSpasi = 0;
        for (char c : s.toCharArray()) {
            total++;
            if (c != ' ') tanpaSpasi++;
        }
        System.out.println("Jumlah karakter (termasuk spasi): " + total);
        System.out.println("Jumlah karakter (tanpa spasi)  : " + tanpaSpasi);
    }

    // ---------- Helper pola angka ----------
    static String ulang(int angka, int n) {          // ulang(2,2) -> "22"
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append(angka);
        return sb.toString();
    }

    static String naik(int n) {                      // naik(4) -> "1234"
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) sb.append(i);
        return sb.toString();
    }

    static String turun(int n) {                     // turun(4) -> "4321"
        StringBuilder sb = new StringBuilder();
        for (int i = n; i >= 1; i--) sb.append(i);
        return sb.toString();
    }

    // Soal 4 : 122333444455555666666
    static void soal4() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 6; i++) sb.append(ulang(i, i));
        System.out.println(sb);
    }

    // Soal 5 : 666666555554444333221
    static void soal5() {
        StringBuilder sb = new StringBuilder();
        for (int i = 6; i >= 1; i--) sb.append(ulang(i, i));
        System.out.println(sb);
    }

    // Soal 6 : 112123123412345123456
    static void soal6() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 6; i++) sb.append(naik(i));
        System.out.println(sb);
    }

    // Soal 7 : 654321543214321321211
    static void soal7() {
        StringBuilder sb = new StringBuilder();
        for (int i = 6; i >= 1; i--) sb.append(turun(i));
        System.out.println(sb);
    }

    // Soal 8 : 1 12 333 1234 55555 123456
    static void soal8() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 6; i++) sb.append((i == 3 || i == 5) ? ulang(i, i) : naik(i));
        System.out.println(sb);
    }

    // Soal 9 : 1 22 123 4444 12345 666666
    static void soal9() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 6; i++) sb.append(i % 2 == 0 ? ulang(i, i) : naik(i));
        System.out.println(sb);
    }

    // Soal 10 : 654321 55555 4321 333 21 1
    static void soal10() {
        StringBuilder sb = new StringBuilder();
        for (int i = 6; i >= 1; i--) sb.append((i == 5 || i == 3) ? ulang(i, i) : turun(i));
        System.out.println(sb);
    }

    // Soal 11 : 666666 12345 4444 123 22 1
    static void soal11() {
        StringBuilder sb = new StringBuilder();
        for (int i = 6; i >= 1; i--) sb.append(i % 2 == 0 ? ulang(i, i) : naik(i));
        System.out.println(sb);
    }

    // Soal 12 : 1 22 123 1234 55555 666666 1234567 12345678 999999999
    static void soal12() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 9; i++) {
            boolean blok = (i == 2 || i == 5 || i == 6 || i == 9);
            sb.append(blok ? ulang(i, i) : naik(i));
        }
        System.out.println(sb);
    }

    // Soal 13 : 1 12 333 4444 12345 123456 7777777 88888888 123456789
    static void soal13() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 9; i++) {
            boolean blok = (i == 3 || i == 4 || i == 7 || i == 8);
            sb.append(blok ? ulang(i, i) : naik(i));
        }
        System.out.println(sb);
    }

    // Soal 14 : 888888888 77777777 654321 54321 4444 333 21 1
    static void soal14() {
        StringBuilder sb = new StringBuilder();
        for (int i = 8; i >= 1; i--) {
            boolean blok = (i == 8 || i == 7 || i == 4 || i == 3);
            sb.append(blok ? ulang(i, i) : turun(i));
        }
        System.out.println(sb);
    }

    // Soal 15 : 87654321 7654321 6666666 55555 4321 321 22 1
    static void soal15() {
        StringBuilder sb = new StringBuilder();
        for (int i = 8; i >= 1; i--) {
            boolean blok = (i == 6 || i == 5 || i == 2);
            sb.append(blok ? ulang(i, i) : turun(i));
        }
        System.out.println(sb);
    }

    // ---------- Helper deret zig-zag ----------
    static void cetakZigzag(int awal, int langkah1, int langkah2, int jumlah) {
        StringBuilder sb = new StringBuilder();
        int n = awal;
        sb.append(n);
        for (int i = 0; i < jumlah - 1; i++) {
            n += (i % 2 == 0) ? langkah1 : langkah2;
            sb.append(" ").append(n);
        }
        System.out.println(sb);
    }

    // Soal 16 : 1 5 3 7 5 9 ...  (n+4, n-2)
    static void soal16() { cetakZigzag(1, 4, -2, 12); }

    // Soal 17 : 2 12 7 17 ... (n+10, n-5)
    static void soal17() { cetakZigzag(2, 10, -5, 10); }

    // Soal 18 : 5 2 7 4 ... (n-3, n+5)
    static void soal18() { cetakZigzag(5, -3, 5, 12); }

    // Soal 19 : 3 9 4 12 7 21 16 48 43 129 (n*3, n-5)
    static void soal19() {
        StringBuilder sb = new StringBuilder();
        long n = 3;
        sb.append(n);
        for (int i = 0; i < 9; i++) {
            n = (i % 2 == 0) ? n * 3 : n - 5;
            sb.append(" ").append(n);
        }
        System.out.println(sb);
    }

    // Soal 20 : 1 2 4 7 8 10 13 ... (+1, +2, +3 berulang)
    static void soal20() {
        int[] langkah = {1, 2, 3};
        int n = 1;
        StringBuilder sb = new StringBuilder().append(n);
        for (int i = 0; i < 12; i++) {
            n += langkah[i % 3];
            sb.append(" ").append(n);
        }
        System.out.println(sb);
    }

    // Soal 21 : 1 2 4 8 ... 512
    static void soal21() {
        StringBuilder sb = new StringBuilder();
        int n = 1;
        for (int i = 0; i < 10; i++) {
            sb.append(n).append(" ");
            n *= 2;
        }
        System.out.println(sb.toString().trim());
    }

    // Soal 22 : faktorial
    static void soal22() {
        int n = bacaInt("Masukkan n: ");
        if (n < 0) { System.out.println("n harus >= 0"); return; }
        long hasil = 1;
        StringBuilder urut = new StringBuilder();
        for (int i = n; i >= 1; i--) {
            hasil *= i;
            if (urut.length() > 0) urut.append(" x ");
            urut.append(i);
        }
        if (urut.length() == 0) urut.append("1");
        System.out.println(n + "! = " + urut + " = " + hasil);
    }

    // Soal 23 : fibonacci sampai nilai maksimum
    static void soal23() {
        int maks = bacaInt("Nilai maksimum: ");
        long a = 0, b = 1;
        StringBuilder sb = new StringBuilder();
        while (a <= maks) {
            sb.append(a).append(", ");
            long t = a + b;
            a = b;
            b = t;
        }
        System.out.println(sb + "selesai");
    }

    // ---------- Tahun kabisat (soal 24 - 28) ----------
    static boolean kabisat(int t) {
        return (t % 4 == 0 && t % 100 != 0) || t % 400 == 0;
    }

    static void kabisatAkhiran(int digit) {
        int awal = bacaInt("n_awal : ");
        int akhir = bacaInt("n_akhir: ");
        List<Integer> hasil = new ArrayList<>();
        for (int t = awal; t <= akhir; t++)
            if (kabisat(t) && Math.abs(t % 10) == digit) hasil.add(t);
        System.out.println("Tahun kabisat berakhiran " + digit + ": "
                + (hasil.isEmpty() ? "tidak ada" : gabung(hasil)));
        System.out.println("Jumlah: " + hasil.size());
    }

    static String gabung(List<Integer> data) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.size(); i++) {
            if (i > 0) sb.append(" ");
            sb.append(data.get(i));
        }
        return sb.toString();
    }

    static long total(List<Integer> data) {
        long t = 0;
        for (int n : data) t += n;
        return t;
    }

    static void soal24() { kabisatAkhiran(0); }
    static void soal25() { kabisatAkhiran(2); }
    static void soal26() { kabisatAkhiran(4); }
    static void soal27() { kabisatAkhiran(6); }
    static void soal28() { kabisatAkhiran(8); }

    // ---------- Habis dibagi (soal 29 - 33) ----------
    static void habisDibagi(int d) {
        int awal = bacaInt("n_awal : ");
        int akhir = bacaInt("n_akhir: ");
        List<Integer> hasil = new ArrayList<>();
        for (int n = awal; n <= akhir; n++) if (n % d == 0) hasil.add(n);
        System.out.println("Bilangan habis dibagi " + d + ": "
                + (hasil.isEmpty() ? "tidak ada" : gabung(hasil)));
        System.out.println("Jumlah bilangan: " + hasil.size());
    }

    static void soal29() { habisDibagi(3); }
    static void soal30() { habisDibagi(4); }
    static void soal31() { habisDibagi(5); }
    static void soal32() { habisDibagi(6); }
    static void soal33() { habisDibagi(7); }

    // ---------- Animasi angka 0 (soal 34 - 41) ----------
    static final int LEBAR = 40;
    static final int TINGGI = 12;
    static final long JEDA = 60; // milidetik

    static void bersih() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void jeda() {
        try { Thread.sleep(JEDA); } catch (InterruptedException ignored) { }
    }

    static void frameHorizontal(int kolom, int barisTarget) {
        bersih();
        for (int b = 0; b < TINGGI; b++)
            System.out.println(b == barisTarget ? ulangKarakter(' ', kolom) + "0" : "");
        jeda();
    }

    static void animasiHorizontal(int barisTarget, boolean balikKeAwal) {
        for (int kolom = 0; kolom < LEBAR; kolom++) frameHorizontal(kolom, barisTarget);
        if (balikKeAwal) {
            for (int kolom = 0; kolom < LEBAR; kolom++) frameHorizontal(kolom, barisTarget);
        } else {
            for (int kolom = LEBAR - 1; kolom >= 0; kolom--) frameHorizontal(kolom, barisTarget);
        }
        bersih();
    }

    static void frameVertikal(int baris, int kolom) {
        bersih();
        for (int b = 0; b < TINGGI; b++)
            System.out.println(b == baris ? ulangKarakter(' ', kolom) + "0" : "");
        jeda();
    }

    static void animasiVertikal(int kolom, boolean balikKeAwal) {
        for (int baris = 0; baris < TINGGI; baris++) frameVertikal(baris, kolom);
        if (balikKeAwal) {
            for (int baris = 0; baris < TINGGI; baris++) frameVertikal(baris, kolom);
        } else {
            for (int baris = TINGGI - 1; baris >= 0; baris--) frameVertikal(baris, kolom);
        }
        bersih();
    }

    static void soal34() { animasiHorizontal(0, true); }            // kiri atas -> kanan atas, ulang
    static void soal35() { animasiHorizontal(0, false); }           // kiri atas -> kanan atas -> kembali
    static void soal36() { animasiHorizontal(TINGGI - 1, true); }   // kiri bawah -> kanan bawah, ulang
    static void soal37() { animasiHorizontal(TINGGI - 1, false); }  // kiri bawah -> kanan bawah -> kembali
    static void soal38() { animasiVertikal(0, true); }              // kiri atas -> kiri bawah, ulang
    static void soal39() { animasiVertikal(0, false); }             // kiri atas -> kiri bawah -> kembali
    static void soal40() { animasiVertikal(LEBAR - 1, true); }      // kanan atas -> kanan bawah, ulang
    static void soal41() { animasiVertikal(LEBAR - 1, false); }     // kanan atas -> kanan bawah -> kembali

    // ---------- Input berulang (soal 42 - 45) ----------
    static List<Integer> inputAngka(int minimal) {
        List<Integer> data = new ArrayList<>();
        System.out.println("Masukkan angka (minimal " + minimal + "). Ketik 'selesai' untuk berhenti.");
        while (true) {
            System.out.print("Angka ke-" + (data.size() + 1) + ": ");
            String teks = in.nextLine().trim();
            if (teks.equalsIgnoreCase("selesai")) {
                if (data.size() >= minimal) break;
                System.out.println("Data masih kurang, minimal " + minimal + " angka.");
                continue;
            }
            try {
                data.add(Integer.parseInt(teks));
            } catch (NumberFormatException e) {
                System.out.println("Masukan harus berupa bilangan bulat.");
            }
        }
        return data;
    }

    static void soal42() {
        List<Integer> data = inputAngka(10);
        int terbesar = data.get(0);
        for (int n : data) if (n > terbesar) terbesar = n;
        System.out.println("Bilangan terbesar: " + terbesar);
    }

    static void soal43() {
        List<Integer> data = inputAngka(10);
        int terkecil = data.get(0);
        for (int n : data) if (n < terkecil) terkecil = n;
        System.out.println("Bilangan terkecil: " + terkecil);
    }

    static void soal44() {
        List<Integer> data = inputAngka(10);
        List<Integer> genap = new ArrayList<>();
        for (int n : data) if (n % 2 == 0) genap.add(n);
        System.out.println("Bilangan genap: " + (genap.isEmpty() ? "tidak ada" : gabung(genap)));
        System.out.println("Banyaknya bilangan genap: " + genap.size());
        System.out.println("Total (jumlah) bilangan genap: " + total(genap));
    }

    static void soal45() {
        List<Integer> data = inputAngka(10);
        List<Integer> ganjil = new ArrayList<>();
        for (int n : data) if (n % 2 != 0) ganjil.add(n);
        System.out.println("Bilangan ganjil: " + (ganjil.isEmpty() ? "tidak ada" : gabung(ganjil)));
        System.out.println("Banyaknya bilangan ganjil: " + ganjil.size());
        System.out.println("Total (jumlah) bilangan ganjil: " + total(ganjil));
    }

    // Soal 46 : total bilangan bulat positif n_awal..n_akhir
    static void soal46() {
        int awal = bacaInt("n_awal : ");
        int akhir = bacaInt("n_akhir: ");
        long jumlah = 0;
        int banyak = 0;
        for (int n = awal; n <= akhir; n++) {
            if (n > 0) { jumlah += n; banyak++; }
        }
        System.out.println("Banyak bilangan positif: " + banyak);
        System.out.println("Total penjumlahan      : " + jumlah);
    }

    // Soal 47 : bilangan genap dalam rentang
    static void soal47() {
        int awal = bacaInt("n_awal : ");
        int akhir = bacaInt("n_akhir: ");
        List<Integer> genap = new ArrayList<>();
        for (int n = awal; n <= akhir; n++) if (n % 2 == 0) genap.add(n);
        System.out.println("Bilangan genap: " + (genap.isEmpty() ? "tidak ada" : gabung(genap)));
        System.out.println("Banyaknya: " + genap.size() + " | Total: " + total(genap));
    }

    // Soal 48 : bilangan ganjil dalam rentang
    static void soal48() {
        int awal = bacaInt("n_awal : ");
        int akhir = bacaInt("n_akhir: ");
        List<Integer> ganjil = new ArrayList<>();
        for (int n = awal; n <= akhir; n++) if (n % 2 != 0) ganjil.add(n);
        System.out.println("Bilangan ganjil: " + (ganjil.isEmpty() ? "tidak ada" : gabung(ganjil)));
        System.out.println("Banyaknya: " + ganjil.size() + " | Total: " + total(ganjil));
    }

    static boolean prima(int n) {
        if (n < 2) return false;
        if (n < 4) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; (long) i * i <= n; i += 2) if (n % i == 0) return false;
        return true;
    }

    // Soal 49 : menampilkan bilangan prima
    static void soal49() {
        int awal = bacaInt("n_awal : ");
        int akhir = bacaInt("n_akhir: ");
        List<Integer> hasil = new ArrayList<>();
        for (int n = awal; n <= akhir; n++) if (prima(n)) hasil.add(n);
        System.out.println("Bilangan prima: " + (hasil.isEmpty() ? "tidak ada" : gabung(hasil)));
    }

    // Soal 50 : jumlah dan total bilangan prima
    static void soal50() {
        int awal = bacaInt("n_awal : ");
        int akhir = bacaInt("n_akhir: ");
        List<Integer> hasil = new ArrayList<>();
        for (int n = awal; n <= akhir; n++) if (prima(n)) hasil.add(n);
        System.out.println("Jumlah banyaknya bilangan prima: " + hasil.size());
        System.out.println("Total penjumlahan bilangan prima: " + total(hasil));
    }

    // ============================================================
    // BAGIAN B : 20 FORMASI BINTANG
    // ============================================================
    static final int N = 6;

    static void bintang1() { // segitiga terbalik berongga
        System.out.println(ulangKarakter('*', N));
        for (int i = N - 2; i >= 1; i--)
            System.out.println("*" + ulangKarakter(' ', i - 1) + "*");
        System.out.println("*");
    }

    static void bintang2() { // segitiga siku bertambah
        for (int i = 1; i <= N; i++) System.out.println(ulangKarakter('*', i));
    }

    static void bintang3() { // segitiga naik diulang dua kali
        for (int k = 0; k < 2; k++)
            for (int i = 1; i <= N / 2; i++) System.out.println(ulangKarakter('*', i));
    }

    static void bintang4() { // dua segitiga bersisian + baris penuh
        for (int i = 1; i < N; i++)
            System.out.println(ulangKarakter('*', i) + ulangKarakter(' ', 2 * (N - i)) + ulangKarakter('*', i));
        System.out.println(ulangKarakter('*', 2 * N));
    }

    static void bintang5() { // segitiga menurun
        for (int i = N; i >= 1; i--) System.out.println(ulangKarakter('*', i));
    }

    static void bintang6() { bintang3(); }

    static void bintang7() { // jam pasir
        for (int i = N; i >= 1; i--) System.out.println(ulangKarakter('*', i));
        for (int i = 2; i <= N; i++) System.out.println(ulangKarakter('*', i));
    }

    static void bintang8() { // 0 di kiri, baris terakhir 0 semua
        for (int i = 0; i < N - 1; i++) System.out.println("0" + ulangKarakter('*', N));
        System.out.println(ulangKarakter('0', N + 1));
    }

    static void bintang9() { // 0 di kanan, baris terakhir 0 semua
        for (int i = 0; i < N - 1; i++) System.out.println(ulangKarakter('*', N) + "0");
        System.out.println(ulangKarakter('0', N + 1));
    }

    static void bintang10() { // jam pasir versi genap
        for (int i = N; i >= 1; i -= 2) System.out.println(ulangKarakter('*', i));
        for (int i = 2; i <= N; i += 2) System.out.println(ulangKarakter('*', i));
    }

    static void bintang11() { // baris pertama 0 semua, sisanya 0 di kiri
        System.out.println(ulangKarakter('0', N + 1));
        for (int i = 0; i < N - 1; i++) System.out.println("0" + ulangKarakter('*', N));
    }

    static void bintang12() { // baris pertama 0 semua, sisanya 0 di kanan
        System.out.println(ulangKarakter('0', N + 1));
        for (int i = 0; i < N - 1; i++) System.out.println(ulangKarakter('*', N) + "0");
    }

    static void bintang13() { // 0 bertambah di kiri, * berkurang di kanan
        for (int i = 1; i <= N; i++)
            System.out.println(ulangKarakter('0', i) + ulangKarakter('*', N - i + 1));
    }

    static void bintang14() { // * bertambah di kiri, 0 berkurang di kanan
        for (int i = 1; i <= N; i++)
            System.out.println(ulangKarakter('*', i) + ulangKarakter('0', N - i));
    }

    static void bintang15() { // 0 berkurang di kiri, * bertambah di kanan
        for (int i = 1; i <= N; i++)
            System.out.println(ulangKarakter('0', N - i) + ulangKarakter('*', i));
    }

    static void bintang16() { // variasi lebar N+1
        for (int i = 1; i <= N; i++)
            System.out.println(ulangKarakter('0', N - i) + ulangKarakter('*', i + 1));
    }

    static void bintang17() { // diagonal kanan atas -> kiri bawah
        for (int i = 0; i < N; i++) {
            int pos = N - 1 - i;
            StringBuilder sb = new StringBuilder();
            for (int k = 0; k < N; k++) sb.append(k == pos ? '*' : '0');
            System.out.println(sb);
        }
    }

    static void bintang18() { // diagonal kiri atas -> kanan bawah
        for (int i = 0; i < N; i++) {
            StringBuilder sb = new StringBuilder();
            for (int k = 0; k < N; k++) sb.append(k == i ? '*' : '0');
            System.out.println(sb);
        }
    }

    static void bintang19() { // kotak berongga: pinggir 0, isi *
        System.out.println(ulangKarakter('0', N + 2));
        for (int i = 0; i < N; i++) System.out.println("0" + ulangKarakter('*', N) + "0");
        System.out.println(ulangKarakter('0', N + 2));
    }

    static void bintang20() { // dua blok baris 0 / * / =
        for (int k = 0; k < 2; k++) {
            System.out.println(ulangKarakter('0', N));
            System.out.println(ulangKarakter('*', N));
            System.out.println(ulangKarakter('=', N));
        }
    }

    // ============================================================
    // MENU
    // ============================================================
    static void jalankanSoal(int no) {
        switch (no) {
            case 1: soal1(); break;   case 2: soal2(); break;   case 3: soal3(); break;
            case 4: soal4(); break;   case 5: soal5(); break;   case 6: soal6(); break;
            case 7: soal7(); break;   case 8: soal8(); break;   case 9: soal9(); break;
            case 10: soal10(); break; case 11: soal11(); break; case 12: soal12(); break;
            case 13: soal13(); break; case 14: soal14(); break; case 15: soal15(); break;
            case 16: soal16(); break; case 17: soal17(); break; case 18: soal18(); break;
            case 19: soal19(); break; case 20: soal20(); break; case 21: soal21(); break;
            case 22: soal22(); break; case 23: soal23(); break; case 24: soal24(); break;
            case 25: soal25(); break; case 26: soal26(); break; case 27: soal27(); break;
            case 28: soal28(); break; case 29: soal29(); break; case 30: soal30(); break;
            case 31: soal31(); break; case 32: soal32(); break; case 33: soal33(); break;
            case 34: soal34(); break; case 35: soal35(); break; case 36: soal36(); break;
            case 37: soal37(); break; case 38: soal38(); break; case 39: soal39(); break;
            case 40: soal40(); break; case 41: soal41(); break; case 42: soal42(); break;
            case 43: soal43(); break; case 44: soal44(); break; case 45: soal45(); break;
            case 46: soal46(); break; case 47: soal47(); break; case 48: soal48(); break;
            case 49: soal49(); break; case 50: soal50(); break;
            default: System.out.println("Nomor soal tidak dikenal.");
        }
    }

    static void jalankanBintang(int no) {
        switch (no) {
            case 1: bintang1(); break;   case 2: bintang2(); break;   case 3: bintang3(); break;
            case 4: bintang4(); break;   case 5: bintang5(); break;   case 6: bintang6(); break;
            case 7: bintang7(); break;   case 8: bintang8(); break;   case 9: bintang9(); break;
            case 10: bintang10(); break; case 11: bintang11(); break; case 12: bintang12(); break;
            case 13: bintang13(); break; case 14: bintang14(); break; case 15: bintang15(); break;
            case 16: bintang16(); break; case 17: bintang17(); break; case 18: bintang18(); break;
            case 19: bintang19(); break; case 20: bintang20(); break;
            default: System.out.println("Nomor formasi tidak dikenal.");
        }
    }

    static void menu() {
        System.out.println(ulangKarakter('=', 60));
        System.out.println(" JAWABAN 50 SOAL ALGORITMA DAN PEMROGRAMAN (JAVA)");
        System.out.println(ulangKarakter('=', 60));
        System.out.println("Ketik 1-50   untuk menjalankan soal pemrograman");
        System.out.println("Ketik B1-B20 untuk menjalankan formasi bintang");
        System.out.println("Ketik semua  untuk menjalankan semua soal tanpa input (4-21) + bintang");
        System.out.println("Ketik keluar untuk selesai");
        System.out.println(ulangKarakter('-', 60));
    }

    public static void main(String[] args) {
        while (true) {
            menu();
            System.out.print("Pilihan: ");
            if (!in.hasNextLine()) { System.out.println("\nProgram dihentikan."); return; }
            String pil = in.nextLine().trim().toLowerCase();
            System.out.println();

            if (pil.equals("keluar") || pil.equals("exit") || pil.equals("q")) {
                System.out.println("Selesai. Terima kasih!");
                return;
            } else if (pil.equals("semua")) {
                for (int i = 4; i <= 21; i++) {
                    System.out.print("Soal " + i + ": ");
                    jalankanSoal(i);
                }
                for (int i = 1; i <= 20; i++) {
                    System.out.println("\nFormasi bintang " + i + ":");
                    jalankanBintang(i);
                }
            } else if (pil.startsWith("b")) {
                try {
                    jalankanBintang(Integer.parseInt(pil.substring(1)));
                } catch (NumberFormatException e) {
                    System.out.println("Pilihan tidak dikenal.");
                }
            } else {
                try {
                    jalankanSoal(Integer.parseInt(pil));
                } catch (NumberFormatException e) {
                    System.out.println("Pilihan tidak dikenal.");
                }
            }

            System.out.println();
            System.out.print("Tekan ENTER untuk kembali ke menu...");
            if (in.hasNextLine()) in.nextLine();
            System.out.println();
        }
    }
}
