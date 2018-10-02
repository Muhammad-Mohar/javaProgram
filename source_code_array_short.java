import java.util.Scanner;


public class source_code_array_short {

	public static void main(String[] args) {
		//DEKLARASI VARIABEL
		short[] data = new short[3];
		//INISIALISASI VALUE
		data[0] = 1500;
		data[1] = 2000;
		//OPERASI VARIABEL
		data[2] = (short)(data[0]+data[1]);
		//MENAMPILKAN HASIL
		System.out.println("a : " + data[0]);
		System.out.println("b : " + data[1]);
		System.out.println("c : " + data[2]);
		//MENGAMBIL IMPUT DARI KEYBOARD
		Scanner keyboard = new Scanner(System.in);
		System.out.println("tambahkan data");
		short[] data2 = new short[2];
		data[0] = keyboard.nextShort();
		data[1] = keyboard.nextShort();
		System.out.println("----data tambahan------");
		System.out.println("d :" + data[0]);
		System.out.println("d :" + data[1]);


	}

}
