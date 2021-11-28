import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;

public class FileWriteName {

	public static void main(String[] args) throws IOException{
		Scanner sc=new  Scanner(System.in);
		File file=null;
		String cont="";
		do {
			String fileName=sc.nextLine();
				file =new File(fileName);
			if(file.exists()) {
				System.out.println("File already exists,want to replace [yes]/[no]?");
				cont=sc.nextLine();
				
			}
			else
				break;
			
		}while(cont.equalsIgnoreCase("no"));
		FileWriter fw=new FileWriter(file);
		int ch;
		while((ch=System.in.read())!=90)
              fw.write(ch);
              fw.close();
		

	}

}
