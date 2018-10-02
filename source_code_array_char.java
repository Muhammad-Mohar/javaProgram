import java.util.Scanner;


public class source_code_array_char {

	public static void main(String[] args) {
	//DEKLARASI VARIABEL
	int[] data= new int[3];
	char nilai1= 'A';
	char nilai2= 'B';
	//INISIALISASI VALUE
	data[0] = 50;
	data[1] = 90;
	//OPERASI VARIABEL
	data[2] = 90-50;
	//MENAMPILKAN HASIL
	if(data[0] >= 80){System.out.println("nilai 1: " + nilai1);}
	else{System.out.println("nilai 1: " + nilai2);}
	if(data[1] >= 80){System.out.println("nilai 2: " + nilai1);}
	else{System.out.println("nilai 2: " + nilai2);}
	if(data[2] >= 80){System.out.println("nilai 3: " + nilai1);}
	else{System.out.println("nilai 3: " + nilai2);}
	System.out.println("--karena--");
	System.out.println("nilai 1 : " + data[0]);
	System.out.println("nilai 2 : " + data[1]);
	System.out.println("nilai 3 : " + data[2]);
	//MENGAMBIL IMPUT DARI KEYBOARD
	int[] data2= new int[2];
	Scanner keyboard = new Scanner(System.in);
	System.out.print("masukkan nilai anda : ");
	data2[0] = keyboard.nextInt();
	if(data[0]>=80){System.out.println("selamat nilai anda: " + nilai1);}
	else{System.out.println("selamat nilai anda: " + nilai2);}
	if(data[1]>=80){System.out.println("selamat nilai anda: " + nilai1);}
	else{System.out.println("selamat nilai anda: " + nilai2);}
				
	}

}
