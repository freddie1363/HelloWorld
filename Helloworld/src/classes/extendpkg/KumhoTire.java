package classes.extendpkg;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulateRotaion;
		if (accumulateRotaion < maxRotation) {
			System.out.println(location + " KumhoTire 수명 : " + (maxRotation - accumulateRotaion));
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire 펑크 ***");
			return false;
		}
	}
}