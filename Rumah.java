public class Rumah {
    public static void main(String{} args) {
        Rumah r = new Rumah(); //objek
        r.tampillokasi();
        r.tampilukuran(panjang:10, lebar:8);
    }

    public void tampilUkuran(int panjang, int lebar) {
        int luas = panjang * lebar;
        System.out.println("ukuran Rumah: "+luas);
    }

    public void tampillokasi(){
        String alamat = "Malang";
        System.out.println("Alamat Rumah: "+alamat);
    }

}
