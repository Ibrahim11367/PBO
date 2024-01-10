import java.util.Scanner;

public class Sekolah{
    Scanner input = new Scanner(System.in);
    public void tampilNama(String nama){
        System.out.println("Nama sekolah: "+nama);
    }

    public void jumlahSiswa(int rombel, int jumlahSiswa) {
        int total = rombel*jumlahSiswa;
        System.out.prinln("Jumlah Siswa: "+total);
    }
}
