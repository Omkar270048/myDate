# myDate

![Eclipse](https://img.shields.io/badge/Eclipse-FE7A16.svg?style=for-the-badge&logo=Eclipse&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)

<h2> What is myDate?</h2>
myDate is a class which can be used to study about date. By using myDate class you can find wether year is leap year or not, compare two dates if dates, find day of the week.

<h2> How to use?</h2>

Initalizing objects

	myDate date1 = new myDate(10,4,1990);
	myDate date2 = new myDate(10,4,1990);
	myDate date3 = new myDate(3,8,1995);
	myDate date = new myDate(21,7,2022);
		

Using isLeap()
isLeap() will show wether the year is leap year or not.
Example: date.isLeap();

	System.out.println(date1.isLeap());
	System.out.println(date2.isLeap());
	System.out.println(date3.isLeap());
	
Output:

	false
	false
	false	
	
Using compare(): </br>
compare() will compare two dates.
Example: date1.compare(date2);
if date1 < date2, will return -1
if date1 = date2, will return 0
if date1 > date2, will return 1
		
	System.out.println(date1.compare(date2));
	System.out.println(date1.compare(date3));
	System.out.println(date3.compare(date1));
	
Output:
	
	0
	-1
	1
		
Using dayofWeek()
dayofWeek() will reture day of the week, like Monday, Tuesday, etc.
		
	System.out.println(date.dayofWeek());

Output:
	
	Thursday
	
Using toString()
toString() is default feature, it will work when no function is called with object and return the date.

	System.out.println(date1);
	
Output:

	10-4-1990
