package homework_java_2_2_2;

class Clock {
	
	private Display hour = new Display(24);;
	private Display minute = new Display(60);
	private Display second = new Display(60);
	
	public Clock(int hour, int minute, int second) {
		int addMinute = this.second.setValue(second);
		int addHour = this.minute.setValue(minute + addMinute);
		this.hour.setValue(hour + addHour);
	}
	
	public void start() {
		while(true) {
			second.increase();
			if(second.getValue() == 0) {
				minute.increase();
				if(minute.getValue() == 0) {
					hour.increase();
				}
			}
			System.out.printf("%02d:%02d:%02d\n", hour.getValue(),minute.getValue(),second.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public void tick() {
		second.increase();
		if(second.getValue() == 0) {
			minute.increase();
			if(minute.getValue() == 0) {
				hour.increase();
			}
		}
//		System.out.printf("%02d:%02d:%02d\n", hour.getValue(),minute.getValue(),second.getValue());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%02d:%02d:%02d\n", hour.getValue(),minute.getValue(),second.getValue());
	}
}
