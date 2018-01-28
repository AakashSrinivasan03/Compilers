import syntaxtree.*;
import visitor.*;

public class P5 {
   public static void main(String [] args) {
      try {
         Node root = new microIRParser(System.in).Goal();
         //System.out.println("Program parsed successfully");
         GJDepthFirst temp=new GJDepthFirst();
         root.accept(temp,null); // Your assignment part is invoked here.
         root.accept(temp,null);
        // root.accept(temp,null);
         
        //GJNoArguDepthFirst.s.get(0);
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
} 
//export PATH="/home/manikandan/java/javacc-5.0/bin":$PATH
//java -jar jtb132.jar minijava.jj
