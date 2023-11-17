package ss;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams1 {
public static void main(String args[]) {
	
//	IntStream.range(0, 10).forEach(System.out::println);
	
//	IntStream.range(0, 10).skip(5).forEach(System.out::println);
	
/*	int k=IntStream.range(0, 10).sum();
	System.out.println(k); */
	
//	Stream.of("ravi","venu","shravani").sorted().findFirst().ifPresent(System.out::println);
    
/*	Stream<String> str=Arrays.stream(new String[] {"ravi","venu","shravani","kirr"});
	str.filter(a->a.contains("a")).sorted().forEach(System.out::println); */
	
/*	List<String> list=Arrays.asList("ravi","shravani","venu","shyam");
	list.stream().map(a->a.toLowerCase()).filter(b->b.startsWith("s")).sorted().forEach(System.out::println);
*/
//	Arrays.stream(new int[] {1,2,3,4,5,6}).map(x->x*x).average().ifPresent(System.out::println);
//C:\\Users\\ravij\\Desktop\\stream.txt
//	src/ss/stream.txt
	try {
		Stream<String> stream=Files.lines(Paths.get("src/ss/stream.txt"));
		stream.distinct().filter(a->a.length()>4).forEach(System.out::println);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
