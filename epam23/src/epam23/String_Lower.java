package epam23;
import java.util.*;
import java.util.stream.Stream;
public class String_Lower {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no.of Strings:");
		int n=scan.nextInt();
		String s[]=new String[n];
		System.out.println("Enter strings one by one : ");
		for(int i=0;i<n;i++) {
			s[i]=scan.next();
		}
		strings(s);
		
	}

	static void strings(String[] s) {
		Stream<String> st=Stream.of(s);
		System.out.println("strings starting with a and length equal to 3 : ");
		st.filter(p->p.startsWith("a")).filter(p->(p.length()==3)).peek(p->System.out.println(p)).count();
	}

}
