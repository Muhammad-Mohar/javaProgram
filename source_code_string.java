import java.util.Scanner;


public class source_code_string {

	public static void main(String[] args) {
		//DEKLARASI VARIABEL
		String nama;
        String nim;
        String jurusan;
        String tempat_lahir;
        String tanggal_lahir;
        String bulan_lahir;
        String tahun_lahir;
        //INISIALISASI VALUE
        nama = "muhammad mohar";
        nim =  "D0217321";
        jurusan = "Inforatika";
        tempat_lahir = "bala";
        tanggal_lahir = "13";
        bulan_lahir = "juli";
        tahun_lahir = "1997";
        //OPERASI VARIABEL
        String ttl;
        ttl = (tempat_lahir + "," + tanggal_lahir + "-" + bulan_lahir + "-" + tahun_lahir);
        //MENAMPILKAN HASIL
        System.out.println("----- Biodata Mahasiswa-------");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("TTL : " + ttl);
        //MENGAMBIL INPUT DARI KEYBOARD
        String alamat;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("masukkan Alamat : ");
        alamat = keyboard.next();
        System.out.println("Alamat : " + alamat);
        
	}

}
