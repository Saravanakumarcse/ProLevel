class PrefixEx
{
public static void main(String[] args)
{
int i=0;
Scanner in=new Scanner(System.in);
public String sum(String[] strs)
{
String s1="";
if(strs.length>0)
{
s1=strs[0];
}
for(i=1;i<strs.length();i++)
{
String analys=strs[i];
int j=0;
for(;Math.min(s1.length(),strs[i].length());j++)
if(s1.charAt(j)!=analys.charAt(j))
break;
}
}
s1=strs.substring(0,j);
}
return s1;
}
}
}
