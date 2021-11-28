import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
public class Employee implements Externalizable {
        private int employeeID;
		private String employeeName;
		private float salary;
		public Employee() {
			this(0,"",0);
		}
		public Employee(int employeeID,String employeeName,float salary) {
			this.employeeID=employeeID;
			this.employeeName=employeeName;
			this.salary=salary;
		}
		public int getEmployeeID() {
			return employeeID;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public float getSalary() {
			return salary;
		}
		public void setEmployeeID(int employeeID) {
			this.employeeID = employeeID;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", salary=" + salary + "]";
		}
		@Override
	    public void writeExternal(ObjectOutput out) throws IOException{
			out.writeInt(this.employeeID);
			out.writeObject(this.employeeName);
			out.writeFloat(this.salary);
		}
		@Override
		 public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException{
			this.employeeID=in.readInt();
			this.employeeName=(String) in.readObject();
			this.salary=in.readFloat();
		
			}

	}



