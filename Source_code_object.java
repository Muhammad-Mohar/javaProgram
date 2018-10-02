import java.util.Scanner;


public class Source_code_object {

	public static void main(String[] args) {
		//DEKLARASI VARIABEL
		Object cat = new Object();
		Object rabbit = new Object();
		//INISIALISASI VALUE
		cat = "meong";
		rabbit = "cicit";
		//MENAMPILKAN HASIL
		System.out.println("nama kucing saya  : " + cat);
		System.out.println("nama kelinci saya : " + rabbit);
		//MENDAPATKAN INPUT DARI KEYBOARD
		Object mongkey = new Object();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("masukkan nama monyet :");
		mongkey = keyboard.next();
		System.out.println("Nama monyet saya : " + mongkey);
		
	}

}
