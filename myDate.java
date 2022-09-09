class myDate{
	int day, month, year;
	//constructor
	public myDate(int d,int m,int y){
		day = d;
		month = m;
		year = y;
	}
	
	// getter and setter
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	// isleap()
	public boolean isLeap() {

		boolean flag = false;
		if(year %400 == 0) {
			flag = true;
		}
		else if (year %100==0) {
			flag = false;
		}
		else if (year %4==0) {
			flag = true;
		}else {
			flag = false;
		}
		return flag;
	}
	
	// compare()
	public int compare(myDate date) {
		
		if (year==date.year && month==date.month && day==date.day) {
			return 0;
		}else if (year<date.year && month<date.month) {
			return -1;
		}else {
			return 1;
		}
	}

	// dayofWeek()
	public String dayofWeek() {
		int e1 = year/400;
		int e2 = year/50;
		int e3 = 5*year/4;
		int e = year/100;
		int e4 = 5*e*25;
		int e5 = month+1;
		int e6 = 26*e5/10;
		
		int result = (e1-e2-1+e3+e4+e6)%7-2;
		String flag = "";
		switch(result) {
		case 0:
			flag = "sunday";
			break;
		case 1:
			flag = "Monday";
			break;
		case 2:
			flag = "Tuesday";
			break;
		case 3: 
			flag = "Wednesday";
			break;
		case 4: 
			flag = "Thursday";
			break;
		case 5: 
			flag = "Friday";
			break;
		case 6: 
			flag = "Saturday";
			break;
		}
	
		return flag;
	}

	// toString()
	public String toString() {
		return day+"-"+month+"-"+year;
	}
}
