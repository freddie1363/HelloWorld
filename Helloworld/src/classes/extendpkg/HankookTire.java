package classes.extendpkg;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulateRotaion;
		if (accumulateRotaion < maxRotation) {
			System.out.println(location + " HankookTire 수명 : " + (maxRotation - accumulateRotaion));
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}
	}
}