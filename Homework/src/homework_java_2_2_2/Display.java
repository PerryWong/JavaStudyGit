package homework_java_2_2_2;

class Display {

	private int value = 0;
	private int limit = 0;
	
	public Display(int limit) {
		this.limit = limit;
	}
	
	public Display(int limit,int value) {
		this.limit = limit;
		if(value < limit) {
			this.value = value;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void increase() {
		value++;
		if( value == limit ) {
			value = 0;
		}
	}
	
	public int getValue() {
		return value;
	}

	public int setValue(int value) {
		if(value < this.limit) {
			this.value = value;
			return 0 ;
		}else {
			this.value = value % limit;
			return value / limit ;
		}
	}
	
}
