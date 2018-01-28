class Factorial{
    public static void main(String[] a){
        System.out.println(new Fac().fn(1+(3+4)));//doesnt work for multivalued!!
    }
}

 
  



class Fac {
     int a;
     boolean b;
   public int fn(int c)
   { int e; 
     int[]f;
     f=new int[10];
     f[2]=3;
     e=c;
     if((f[2])<=c)
     {e=c;
     f=new int[10];
     f[2]=3;
     System.out.println(f[2]);
      }
    return 1;
    }

   

   
}

/*class Fac1 extends Fac {
     Fac aa;
    public Fac ComputeFac(int a){
        Fac1 b;

        int num_aux ;
        int[] c;
        //c[this.ComputeFac1(num_aux)]=this.ComputeFac1(num_aux);
         aa=b;
        //if ((num_aux <= 1)&&(num_aux != 1))
          //  num_aux = (1+0) ;
        //else
          //  num_aux = num_aux * (this.ComputeFac1(num_aux)) ;
        return aa ;
    }
    
}*/
