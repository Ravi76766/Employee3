public class Employe {
 String name;
 int id;
 double salary;
 String address;




 public Employe(String name, int id, double salary,String address) 
 {
    this.name = name;
    this.id = id;
    this.salary = salary;
    this.address=address;

 }
 
 public void display()
 {
    System.out.println("Employee Name:"+name);
    System.out.println("Employee ID:"+id);
    System.out.println("Employee Salary:"+salary);
    System.out.println("Employee Address:"+address);

 }

 public static void main(String[] args) {
    Employe emp=new Employe("Ravi", 147,50000.0,"Bagalakot");
    emp.display();
}
}

