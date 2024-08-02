import UserInfo.RegInfo;

import java.util.Scanner;

public class Main {
    static Scanner forNum = new Scanner(System.in);
    static Scanner forText = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("Welcome to Famouse Brands shop app");

            System.out.println("Bo`limni tanlang: 1.Ro`yxatdan o`tish / 2.Kirish");
            int kirish = forNum.nextInt();

            switch (kirish) {
                case 1 -> {
//                    //Ro`yxatdan o`tish
//                    System.out.println("Isim va Familiyangizni kiriting: ");
//                    RegInfo fullNameInfo = new RegInfo(forText.nextLine());
//                    String fullName = fullNameInfo.getFullName();
//                    System.out.println("Yoshingizni kiriting: ");
//                    RegInfo ageInfo = new RegInfo(forNum.nextInt());
//                    int age = ageInfo.getAge();
//                    System.out.println("Telefon raqamingizni kiriting: ");
//                    RegInfo phonNumInfo = new RegInfo(forNum.nextInt());
//                    int phonNumber = phonNumInfo.getPhonNumber();
//                    System.out.println("Parolingizni kiriting: ");
//                    RegInfo passwordInfo = new RegInfo(forNum.nextInt());
//                    int password = passwordInfo.getPassword();
//                    System.out.println("Karta raqamingizni kiriting: ");
//                    RegInfo cardNumInfo = new RegInfo(forText.nextLine());
//                    String cardNum = String.valueOf(cardNumInfo.getCardNumber());
//
//                    System.out.println("Tabriklayman siz ro`yxadan o`tdingiz");
                }
                case 2 -> {
                    System.out.println("Kirish");
                }
            }
        }
    }
}