import java.util.Scanner;


public class source_code_byte {

	public static void main(String[] args) {
	//DEKLARASI VARIABEL
	byte b1;
	byte b2;
	byte b3;
	//INISIALISASI VALUE
	b1 = 100;
	b2 = 50;
	//OPERASI VARIABEL
	b3 = (byte) (b1-73);
	//MENAMPILKAN HASIL
	System.out.println("b1 : " + b1);
	System.out.println("b2 : " + b2);
	System.out.println("b3 : " + b3);
	//MENGAMBIL IMPUT DARI KEYBOARD
	Scanner keyboar = new Scanner(System.in);
	System.out.println("tambahkan data : ");
	byte b4 = keyboar.nextByte();
	System.out.println("b4 : " + b4);

	}

}
