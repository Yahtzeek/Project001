import java.io.*;
import java.util.*;
import static java.lang.System.out;

class Vollmonde {

	static int TAG_IM = 1000 * 60 * 60 * 24;

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		c.set (2004,0,7,15,40);

		long tag1 = c.getTimeInMillis();

		for (int x = 0; x < 6; x++) {

			tag1 += (TAG_IM * 29.52);
			tag1 += (TAG_IM * 29.52);

			c.setTimeInMillis(tag1);



			out.println (String.format("Vollmond am %tc", c));

		} // for

	} // main

}

