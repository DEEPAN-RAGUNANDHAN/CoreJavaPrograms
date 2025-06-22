package demo;

public class StudentEntity {
	public class getObj extends StudentEntity {

	}

	private static StudentEntity se = new StudentEntity();
	public static StudentEntity getObj(){
		return se;
	}
	@Override
	public String toString() {
		return "StudentEntity [stid=" + stid + ", stname=" + stname + "]";
	}

	private int stid;
	private String stname;
	
	private StudentEntity() {
		super();
		
	}

	public int getStid() {
		return stid;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

}
