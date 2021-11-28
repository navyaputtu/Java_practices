import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;
import java.io.ObjectOutputStream;

public class ExternalizationTest {

	public static void main(String[] args)throws Exception {
		Scanner in=new Scanner(System.in);
		String fileName=in.nextLine();
		System.out.print("Want to [R]ead or [W]rite ?");
		String choice=in.nextLine();
		if(choice.equalsIgnoreCase("write")) {
			FileOutputStream fout=new FileOutputStream(fileName);
			ObjectOutputStream oos=new ObjectOutputStream(fout);
			System.out.print("employeeID:");
			int id=in.nextInt();
			System.out.print("employee name:");
			in.nextLine();
			String name=in.nextLine();
			System.out.print("Employee salary");
			float salary=in.nextFloat();
			Employee e=new Employee(id,name,salary);
			e.writeExternal(oos);;
			oos.close();
			fout.close();
	      }
		else if(choice.equalsIgnoreCase("read")) {
			FileInputStream fin=new FileInputStream(fileName);
			ObjectInputStream ois=new ObjectInputStream(fin);
			Employee e=new Employee();
			e.readExternal(ois);;
			System.out.println(e);
			ois.close();
			fin.close();
			
			
		
	}

	}
}
