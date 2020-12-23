package calcproj.operations;

public final class DivideOperation {
	private int a = 0;
	private int b = 0;

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public double getResult() {
		return (double) this.a / this.b;
	}

}
