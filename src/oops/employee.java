package oops;

public class employee {
		
		String name;
		int salary;
		int empNum;
		
		public employee(String p1, int p2, int p3) {
			
			name = p1;
			salary = p2;
			empNum = p3;
		}
		
		public void empInfo(){
			
			System.out.println(name);
			System.out.println(salary);
			System.out.println(empNum);
		}
	
}
