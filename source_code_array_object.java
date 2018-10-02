import java.util.Scanner;


public class source_code_array_object {

	public static void main(String[] args) {
		//DEKLARASI VARIABEL
		Object[] animals= new Object[2];
		//INISIALISASI VALUE
		animals[0] = "kucing";
		animals[1] = "kelinci";
		//MENAMPILKAN HASIL
		System.out.println("jenis peliharaan saya : " + animals[0]);
		System.out.println("jenis peliharaan saya : " + animals[1]);
		//MENGAMBIL IMPUT DARI KEYBOARD
		Object[] animals1= new Object[2];
		Scanner keyboard = new Scanner(System.in);
		System.out.println("masukkan nama peliharaan :");
		animals1[0] = keyboard.next();
		System.out.println("masukan nama kelinci :");
		animals1[1] = keyboard.next();
		System.out.println("nama kucing saya : " + animals1[0]);
		System.out.println("nama kelinci saya : " + animals[1]);
	}

}
