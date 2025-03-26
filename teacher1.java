import java.util.Scanner;
class person{
String name;
String gender;
String address;
person(String na,String ge,String ad){
this.name=na;
this.gender=ge;
this.address=ad;
}
}
class employee extends person{
int emp_id;
String company_name;
String qualification;
double salary;
employee(String na,String ge,String ad,int id,String co_name,String qua,double sa){
super(na,ge,ad);
this.emp_id=id;
this.company_name=co_name;
this.qualification=qua;
this.salary=sa;
}
}
class teacher1 extends employee{
int teacher_id;
String subject;
String department;
teacher1(String na,String ge,String ad,int id,String co_name,String qua,double sa,int t_id,String sub,String dep){
super(na,ge,ad,id,co_name,qua,sa);
this.teacher_id=t_id;
this.subject=sub;
this.department=dep;
}


void display() {
   System.out.println("_____________Person Details__________");
   System.out.println("Person Name: " + name); 
   System.out.println("Gender: " + gender); 
   System.out.println("Address: " + address); 
   System.out.println("________________Employee details___________"); 
   System.out.println("Employee id: " + emp_id);
   System.out.println("Company: " + company_name); 
   System.out.println("Qualification: " + qualification);
   System.out.println("Salary: " + salary); 
   System.out.println("________________Teacher Information__________");
   System.out.println("Teacher ID: " + teacher_id); 
   System.out.println("Subject: " + subject); 
   System.out.println("Department: " + department); 
} 
public static void main(String[] args){
System.out.println("Enter the number of information you store:");
Scanner sc1=new Scanner(System.in);
int i;
int num=sc1.nextInt();
teacher1[] arr=new teacher1[num];
for(i=0;i<num;i++){
 Scanner sc = new Scanner(System.in); 
  System.out.println("\nEnter Person  Name: "); 
  String p_name = sc.nextLine(); 
  System.out.println("\nEnter Gender: "); 
  String Gender = sc.nextLine(); 
  System.out.println("\nEnter Address of person: "); 
  String address = sc.nextLine();
  System.out.println("\nEnter Employee id: "); 
  int id = sc.nextInt();
  sc.nextLine();
  System.out.println("\nEnter Company Name: "); 
  String Company = sc.nextLine(); 
  System.out.println("\nEnter Qualification: "); 
  String Qualification = sc.nextLine(); 
  System.out.println("\nEnter Salary: "); 
  double salary = sc.nextInt(); 
  sc.nextLine();
  System.out.println("\nEnter Teacher id: "); 
  int t_id = sc.nextInt(); 
  sc.nextLine();
  System.out.println("\nEnter Subject: "); 
  String subject = sc.nextLine(); 
  System.out.println("\nEnter Department: "); 
  String department = sc.nextLine(); 
  arr[i]=new teacher1(p_name,Gender,address,id,Company,Qualification,salary,t_id,subject,department);

}
System.out.println("\n********* Informations of all the Details ************");
 for ( i = 0; i < num; i++) { 
  arr[i].display(); 
}
sc1.close();
}
}








