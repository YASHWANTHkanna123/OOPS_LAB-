class PrivateModifier{
private int a=50;
void show(){
System.out.println(a);
}
public static void main(String[] args){
PrivateModifier obj=new PrivateModifier();
obj.show();
}
}