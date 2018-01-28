package visitor;
import java.util.*;
public class Symboltable
{ 
  public Vector<Symbol> list=new Vector();
  public int tt=0;
  void add_elem(Symbol a)
  {list.add(a);}
   Symbol lookup(String name)
   { for(int i=0;i<list.size();i++)
      if(list.get(i).id_name==name)
       return list.get(i);
    return null;



    }		
  	






}

class Symbol
{ Type_1 id_type=new Type_1();
  String temp=null;
  String name=null;
  public String id_name=null;
  	




}

class Type_1
{ String tname=null;
  Classtype ctype;
   int arr_len=0;
   String arr_len_temp="";
    	
  void add_tname(String s)
   {tname=s;}
   boolean is_aggregate(){return tname!=null;} 
  //void add_ctype(classtype 
   Type_1(String tname,Classtype ctype)
   { if(tname!=null)
       this.tname=tname;
      if(ctype!=null)
       this.ctype=ctype;  


   }
  Type_1(){}
  void equate(String tname,Classtype ctype)
   { if(tname!=null)
       this.tname=tname;
      if(ctype!=null)
       this.ctype=ctype;  


   }
  



}

class Classtype
{
 String name;
 Vector<String> fieldname=new Vector();
Vector<Type_1> fieldtypes=new Vector() ;
int n_fields=0;
int n_methods=0;
Vector<Minfo> methods=new Vector();
Classtype parent=null;
int num_local_var_int_bool=0;
int num_local_var_obj=0;
int num_local_fns=0;
int total_size=0;
String temp_var="";
Classtype(String name,String fieldname,Type_1 fieldtype,Minfo method )
   { if(name!=null)
       this.name=name;
      if(fieldname!=null)
       this.fieldname.add(fieldname);
       if(fieldtype!=null)
       this.fieldtypes.add(fieldtype);
       if(method!=null)
       this.methods.add(method);  


   }
  Classtype(){}
   public Classtype(Classtype old) {
    this.name = old.name; // you can access
    this.fieldname=old.fieldname;  
    this.fieldtypes=old.fieldtypes;
    this.methods=old.methods;
    this.parent=old.parent;
  }
void equate(String name,String fieldname,Type_1 fieldtype,Minfo method )
   { if(name!=null)
       this.name=name;
      if(fieldname!=null)
       this.fieldname.add(fieldname);
       if(fieldtype!=null)
       this.fieldtypes.add(fieldtype);
       if(method!=null)
       this.methods.add(method);  


   }
 Type_1 search_classtype_fields(String id)
 {   //int index=fieldname.indexOf(id);
      //if(index==-1)
        //return null;
       //System.out.println("hhh");
       // return fieldtypes.get(index);
        //int index=methods.indexOf(id);
     for(int i=0;i<fieldname.size();i++)
       if(id==fieldname.get(i))
        return fieldtypes.get(i);
    
      
       //System.out.println("hhh");
        return null;


}

Minfo search_methods(String id)
 {   int index=methods.indexOf(id);
     for(int i=0;i<methods.size();i++)
       if(id==methods.get(i).name)
        return methods.get(i);
    
      
       //System.out.println("hhh");
        return null;


}




}

class Minfo
{ String name;
  String parent_name;
   Type_1 ret_type;
   Vector<String> arg_name=new Vector();
   Vector<Type_1> arg_type=new Vector();
   int n_args=0;
   int list_counter=0;
   int max_counter=0;
   Vector<String> local_var_name=new Vector();
   Vector<Type_1> local_var_type=new Vector();
   Vector<String> message_temporaries=new Vector();
   Vector<String> message_temporaries_code=new Vector();


   Minfo(String name,Type_1 ret_val,String arg_name,Type_1 arg_type)
   { if(name!=null)
       this.name=name;
      if(arg_name!=null)
       this.arg_name.add(arg_name);
       if(arg_type!=null)
       this.arg_type.add(arg_type);
       if(ret_type!=null)
       this.ret_type=ret_type;  


   }
  Minfo(){}

  void equate(String name,Type_1 ret_val,String arg_name,Type_1 arg_type)
   { if(name!=null)
       this.name=name;
      if(arg_name!=null)
       this.arg_name.add(arg_name);
       if(arg_type!=null)
       this.arg_type.add(arg_type);
       if(ret_val!=null)
       this.ret_type=ret_val;  


   }

   Type_1 search_arg_name(String id)
 {   int index=arg_name.indexOf(id);
      if(index==-1)
        return null;
       //System.out.println("hhh");
       // return arg_type.get(index);

     for(int i=0;i<arg_name.size();i++)
       if(id==arg_name.get(i))
        return arg_type.get(i);
    
      
       //System.out.println("hhh");
        return null;


}


}
class Arr
{ String name="";
  String temp="";
  int len=0;


}







