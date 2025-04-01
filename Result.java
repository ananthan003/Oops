import java.util.Scanner;


class Sports {
String sport;
int rating;


 Sports(String spo, int ra) {
  sport = spo;
  rating = ra;
}
}


class Student extends Sports {
String grade;
double overallPer;


Student(String spo, int ra, String gd, double per) {
super(spo, ra); 
grade = gd;
overallPer = per;
    }
}


public class Result extends Student {


Result(String spo, int ra, String gd, double per) {
super(spo, ra, gd, per);
}


void display() {
System.out.println("\nSports Details of Student");
System.out.println("Sport: " + sport);
System.out.println("Rating: " + rating);

System.out.println("\nAcademic Details of Student");
System.out.println("Academic Grade: " + grade);
System.out.println("Overall percentage: " + overallPer);
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("\nEnter the Sports Details of Student");

System.out.print("\nSport: ");
String a = sc.next();  

System.out.print("\nSport Rating out of 10: ");
int b = sc.nextInt();  
System.out.println("\nEnter the Academic Details of Student");

System.out.print("\nAcademic Grade: ");
String c = sc.next(); 
System.out.print("\nOverall percentage: ");
double d = sc.nextDouble();  

sc.close();


Result obj = new Result(a, b, c, d);
obj.display();
}
}

