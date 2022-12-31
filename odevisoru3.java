package fizik;

public class soru3 {

	public static void main(String[] args) {
		double nehir = 60;
		double nehirV = 8;
		double Va = 10;
		double Vb = 10;
		double tetaB = 30;
		double tetaa = 50;
		double tetaA = 180 - tetaa;
		double radiansA = Math.toRadians(tetaA);
		double radiansB = Math.toRadians(tetaB);
		double cosValueA = Math.cos(radiansA);
		double sinValueA = Math.sin(radiansA);
		double cosValueB = Math.cos(radiansB);
		double sinValueB = Math.sin(radiansB);
		double Vax = Va * cosValueA;
		double Vay = Va * sinValueA;
		double Vbx = Va * cosValueB;
		double Vby = Va * sinValueB;
		double T1 = nehir / Vay;
		double T2 = nehir / Vby;
		double X1 = (Vax + nehirV) * T1;
		double X2 = (Vbx + nehirV) * T2;
		double DltaX = X2 - X1;
		System.out.println("Aralarindaki uzaklik: " + Math.round(DltaX) + " Metre");
	}
}
