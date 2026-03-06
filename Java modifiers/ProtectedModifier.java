class ProtectedModifier{
protected int a=30;
void display(){
System.out.println(a);
}
public static void main(String[] args){
ProtectedModifier obj=new ProtectedModifier();
obj.display();
}
}