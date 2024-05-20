package soal1;

public class Female extends Human { // Class Female merupakan subclass dari class Human
    // Constructor adalah metode khusus yang disebut ketika sebuah objek baru dibuat.
    // Ini digunakan untuk menginisialisasi keadaan objek.
    // Konstruktor ini mengambil tujuh argumen untuk menginisialisasi attribute objek Female.
    // Berbeda dengan konstruktor Human untuk gendernya langsung sudah dibuat Female.
    public Female(String name, String skinColor, double height, double weight, int age, String hairColor, boolean isSingle) {
        super(name, skinColor, height, weight, age, "Female", hairColor, isSingle);
    }
    @Override
    // Metode ini overrides metode isIdealWeight dari class Human
    // Versi ini hanya mempertimbangkan berat ideal untuk wanita.
    void isIdealWeight() {
        double idealWeight = 0;

        if (getHeight() >= 152.4) {
            idealWeight = 49 + 1.7 * ((getHeight() - 152.4) / 2.54);
        } else {
            idealWeight = 49;
        }
        if (idealWeight == getWeight()) {
            System.out.println("You have an ideal weight.");
        } else if (idealWeight > getWeight()) {
            System.out.println("You are over than the ideal weight.");
        } else {
            System.out.println("You are lower than the ideal weight.");
        }
    }
    @Override
    // Metode ini overrides metode countCalories(double calories) dari class Human
    // Versi ini hanya mempertimbangkan berat, tinggi, dan usia untuk wanita.
    void countCalories(double calories){
        double idealCalories = 0;
        if (calories == 0) {
            System.out.println("You doesn't put anything!!!");
            return;
        }

        idealCalories = 10 * getWeight() + 6.25 * getHeight() - 5 * getAge() - 161;
        if (idealCalories == calories) {
            System.out.println("You are eating healthy.");
        } else if (idealCalories < calories) {
            System.out.println("You are eating for bulking.");
        } else {
            System.out.println("You are eating for slimming.");
        }
    }
}
