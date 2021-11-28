import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;



public class ProjectDetails1 {



public static void main(String[] args) throws Exception {
Scanner sc = new Scanner(System.in);
String fileName = sc.nextLine();
FileInputStream fin = new FileInputStream(fileName);
ObjectInputStream ois = new ObjectInputStream(fin);
//System.out.println("Enter details:");
while(true) {
try {
Project pro = (Project)ois.readObject();
if(pro.getProjDuration()>1)
System.out.println(pro);
}
catch(IOException | ClassNotFoundException ex) {
System.out.println("Not found" +ex);
break;
}
}





}
}