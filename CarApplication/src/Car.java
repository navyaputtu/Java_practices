public class Car {
	//Properties
	boolean powerOn;
	String color, regNo, engineType;
	int gear, maxGear, maxSpeed, totalSeats;
	float speed;
	//Constructor
	public Car(String color, String engineType, int maxGear, int maxSpeed, int totalSeats) {
		this.color = color;
		this.engineType = engineType;
		this.maxGear = maxGear;
		this.maxSpeed = maxSpeed;
		this.totalSeats = totalSeats;		
	}		
	//Getting properties
	public boolean isPowerOn() {
		return powerOn;
	}
	public String getColor() {
		return color;
	}
	public String getRegNo() {
		return regNo;
	}
	public String getEngineType() {
		return engineType;
	}
	public int getGear() {
		return gear;
	}
	public int getMaxGear() {
		return maxGear;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public float getSpeed() {
		return speed;
	}
	
	//Setting properties
	public void setPower(boolean power) {
		this.powerOn = power;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	
	//methods to manupulate speed & gear
	private void engineOff() {
		this.speed = 0;
		this.powerOn = false;
		this.gear = 0;
	}
	
	public void accelerate() {
		//Manual Gear System
		if (this.powerOn && this.speed <= this.maxSpeed-5 && this.gear > 0) {
			if (this.gear==1 && this.speed <= 15)
				speed+=5;
			else if (this.gear == 2 && this.speed <= 35)
				speed += 5;
			else if (this.gear == 3 && this.speed <= 55)
				speed +=5;
			else if (this.gear == 4 && this.speed <= 75 && this.gear != this.maxGear)
				speed+=5;			
			else if (this.gear== this.maxGear || this.gear == 5)
				speed +=5;				
		}
	}
	public void decelerate() {
		if (this.speed >= 5) {
			if (this.gear==1 && this.speed <= 20)
				speed-=5;
			else if (this.gear == 2 && this.speed <= 40 && this.speed >20)
				speed -= 5;
			else if (this.gear == 3 && this.speed <= 60 && this.speed >=45)
				speed -=5;
			else if (this.gear == 4 && this.speed <= 80 && this.gear != this.maxGear && this.speed >=65)
				speed-=5;			
			else if ((this.gear== this.maxGear || this.gear == 5) && this.speed >=80)
				speed -=5;
			else
				engineOff();
		}
	}
	public void reverseGear() {
		this.gear = -1;
	}
	public void gearUp() {
		if (gear<maxGear)
			gear++;
	}
	public void gearDown() {
		if (gear > 0)
			gear--;
		else if ( gear == -1)
			gear++;
	}
	public void applyBrake() {
		this.speed = 0;
		this.gear = 0;
	}	
	public String toString() {
		return regNo + ", " + maxSpeed + ", " + maxGear + ", " + gear ;
	}
}