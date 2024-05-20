package soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) { // Fungsi main adalah fungsi utama yang dieksekusi ketika program dijalankan.
        Scanner in = new Scanner(System.in);
        System.out.print("Berapa objek Human/Male/Female yang ingin dibuat: ");
        int banyakObjek = in.nextInt();
        in.nextLine();
        Human[] humans = new Human[banyakObjek];
        for (int i = 0; i < banyakObjek; i++) {
            String name;
            String skinColor;
            double height;
            double weight;
            int age;
            String hairColor;
            String gender;
            boolean isSingle;
            System.out.print("What's your name: ");
            name = in.nextLine();
            System.out.print("What's your skin color: ");
            skinColor = in.next();
            System.out.print("What's your height: ");
            height = in.nextDouble();
            System.out.print("What's your weight: ");
            weight = in.nextDouble();
            System.out.print("What's your age: ");
            age = in.nextInt();
            System.out.print("What's your hair color: ");
            hairColor = in.next();
            System.out.print("What's your gender(Human/Male/Female): ");
            gender = in.next();
            while(true) {
                if (gender.equals("Human") || gender.equals("Male") || gender.equals("Female")) {
                    break;
                } else {
                    System.out.print("What's your gender(Human/Male/Female): ");
                    gender = in.next();
                }
            }
            System.out.print("What's your relationship status(true/false): ");
            isSingle = in.nextBoolean();
            in.nextLine();
            if (gender.equals("Human")) {
                // Membuat objek Human
                humans[i] = new Human(name, skinColor, height, weight, age, gender, hairColor, isSingle);
                humans[i].sayHello(); // Memanggil method sayHello() untuk menampilkan nama humans[i].
                humans[i].countCalories(1234); // Memanggil method countCalories() untuk menghitung kalori dengan input total kalori 1234.
                humans[i].countCalories(new String[]{"Chicken breast"}, new int[]{1}); // Memanggil method countCalories() untuk menghitung kalori dengan input 1 dada ayam.
                humans[i].breakUp(); // Memanggil method breakUp() untuk mengubah status hubungan humans[i] menjadi single (lajang).
                humans[i].getTogether(); // Memanggil method getTogether() untuk mengubah status hubungan humans[i] menjadi tidak single (berpasangan).
                humans[i].isIdealWeight(); // Memanggil method isIdealWeight() untuk mengecek apakah berat badan humans[i] ideal.
                System.out.println(); // Mencetak baris kosong untuk memberi jarak.
                continue;
            } if (gender.equals("Male")) {
            // Membuat objek Male bernama humans[i]
            humans[i] = new Male(name, skinColor, height, weight, age, hairColor, isSingle);
            humans[i].sayHello(); // Memanggil method sayHello() untuk menampilkan nama humans[i].
            humans[i].countCalories(1473.75); // Memanggil method countCalories() untuk menghitung kalori dengan input total kalori 1473.75.
            humans[i].countCalories(new String[]{}, new int[]{}); // Memanggil method countCalories() untuk menghitung kalori dengan input 10 dada ayam.
            humans[i].breakUp(); // Memanggil method breakUp() untuk mengubah status hubungan humans[i] menjadi single (lajang).
            humans[i].getTogether(); // Memanggil method getTogether() untuk mengubah status hubungan humans[i] menjadi tidak single (berpasangan).
            humans[i].isIdealWeight(); // Memanggil method isIdealWeight() untuk mengecek apakah berat badan humans[i] ideal.
            System.out.println(); // Mencetak baris kosong untuk memberi jarak.
                continue;
            }
            // Membuat objek Female
            humans[i] = new Female(name, skinColor, height, weight, age, hairColor, isSingle);
            humans[i].sayHello(); // Memanggil method sayHello() untuk menampilkan nama humans[i].
            humans[i].countCalories(1500); // Memanggil method countCalories() untuk menghitung kalori dengan input total kalori 1500.
            humans[i].countCalories(new String[]{"Chicken breast"}, new int[]{1}); // Memanggil method countCalories() untuk menghitung kalori dengan input 1 dada ayam.
            humans[i].breakUp(); // Memanggil method breakUp() untuk mengubah status hubungan humans[i] menjadi single (lajang).
            humans[i].getTogether(); // Memanggil method getTogether() untuk mengubah status hubungan humans[i] menjadi tidak single (berpasangan).
            humans[i].isIdealWeight(); // Memanggil method isIdealWeight() untuk mengecek apakah berat badan humans[i] ideal.
            System.out.println(); // Mencetak baris kosong untuk memberi jarak.
        }
    }
}
