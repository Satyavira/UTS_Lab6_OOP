package UTS.soal1;

import java.util.HashMap;

public class Human { //Class Human merupakan super class dari Male dan Female Class
    // Keyword final digunakan untuk mendeklarasi variabel yang tidak bisa dimodifikasi setelah diinisialisasi
    // Ini berguna untuk data yang tidak harus berubah sepanjang hayat objek, seperti nama, warna kulit.
    final private String name;
    final private String skinColor;
    final private double height;
    final private double weight;
    final private int age;
    final private String hairColor;
    final private String gender;
    private boolean isSingle;

    // Constructor adalah metode khusus yang disebut ketika sebuah objek baru dibuat.
    // Ini digunakan untuk menginisialisasi keadaan objek.
    // Konstruktor ini mengambil delapan argumen untuk menginisialisasi attribute objek Human.
    public Human(String name, String skinColor, double height, double weight, int age, String gender, String hairColor, boolean isSingle){
        this.name = name;
        this.skinColor = skinColor;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.hairColor = hairColor;
        this.isSingle = isSingle;
    }

    // Metode overloading memungkinkan Anda untuk memiliki beberapa metode dengan nama yang sama tetapi daftar parameter yang berbeda.
    // Ini berguna ketika Anda ingin melakukan operasi yang sama tetapi dengan input yang berbeda.
    // Di sini, ada dua metode pengambilan kalori:
    // Satu mengambil jumlah total kalori yang dikonsumsi.
    // Yang lain mengambil array nama makanan dan array jumlah yang sesuai.
    void countCalories(double calories){
        double idealCalories = 0;
        if (calories == 0) {
            System.out.println("You doesn't put anything!!!");
            return;
        }
        if(getGender().equals("Male")) {
            idealCalories = 10 * getWeight() + 6.25 * getHeight() - 5 * getAge() + 5;
        } else {
            idealCalories = 10 * getWeight() + 6.25 * getHeight() - 5 * getAge() - 161;
        }
        if (idealCalories == calories) {
            System.out.println("You are eating healthy.");
        } else if (idealCalories < calories) {
            System.out.println("You are eating for bulking.");
        } else {
            System.out.println("You are eating for slimming.");
        }
    }
    // Metode countCalories ini menggunakan HashMap untuk menyimpan informasi kalori untuk makanan tertentu.
    // Ini berulang melalui nama makanan dan jumlah, menghitung total kalori yang dikonsumsi,
    // dan kemudian memanggil metode countCalories lainnya untuk membandingkannya dengan kalori ideal.
    void countCalories(String[] foods, int[] quantities){
        HashMap<String, Integer> foodCalories = new HashMap<>();
        int calories = 0;

        foodCalories.put("Apple", 95);
        foodCalories.put("Banana", 105);
        foodCalories.put("Carrot sticks", 50);
        foodCalories.put("Spinach", 7);
        foodCalories.put("Chicken breast", 180);

        for (int i = 0; i < foods.length; i++) {
            if (foodCalories.containsKey(foods[i])) {
                calories += foodCalories.get(foods[i]) * quantities[i];
            } else {
                System.out.println("The food is not in the list!");
                return;
            }
        }
        countCalories(calories);
    }
    // Berbeda dengan metode setter dibawah yaitu setSingle metode ini menggunakan kondisi agar properties isSingle tidak dimodifikasi sembarangan
    void breakUp() {
        if (!isSingle()) {
            setSingle();
            System.out.println("Don't be sad. You can find other people.");
        }
        else {
            System.out.println("Keep dreaming. You are not in relationship!!!");
        }
    }
    void getTogether() {
        if (isSingle()) {
            setSingle();
            System.out.println("Be happy. You are in a relationship!!!");
        }
        else {
            System.out.println("You are in a relationship, you may not cheat!!!");
        }
    }
    // Metode ini digunakan untuk mengecek apakah berat badan yang dimiliki merupakan berat badan ideal
    void isIdealWeight() {
        double idealWeight = 0;
        if(getGender().equals("Male")) {
            if (getHeight() >= 152.4) {
            idealWeight = 52 + 1.9 * ((getHeight() - 152.4) / 2.54);
            } else {
                idealWeight = 52;
            }
        } else {
            if (getHeight() >= 152.4) {
                idealWeight = 49 + 1.7 * ((getHeight() - 152.4) / 2.54);
            } else {
                idealWeight = 49;
            }
        }
        if (idealWeight == getWeight()) {
            System.out.println("You have an ideal weight.");
        } else if (idealWeight > getWeight()) {
            System.out.println("You are over than the ideal weight.");
        } else {
            System.out.println("You are lower than the ideal weight.");
        }
    }

    void sayHello(){
        System.out.println("Hello, my name is " + name);
    }

    // Metode Getter memungkinkan Anda untuk mengakses nilai variabel pribadi dengan cara yang terkontrol.
    // Di sini, metode getter disediakan untuk nama, berat badan, tinggi, warna rambut, warna kulit, jenis kelamin, dan usia.
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public boolean isSingle() {
        return isSingle;
    }

    // Metode ini mencoba untuk mengubah status hubungan (single / tidak tunggal) tanpa pemeriksaan apa pun.
    // Ini harus digunakan secara internal oleh kelas dan tidak dapat diakses langsung dari luar.
    // Oleh karena itu, ia dinyatakan sebagai pribadi.
    private void setSingle() {
        isSingle = !isSingle;
    }
}
