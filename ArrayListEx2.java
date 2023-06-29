import java.util.*;
public class ArrayListEx2{
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<String>();
		list.add("java");
		list.add("python");
		list.add("c++");
		list.add("html");
		for(String name:list){
			System.out.println(name);
		}
	}
}