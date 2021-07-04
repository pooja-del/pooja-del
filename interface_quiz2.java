import java.io.*;
import java.util.*;
interface Drawable
{
void draw();
static int cube(int x)
{
return x*x*x;
}
}
class Rectangle implements Drawable{
public void draw()
{
System.out.println("Drawing Rectangle");
}
}
class Test{
public static void main(String[] args)
{
//Drawable d=new Drawable();  //object of an interface cannot be created;
System.out.println(Drawable.cube(3)); //here we are calling a method by its class(interface)
}
}
