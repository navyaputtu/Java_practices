import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ProjectDetails {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		FileOutputStream fout=null;
		ObjectOutputStream oos=null;
		String fileName=in.nextLine();
		fout=new FileOutputStream(fileName);
		oos=new ObjectOutputStream(fout);
		String cont="";
		do {
			System.out.println("Project ID :");
			int projID=in.nextInt();
			System.out.println("Project Name :");
			String projTitle=in.next();
			System.out.println("Project Duration :");
			float projDuration=in.nextFloat();
			Project pro=new Project(projID,projTitle,projDuration);
			oos.writeObject(pro);
			System.out.println("want to continue [yes/No])");
			cont =in.nextLine();
			cont =in.nextLine();
		}while(cont.equalsIgnoreCase("Yes"));
		oos.close();
		fout.close();
	
	
			
		}

	}


