public abstract class Kamar {


 //   private int kdKamar;
    private int jumPesanan;
//    private String jenisKamar;
//    private int hargaKamar;

//    public Kamar(int kodeKmr, int jumPesanan){
//        this.jenisKamar = "VIP";
//        this.hargaKamar = 1000;
//        this.kdKamar = kodeKmr;
//        this.jumPesanan = jumPesanan;
//    }



//    public void display(){
//
//        System.out.println("Jenis kamar : " + this.jenisKamar);
//        System.out.println("Kode kamar  : " + this.kdKamar);
//        System.out.println("Jumlah pesanan: " + this.jumPesanan);
//        System.out.println("Harga kamar : " + this.hargaKamar);
////        System.out.println("Total harga : " + this.getHargaKamar());
//    }

//    public void setKdKamar(int kdKamar) {
//        this.kdKamar = kdKamar;
//    }
//
//    public int getKdKamar() {
//        return kdKamar;
//    }

    public void setJumPesanan(int jumPesanan) {
        this.jumPesanan = jumPesanan;
    }

    public int getJumPesanan() {
        return jumPesanan;
    }


public abstract void display();
    public abstract void inputPemesanan();


}
