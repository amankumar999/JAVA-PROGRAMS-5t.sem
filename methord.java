class CHILD{
public void plays()
{
	System.out.println("CHILD is playing");
	}
}
class BROTHER extends CHILD{
public void plays(){

	System.out.println("CHILD is playing with BROTHER");
	}


}

class methord{ 
public static void main( String args[] ) {
BROTHER obj = new BROTHER();
obj.plays();
}}
