import java.util.Scanner;

public class user_login {
    public static void main(String[] args) {
        String username, password ;
        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı Adınızı Giriniz: ");
        username= input.nextLine();

        System.out.println("Şifrenizi Giriniz: ");
        password=input.nextLine();


        if (username.equals("patika") && password.equals("java123")){
            System.out.println("Sisteme Giril Yapıldı!");

        }else{
            System.out.println("Bilgileriniz Yanlış!");
        }
    }

}
