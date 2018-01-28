package visitor;
import java.util.*;

public class Temp_1
{ public String reg="";
  public String temp_name="";
  public int location_stk;
  public int start;
  public int end=-1;
  public int spilt=0;

}
 class Expression
{
	public String reg="";
	public String code="";


} 

 class Fn
{ public String fn_name="";
  public String no_args;
  public String max_call_args="100";
  public String max_alloc="100";
  public String code="";
  public Vector<Temp_1> temp_vars=new Vector();
  public int search_temp(String s1)
  { for(int i=0;i<temp_vars.size();i++)
  	 { if( s1.equals(temp_vars.get(i).temp_name))
  	 	{  System.out.println("LLLLLLLLLLLLL");
  	 		return i;


  	 	}

  	 }
  	 return -1;


  }
  public void update_liveness(String s1,int pos)
  { 
  	 if(search_temp(s1)==-1)
  	 { Temp_1 tmp=new Temp_1();
  	 	tmp.temp_name=s1;
  	 	tmp.start=pos;
  	 	temp_vars.add(tmp);




  	 }
  	 else
  	 { int idx=search_temp(s1);
  	 	if(pos>temp_vars.get(idx).end)
  	 	{ temp_vars.get(idx).end=pos;

  	 	}




  	 }





  }

public void sort_asc()
{

  for(int i=0;i<temp_vars.size();i++)
  {
    for(int j=0;j<temp_vars.size()-i-1;j++)
    { if(temp_vars.get(j).start>temp_vars.get(j+1).start)
    	{ Temp_1 tmp=new Temp_1();
    		tmp=temp_vars.get(j);
    		temp_vars.set(j,temp_vars.get(j+1));
    		temp_vars.set(j+1,tmp);


    	}




    }



  }





}

















}


