class ReverseStr
{
public static void main(String args[])
{
String str;
Scanner in=new Scanner(System.in);
str=in.next();
int a=str.length();
a--;
char str1[]=str.toCharArray();
char temp;
for(int i=0;i<str.length/2;i++)
{
temp=str1[i];
str1[i]=str1[a];
str1[a]=temp;
a--;
}
str=new String(str1);
System.out.println(str);
}
}


