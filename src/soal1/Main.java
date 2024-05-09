package UTS.soal1;

public class Main {
    public static void main(String[] args) { // Fungsi main adalah fungsi utama yang dieksekusi ketika program dijalankan.

        // Membuat objek Human bernama Sanda
        Human Sanda = new Human("Sanda", "Black", 155.0, 60.0, 20, "Male", "Black", true);
        Sanda.sayHello(); // Memanggil method sayHello() untuk menampilkan nama Sanda.
        Sanda.countCalories(1234); // Memanggil method countCalories() untuk menghitung kalori dengan input total kalori 1234.
        Sanda.countCalories(new String[]{"Chicken breast"}, new int[]{1}); // Memanggil method countCalories() untuk menghitung kalori dengan input 1 dada ayam.
        Sanda.breakUp(); // Memanggil method breakUp() untuk mengubah status hubungan Sanda menjadi single (lajang).
        Sanda.getTogether(); // Memanggil method getTogether() untuk mengubah status hubungan Sanda menjadi tidak single (berpasangan).
        Sanda.isIdealWeight(); // Memanggil method isIdealWeight() untuk mengecek apakah berat badan Sanda ideal.
        System.out.println(); // Mencetak baris kosong untuk memberi jarak.

        // Membuat objek Male bernama Banda
        Male Banda = new Male("Banda", "Yellow", 155.0, 60.0, 20, "Black", false);
        Banda.sayHello(); // Memanggil method sayHello() untuk menampilkan nama Banda.
        Banda.countCalories(1473.75); // Memanggil method countCalories() untuk menghitung kalori dengan input total kalori 1473.75.
        Banda.countCalories(new String[]{}, new int[]{}); // Memanggil method countCalories() untuk menghitung kalori dengan input 10 dada ayam.
        Banda.breakUp(); // Memanggil method breakUp() untuk mengubah status hubungan Banda menjadi single (lajang).
        Banda.getTogether(); // Memanggil method getTogether() untuk mengubah status hubungan Banda menjadi tidak single (berpasangan).
        Banda.isIdealWeight(); // Memanggil method isIdealWeight() untuk mengecek apakah berat badan Banda ideal.
        System.out.println(); // Mencetak baris kosong untuk memberi jarak.

        // Membuat objek Female bernama Handa
        Female Handa = new Female("Handa", "White", 155.0, 60.0, 20, "Black", true);
        Handa.sayHello(); // Memanggil method sayHello() untuk menampilkan nama Handa.
        Handa.countCalories(1500); // Memanggil method countCalories() untuk menghitung kalori dengan input total kalori 1500.
        Handa.countCalories(new String[]{"Chicken breast"}, new int[]{1}); // Memanggil method countCalories() untuk menghitung kalori dengan input 1 dada ayam.
        Handa.breakUp(); // Memanggil method breakUp() untuk mengubah status hubungan Handa menjadi single (lajang).
        Handa.getTogether(); // Memanggil method getTogether() untuk mengubah status hubungan Handa menjadi tidak single (berpasangan).
        Handa.isIdealWeight(); // Memanggil method isIdealWeight() untuk mengecek apakah berat badan Handa ideal.
        System.out.println(); // Mencetak baris kosong untuk memberi jarak.
    }
}
