class HOSPITAL{
public void patient()
{
System.out.println("patient in hospital");
}
}
class patient extends hospital{
public void patient(){
System.out.println(" total patient in hospital is 500");
}}
class hospital{
 public static void main( String args[]) {
      patient obj = new patient();
obj.patient();
}
}
