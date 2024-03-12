/*
 * Ödev
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
 eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , 
 şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 */
import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args){

        Scanner giris = new Scanner(System.in);

        String userName = "nefisebeyza";
        String password = "20052024";
        final int maxDeneme = 3; // Kullanıcıya verilecek maksimum deneme hakkı

        int kalanDeneme = maxDeneme; // Kalan deneme hakkı
        boolean girisBasarili = false;

        while (kalanDeneme > 0 && !girisBasarili) {
            System.out.print("Lütfen Kullanıcı Adınızı Giriniz: ");
            String girilenUserName = giris.nextLine();

            System.out.print("Lütfen Şifrenizi Giriniz: ");
            String girilenPassword = giris.nextLine();

            if(girilenUserName.equals(userName) && girilenPassword.equals(password)) {
                System.out.println("Kullanıcı Girişi Başarılı!");
                girisBasarili = true;
            } else {
                kalanDeneme--;
                System.out.println("Kullanıcı Adı veya Şifre Hatalı. Kalan deneme hakkınız: " + kalanDeneme);

                if (kalanDeneme == 0) {
                    System.out.println("Deneme hakkınız doldu. Hesabınız kilitlendi.");
                    break;
                }

                System.out.print("Yeni kullanıcı adı belirlemek istiyor musunuz? (Evet/Hayır): ");
                String cevap = giris.nextLine();

                if (cevap.equalsIgnoreCase("Evet")) {
                    System.out.print("Lütfen yeni kullanıcı adınızı giriniz: ");
                    userName = giris.nextLine(); // Yeni kullanıcı adını güncelle
                }

                System.out.print("Yeni şifre belirlemek istiyor musunuz? (Evet/Hayır): ");
                cevap = giris.nextLine();

                if (cevap.equalsIgnoreCase("Evet")) {
                    System.out.print("Lütfen yeni şifrenizi giriniz: ");
                    password = giris.nextLine(); // Yeni şifreyi güncelle
                    System.out.println("Kullanıcı adı ve şifre başarıyla güncellendi.");
                } else {
                    System.out.println("Şifre değiştirme işlemi iptal edildi.");
                }
            }
        }
    }
}
