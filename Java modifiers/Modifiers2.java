class Test{
static int x=10;
final int y=20;
static void display(){
System.out.println("Static method");
}
}
public class Modifiers2{
public static void main(String[] args){
Test.display();
System.out.println(Test.x);
}
}

