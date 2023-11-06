package New;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

public class randomnum {
public static void main(String args[]) {
	Random rand = new Random();
	int r=rand.nextInt(0, 6888);
	//System.out.println(r);
	double k=Math.random();
	//System.out.println(k);
	String rr=RandomStringUtils.randomNumeric(9);
	//System.out.println(rr);
	String rrr=RandomStringUtils.randomAlphabetic(7);
	System.out.println(rrr);
}
}
