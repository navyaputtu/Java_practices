import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;



public class FileCopy {



public static void main(String[] args)throws IOException {
Scanner in=new Scanner(System.in);
FileInputStream fin=null;
FileOutputStream fout=null;
String sourceFile,targetFile;
sourceFile=in.nextLine();
targetFile=in.nextLine();
try {
fin=new FileInputStream(sourceFile);
try {
fout=new FileOutputStream(targetFile);
System.out.println(sourceFile+"is copied to"+targetFile);
int ch;
while((ch=fin.read())!=-1)
fout.write(ch);
fin.close();
fout.close();

}catch(FileNotFoundException ex) {
System.out.println("file creation error");
}
}catch(FileNotFoundException ex) {
System.out.println(sourceFile+"does not exist"+targetFile);
}




}



}
