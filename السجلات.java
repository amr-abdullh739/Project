import java.util.Scanner;
 class STYDENT{
     int id		;  int number;
     String name ;   String SE;
     String addres ;
     float age ;
 }
    public class السجلات{
  public static void main(String args[]){
    Scanner in=new Scanner (System.in);
        System.out.println("enter the x");
         int x=in.nextInt();
      STYDENT stu[]=new STYDENT[x];
      for (int i=0; i<x; i++){
          stu[i]=new STYDENT();
          System.out.println("enter the id");
          stu[i].id=in.nextInt();
          System.out.println("enter the number");
          stu[i].number=in.nextInt();
          System.out.println("enter the name");
          stu[i].name=in.next();
          System.out.println("enter the SE");
          stu[i].SE=in.next();
          System.out.println("enter the addres");
          stu[i].addres=in.next();
          System.out.println("enter the age");
          stu[i].age=in.nextFloat();
      }
      System.out.print("\n");
      for (int i=0; i<x; i++){
          System.out.print("enter the id:"+stu[i].id);
          System.out.println();
          System.out.print("enter the number:"+stu[i].number);
          System.out.println();
          System.out.print("enter the name:"+stu[i].name);
          System.out.println();
          System.out.print("enter the SE:"+stu[i].SE);
          System.out.println();
          System.out.print("enter the addres:"+stu[i].addres);
          System.out.println();
          System.out.print("enter the age:"+stu[i].age);
          
      }
  }
  }