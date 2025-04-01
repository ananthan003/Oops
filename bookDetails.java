import java.util.Scanner;
class Publisher{
String publisher;
Publisher(String pub) {
this.publisher=pub;
}
}
class Book extends Publisher{
String book;
Book(String pub,String boo){
super(pub);
book=boo;
}
}
class Literature extends Book{
String category;
Literature(String pub,String boo){
super(pub,boo);
}
void display(){
System.out.println("publisher :"+ publisher);
System.out.println("BOOK :"+ book);
}
}
class Fiction extends Book{
Fiction(String pub,String boo){
super(pub, boo);
}
void display(){
System.out.println("publisher :"+ publisher);
System.out.println("BOOK :"+ book);
}}

public class bookDetails{
public static void main(String[] args) {
System.out.println("\nEnter the no of litertature books");
Scanner sc1 = new Scanner(System.in);
int num = sc1.nextInt();
Literature arr[]=new Literature[num];
System.out.println("\nEnter the literture BOOK datails");
int x=0,j=0;
Scanner sc =new Scanner(System.in);
for(int i=0;i<num;i++)
{
x=i+1;
System.out.println("\n"+x+").");
System.out.println("\nBooks:");
String boo =sc.next();
System.out.println("\npublisher:");
String pub =sc.next();

arr[i]=new Literature(boo,pub);
}



System.out.println("\nEnter the no of fiction books");

int num1 = sc1.nextInt();
Fiction arr1[]=new Fiction[num1];
System.out.println("\nEnter the Fiction BOOK datails");
int x1 = 0,j1=0;
for(int i=0;i<num1;i++)
{
x1 = i +1;
System.out.println("\n"+x+").");
System.out.println("\nBooks:");
String boo =sc.next();
System.out.println("\npublisher:");
String pub =sc.next();

arr1[i]=new Fiction(boo,pub);
}
sc.close();
sc1.close();

 System.out.println("\n-----------INFORMATION OF ALL LITERATURE BOOKS------------------");
 for(int i=0;i<num;i++){
 j=i+1;
 System.out.println("\n"+j+").");
 arr[i].display();
 }
  System.out.println("\n-----------INFORMATION OF ALL FICTION BOOKS------------------");
 for(int i=0;i<num1;i++){
 j1=i+1;
 System.out.println("\n"+j1+").");
 arr1[i].display();
 }
 
sc1.close();
}
}

