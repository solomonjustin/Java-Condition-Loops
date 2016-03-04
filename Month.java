package Lab5;

public class Month {
	private int _monthNumber;

	public Month() {
		this._monthNumber = 1;
	}

	public Month(int _monthNumber) {
		if(_monthNumber >= 1 && _monthNumber <= 12){
			this._monthNumber = _monthNumber;
		}
		else{
			this._monthNumber = 1;
		}
	}
	//switch statement
	public Month(String month) {
		switch (month) {
		case "January":
			this._monthNumber = 1;
			break;
		case "February":
			this._monthNumber = 2;
			break;
		case "March":
			this._monthNumber = 3;
			break;
		case "April":
			this._monthNumber = 4;
			break;
		case "May":
			this._monthNumber = 5;
			break;
		case "June":
			this._monthNumber = 6;
			break;
		case "July":
			this._monthNumber = 7;
			break;
		case "August":
			this._monthNumber = 8;
			break;
		case "September":
			this._monthNumber = 9;
			break;
		case "October":
			this._monthNumber = 10;
			break;
		case "November":
			this._monthNumber = 11;
			break;
		case "December":
			this._monthNumber = 12;
			break;
		default:
			break;
		}
	}

	public void set_monthNumber(int _monthNumber) {
		if(_monthNumber >= 1 && _monthNumber <= 12){
			this._monthNumber = _monthNumber;
		}
		else{
			this._monthNumber = 1;
		}
	}

	public int get_monthNumber() {
		return _monthNumber;
	}
	
	public String getMonthName() {
		switch (this._monthNumber) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "invlaid";
		}
	}
	
	public String toString(){
		switch (this._monthNumber) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "invlaid";
		}
	}
	
	public boolean equals(Month obj2){
		boolean status;
		
		if(this._monthNumber == obj2._monthNumber)
			status = true;
		else
			status = false;
		
		return status;
	}
	
	public boolean lessThan(Month obj2){
		boolean status;
		
		if(this._monthNumber < obj2._monthNumber)
			status = true;
		else
			status = false;
		
		return status;
	}
	
	public boolean greaterThan(Month obj2){
		boolean status;
		
		if(this._monthNumber > obj2._monthNumber)
			status = true;
		else
			status = false;
		
		return status;
	}
	
	
}
