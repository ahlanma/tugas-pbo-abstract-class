import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vip vip = new Vip();
        Standart standart = new Standart();
        int jumPsn;
        System.out.println("+------------------------------+");
        System.out.println("| No | Jenis Kamar |  Harga    |");
        System.out.println("+------------------------------+");
        System.out.println("| 1  | VIP        | 1000k /mlm |");
        System.out.println("| 2  | Standar    | 5000k /mlm |");
        System.out.println("+------------------------------+");
        System.out.println("");
        System.out.print("Pilih kamar : ");
        int pilih = input.nextInt();

        switch (pilih) {
            case 1:
                System.out.print("Jumlah pesanan : ");
                jumPsn = input.nextInt();
                vip.setJumPesanan(jumPsn);
                vip.display();
                break;

            case 2:
                System.out.print("Jumlah pesanan : ");
                jumPsn = input.nextInt();
                standart.setJumPesanan(jumPsn);
                standart.display();
                break;
            default:
                System.out.println("Errorr!!");
                break;

        }
    }
}
