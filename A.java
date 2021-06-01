import java.util.*;
import java.io.*;
class A
{
  public static void main(String[] args)
  {
 try
    {
    LinkedList<Integer> ll=new LinkedList<Integer>();
    //Scanner s= new Scanner(System.in);
    DataInputStream s = new DataInputStream(System.in);
    int a[] = new int[100];
    // int a[]={1,2,3,4,5,1,2,3,4,5};
    a[0]=1;a[1]=2;a[2]=3;a[3]=4;
    int z=a.length;
    int i,k;
    for(i=0;i<z;i++)
     {
       while(a[i]!=0)
       {
        ll.add(a[i]);     
        break;
       }
     }
     System.out.println(ll);
     int b=5;
     //Integer.parseInt(s.readLine());
     ll.add(5);
     ll.add(6);
     ll.add(7);
     ll.add(8);
     ll.add(9);
     ll.add(10);
     ll.add(11);
     ll.add(Integer.parseInt(args[0]));
     //int b=Integer.parseInt(s.readLine());
     while(b!=0)
     {
        b=Integer.parseInt(s.readLine());
        ll.add(b);
     }
    
     
     System.out.println(ll);
      //int m=ll.length();
      i=0;
      for(i=0;i<ll.size();i++)
      {
        a[i]=ll.get(i);
      }
      for(i=0;i<a.length;i++)
      {
        while(a[i]!=0)
        {
         System.out.println(a[i]);
         break;
        }
      } 
   }
  
  catch (Exception e)
  {

  }

}
}