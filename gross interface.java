interface gross{
  void calc gross();
}
class employee{
  int basic=1000;}
class salary extends employee implement gross {
  public void calc gross(){
    int gross=basic+500;
    System.out.println("gross salary"+gross);
  }}
class main{
  public static void main(String[]args)
  {
    Salary s=new Salary();
    S.calc gross();
  }}
