package homework_java_2_4;

public class DVD extends Item{
	
	private String director;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public DVD(String title, String director, int playingTime, String comment) {
		super(title,playingTime,false,comment);
		this.director = director;
	}

	public void print() {
		System.out.println("DVD:");
		super.print();
		System.out.println(director);
	}

}
