package oops;

public class runnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee emp1 = new employee("Arnel", 10000, 1001);
//		emp1.name = "Arnel";
//		emp1.salary = 10000;
//		emp1.empNum = 1001;
		emp1.empInfo();
		employee emp2 = new employee("Ivy", 15000, 1001);
//		emp2.name = "Ivy";
//		emp2.salary = 15000;
//		emp2.empNum = 1003;
		emp2.empInfo();
		employee emp3 = new employee("Jame", 20000, 1001);
//		emp3.name = "Jame";
//		emp3.salary = 20000;
//		emp3.empNum = 1003;
		emp3.empInfo();
		
		ParentClass p1 = new ParentClass();
		p1.grade = 10;
		p1.rollNo = 100;
		p1.name = "mike";	
		
		ChildClass c1 = new ChildClass();
		c1.schoolName = "STI";
		c1.grade = 90;
		p1.rollNo = 99;
		p1.name = "Joe";	
		
	}

}
