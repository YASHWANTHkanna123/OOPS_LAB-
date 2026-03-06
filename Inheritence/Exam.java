import java.util.Scanner;

class Student{
int roll;
String name;
void getStudent(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Roll Number:");
roll=sc.nextInt();
System.out.println("Enter Name:");
name=sc.next();
}
void showStudent(){
System.out.println("Roll:"+roll);
System.out.println("Name:"+name);
}
}

class Marks extends Student{
int m1,m2,m3;
void getMarks(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Mark1:");
m1=sc.nextInt();
System.out.println("Enter Mark2:");
m2=sc.nextInt();
System.out.println("Enter Mark3:");
m3=sc.nextInt();
}
void showMarks(){
System.out.println("Mark1:"+m1);
System.out.println("Mark2:"+m2);
System.out.println("Mark3:"+m3);
}
}

class Result extends Marks{
int total;
double avg;

void calculate(){
total=m1+m2+m3;
avg=total/3.0;
}

void displayResult(){
System.out.println("Total:"+total);
System.out.println("Average:"+avg);
}
}

public class Exam{
public static void main(String[] args){
Result r=new Result();
r.getStudent();
r.getMarks();
r.calculate();
r.showStudent();
r.showMarks();
r.displayResult();
}
}