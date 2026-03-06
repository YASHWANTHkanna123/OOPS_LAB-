class hello{
public int a=10;
private int b=20;
protected int c=30;
int d=40;
public void show(){
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
}
}

public class Modifiers1{
public static void main(String[] args){
hello obj=new hello();
obj.show();
}
}



