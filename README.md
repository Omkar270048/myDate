# myDate

![Eclipse](https://img.shields.io/badge/Eclipse-FE7A16.svg?style=for-the-badge&logo=Eclipse&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)

<b><h3> How to use?<h3><b>

initalizing objects

	myDate date1 = new myDate(10,4,1990);
	myDate date2 = new myDate(10,4,1990);
	myDate date3 = new myDate(3,8,1995);
	myDate date = new myDate(21,7,2022);
		

Using isLeap()

	System.out.println(date1.isLeap());
	System.out.println(date2.isLeap());
	System.out.println(date3.isLeap());
	
Output:

	false
	false
	false	
	
Using compare()
		
	System.out.println(date1.compare(date2));
	System.out.println(date1.compare(date3));
	System.out.println(date3.compare(date1));
	
Output:
	
	0
	-1
	1
		
Using dayofWeek()
		
	System.out.println(date.dayofWeek());

Output:
	
	Thursday
	
Using toString()
		
	System.out.println(date1);
	
Output:

	10-4-1990
