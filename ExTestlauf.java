

class MeineEx extends Exception {}
public class ExTestlauf {

	static void tuRiskantes(String t) throws MeineEx {
		System.out.print("s");
		if ("ja".equals(t)) {
			throw new MeineEx();
		}
	}

	public static void main(String[] args) {
		String test = args[0];
		System.out.print("au");
		try {
			tuRiskantes(test);
			System.out.print("spa");
			System.out.print("nn");
		} catch (MeineEx e) {
			System.out.print("loes");
		} finally {
			System.out.print("e");
		}
		System.out.println("n");
	}

}



