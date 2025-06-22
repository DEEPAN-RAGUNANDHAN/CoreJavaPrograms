package demo;
import demo.StudentEntity;
public class StudentEntityDemo {

	public static void main(String[] args) {
		StudentEntity se = StudentEntity.getObj();
		se.setStid(101);
		se.setStname("Deepan");
		StudentEntity se2 = StudentEntity.getObj();
		System.out.println(se);
		System.out.println(se2);


		
		 
		

	}

}
