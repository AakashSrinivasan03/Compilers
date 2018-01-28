package visitor;
import syntaxtree.*;
import java.util.*;
class Expression_1
{ String code="";
  String addr="";
  String next="";
  String true_label="";
  String false_label="";
  String temp="";
  String truth=""; 
  int exp_flag=0;
  //String arr_len_temp="";
	

}
class Pair_val
{ Expression_1 stmt_exp=null;
	int flag=0;
	String label="";
	String token="";
	Pair_val(){}
	Pair_val(Expression_1 a,int b,String c)
	{stmt_exp=a;flag=b;label=c;

	}
	Pair_val(Pair_val a)
	{stmt_exp=null;flag=a.flag;label="";

	}



}
