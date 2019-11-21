package kamrul;

class A{
	public int length,width;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	

}

public class SeterGetter {

	public static void main(String[] args) {
		A obj = new A();
		obj.setLength(125);
		System.out.println(obj.getLength());

	}

}
