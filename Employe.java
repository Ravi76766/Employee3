public class Employe {
 String name;
 int id;
 double salary;





 public Employe(String name, int id, double salary,) 
 {
    this.name = name;
    this.id = id;
    this.salary = salary;
   

 }
 
 public void display()
 {
    System.out.println("Employee Name:"+name);
    System.out.println("Employee ID:"+id);
    System.out.println("Employee Salary:"+salary);
   

 }

 public static void main(String[] args) {
    Employe emp=new Employe("Ravi", 147,50000);
    emp.display();
}
}

