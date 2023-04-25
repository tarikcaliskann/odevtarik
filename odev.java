// 22120205030 TARIK ÇALIŞKAN
package ODEV;
  

	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;

public class odev {

    public static void main(String[] args) {
        String dosya = "arazi.txt";
        int sayac = 0;
        
        try {
		FileReader fr= new FileReader(dosya);
            BufferedReader br = new BufferedReader(fr);
            String satır = br.readLine();
            while (satır != null) {
                for (int i = 0; i < satır.length(); i++) {
                    if (satır.charAt(i) == '#') {
                        sayac++;
                    }
                }
                satır = br.readLine();
            }
            br.close();
        } catch (IOException e) {
           
        }
        
        System.out.println(" böcek sayısı: " + sayac/3);
    }
}


	

	