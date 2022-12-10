public class Standart extends Kamar{


    private String kdKamar;
    private String jenisKamar;
    private int hargaKamar;

    public Standart(){
        this.kdKamar = "S01";
        this.hargaKamar = 500;
        this.jenisKamar = "Kamar Standart";
    }
    public String getKdKamar() {
        return kdKamar;
    }

    public void setKdKamar(String kdKamar) {
        this.kdKamar = kdKamar;
    }

    public int getHargaKamar() {
        return hargaKamar * getJumPesanan();
    }

    public void setHargaKamar(int hargaKamar) {
        this.hargaKamar = hargaKamar;
    }

    @Override
    public void inputPemesanan() {

    }

    @Override
    public void display() {
        System.out.println("Jenis kamar : " + this.jenisKamar);
        System.out.println("Kode kamar  : " + this.kdKamar);
        //System.out.println("Jumlah pesanan: " + this.jumPesanan);
        System.out.println("Harga kamar : " + this.hargaKamar);
        System.out.println("Total harga : " + this.getHargaKamar());
    }
}
