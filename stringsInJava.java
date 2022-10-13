public class stringsInJava
{public static void main(String[] args)
	{
	String str = "This is Inteelij ide";
	char arrch[] = {'H','e','l','l','o',};
	String str1 = new String(arrch);
	System.out.println(str);
	System.out.println(str1);
	System.out.println("THE LENGHTH OF THE STRING IS "+str.length());
	System.out.println(str.compareTo(str1));
	System.out.println(str.indexOf('j'));
	System.out.println(str.concat("FOR IMPLEMENTING JAVA PROGRAMS"));
	System.out.println(str.substring(1,10));
}}