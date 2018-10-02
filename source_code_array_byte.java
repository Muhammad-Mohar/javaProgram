import java.util.Scanner;


public class source_code_array_byte {

	public static void main(String[] args) {
	//DEKLARASI VARIABEL
	byte[] b = new byte[4];
	//INISIALISASI VALUE
	b[0] = 100;
	b[1] = 80;
	b[2] = 60;
	//OPERASI VARIABEL
	b[3] = 60-20;
	//MENAMPILKAN HASIL
	System.out.println("B1 : " + b[0]);
	System.out.println("B2 : " + b[1]);
	System.out.println("B3 : " + b[2]);
	System.out.println("B4 : " + b[3]);
	//MENGAMBIL IMPUT DARI KEYBOARD
	String[] angka_tambahan = new String[5];
	Scanner keyboard = new Scanner(System.in);
	for( int i = 0; i < angka_tambahan.length; i++ )
	{System.out.print(i);
	angka_tambahan[i] = keyboard.nextLine();}
	System.out.println("-angka tambahan--");
	for(int i=0;i<angka_tambahan.length;i++)
	{System.out.println(angka_tambahan[i]);};


	}

}
