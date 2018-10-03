interface Sturoll
{
void rollno();
}
interface Stuname extends Sturoll
{
void name();
}
interface Stubranch extends Sturoll
{
void branch();
}
class STUDENT implements Stuname
{
public void rollno()
{
System.out.println("03");
}
public void name()
{
System.out.println("Aman");
}
public void branch()
{
System.out.println("IT");
}
public static void main(String[]args)
{
STUDENT S = new STUDENT();
System.out.println("roll no:");
S.rollno();
System.out.println("name:");
S.name();
System.out.println("branch:");
S.branch();
}
}
class Interface
{
public static void main(String[]args)
{
STUDENT S = new STUDENT();
System.out.println("roll no:");
S.rollno();
System.out.println("name:");
S.name();
System.out.println("branch:");
S.branch();
}
}


      

