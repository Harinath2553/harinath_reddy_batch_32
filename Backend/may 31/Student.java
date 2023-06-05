class Student
{
  static String Name;
  public static String getName(){
    System.out.println(Name);
    return Name;
  }
  public static void setName(String name){
    Name=name;
  }
  public static void main(String[] args) {
    setName("Arya Vishnu");
    getName();
  }
}
