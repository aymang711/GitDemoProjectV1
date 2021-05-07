import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str;
		System.out.println("what you want to send ?:");
		while(!((str=sc.nextLine()).equals("bye")))
		{
			System.out.println("Your Message recived and it is: "+str);
			System.out.println(" Do you want to send something else ? ,\n if no then send bye;)");
		}
			System.out.println("good bye");
			System.out.println("Dont come back later ;)");
	}

}
