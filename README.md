# myDate

<p> How to use</p>

//initalizing objects//

		myDate date1 = new myDate(10,4,1990);
		myDate date2 = new myDate(10,4,1990);
		myDate date3 = new myDate(3,8,1995);
		myDate date = new myDate(21,7,2022);
		
//testing isLeap()//

		System.out.println(date1.isLeap());
		System.out.println(date2.isLeap());
		System.out.println(date3.isLeap());
		
//testing compare()//
		
		System.out.println(date1.compare(date2));
		System.out.println(date1.compare(date3));
		System.out.println(date3.compare(date1));
		
//testing dayofWeek()//
		
		System.out.println(date.dayofWeek());
		
//testing toString()//
		
		System.out.println(date1);
