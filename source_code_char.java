import java.util.Scanner;


public class source_code_char {

	public static void main(String[] args) {
	//DEKLARASI VARIABEL
	int nilai,nilai_2,nilai_3;
	char nilai1= 'A';
	char nilai2= 'B';
	//INISIALISASI VALUE
	nilai = 50;
	nilai_2 = 90;
	//OPERASI VARIABEL
	nilai_3 = 90-50;
	//MENAMPILKAN HASIL
	if(nilai >= 80){System.out.println("nilai 1: " + nilai1);}
	else{System.out.println("nilai 1: " + nilai2);}
	if(nilai_2 >= 80){System.out.println("nilai 2: " + nilai1);}
	else{System.out.println("nilai 2: " + nilai2);}
	if(nilai_3 >= 80){System.out.println("nilai 3: " + nilai1);}
	else{System.out.println("nilai 3: " + nilai2);}
	System.out.println("--karena--");
	System.out.println("nilai 1 : " + nilai);
	System.out.println("nilai 2 : " + nilai_2);
	System.out.println("nilai 3 : " + nilai_3);
	//MENGAMBIL IMPUT DARI KEYBOARD
	int C;
	Scanner keyboard = new Scanner(System.in);
	System.out.print("masukkan nilai anda : ");
	C = keyboard.nextInt();
	if(C>=80){System.out.println("selamat nilai anda: " + nilai1);}
	else{System.out.println("selamat nilai anda: " + nilai2);}
		
		

	}

}
