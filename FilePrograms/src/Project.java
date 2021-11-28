import java.io.Serializable;
public class Project implements Serializable{
	
		private int projID;
		private String projTitle;
		private float projDuration;
		public Project(int projID, String projTitle, float projDuration) {
		this.projID = projID;
		this.projTitle = projTitle;
		this.projDuration = projDuration;
		}
		public int getProjID() {
		return projID;
		}
		public String getProjTitle() {
		return projTitle;
		}
		public float getProjDuration() {
		return projDuration;
		}
		public void setProjID(int projID) {
		this.projID = projID;
		}
		public void setProjTitle(String projTitle) {
		this.projTitle = projTitle;
		}
		public void setProjDuration(float projDuration) {
		this.projDuration = projDuration;
		}
		@Override
		public String toString() {
		return "Project [projID=" + projID + ", projTitle=" + projTitle + ", projDuration=" + projDuration + "]";
		}




		}


