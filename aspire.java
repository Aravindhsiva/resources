import java.util.Scanner;
import java.util.regex.*;

public class valid {
	public static String isvalid(String s) {
        Matcher m = Pattern.compile("(?!00000)(0/91)?[6-9]{1}[0-9]{4}[0-9]{5}").matcher(s);
        return m.find() ? "Valid":"Not Valid";
	}
	public static String isvalid(String s,String ref) {
		    Matcher m = Pattern.compile("^[A-Za-z\\\\s]+$").matcher(s);
		    return m.find() ? "Valid":"Not Valid";
	}
	public static String isvalid(int id) {
		if((""+id).length()==6){
			return "Valid";
		}
		return "Not Valid";
	}
	public static String isvalid(String em,int a) {
		int at = em.indexOf("@");
		int d = em.indexOf(".");
		if(at<1)
			return "Not Valid";
		else if(d<=at+4)
			return "Not Valid";
		else if(d==em.length()-2)
			return "Not Valid";
		return "Valid";
	}
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter your Id,Name,Number,Email:");
		/*int id = x.nextInt();
		x.nextLine();
		String name=x.nextLine();
		String num = x.next();
		String email = x.next();
		System.out.println("Name :     "+isvalid(name,""));
		System.out.println("ID :       "+isvalid(id));
		System.out.println("Number :   "+isvalid(num));
		System.out.println("Email Id : "+isvalid(email,1));*/
//		int id = x.nextInt();
//		x.nextLine();
//		String name=x.nextLine();
//		String num = x.next();
//		String email = x.next();
		System.out.println("Name :     "+isvalid("Aravindh",""));
		System.out.println("ID :       "+isvalid(123456));
		System.out.println("Number :   "+isvalid("7339513140"));
		System.out.println("Email Id : "+isvalid("aravindhsiva@paperclip.com",1));
	}
}
