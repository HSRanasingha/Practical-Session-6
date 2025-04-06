class Student{
	int marks;
	String name;
	
	//constructor 1
	Student(){
		System.out.println("Creating a student object");
		name="Default name";
	}
	
	//constructor 2
	Student(String n, int m){
		System.out.println("Creating a student object with name " +n+ " and marks "+m);
		name=n;
		marks=m;
	}
	
}

class Printer{
	void print(String s){
		System.out.println(s);
	}
}

class Printer1{
	void pr(String s){
		System.out.println(s);
	}
}

//using System.Out.Println
class App{
	public static void main(String[] args){
		System.out.println("Hi");
		System.out.println("Welcome to demo class App");
		
		
		Student s1=new Student("harshi",100);//used constructor 1
		System.out.println("student s1 name is "+s1.name);//used constructor 2 - name=n;
		System.out.println("student s1  marks are "+s1.marks);
		s1.marks=100;
		s1.name="Harshi";
		System.out.println("student s1 name is "+s1.name);
		System.out.println("student s1  marks are "+s1.marks);
		
		
		Student s2=new Student("sanduni",90);//used constructor 1
		System.out.println("student s2 name is "+s2.name);//used constructor 2 - name=n;
		System.out.println("student s2 marks are "+s2.marks);
		s2.marks=90;
		s2.name="Sanduni";
		System.out.println("student s2 name is "+s2.name);
		System.out.println("student s2 marks are "+s2.marks);
		
		
		Student s3=new Student("janani",80);//used constructor 1
		System.out.println("student s3 name is "+s3.name);//used constructor 2 - name=n;
		System.out.println("student s3 marks are "+s3.marks);
		s3.marks=90;
		s3.name="janani";
		System.out.println("student s3 name is "+s3.name);
		System.out.println("student s3 marks are "+s3.marks);
		
		
	}
}

//using class printer
class App2{
	public static void main(String[] args){
		Printer p=new Printer();
		p.print("Hi");
		p.print("Welcome to demo class App");
		Student s1=new Student();
		s1.marks=100;
		s1.name="Harshi";
		p.print("student name is "+s1.name+" and student marks are "+s1.marks);
	}
	
	
}

//using class printer1
class App3{
	public static void main(String[] args){
		Printer1 p=new Printer1();
		p.pr("Hi");
		p.pr("Welcome to demo class App");
		Student s1=new Student();
		s1.marks=100;
		s1.name="Harshi";
		p.pr("student name is "+s1.name+" and student marks are "+s1.marks);
	}
	
	
}

/*
Microsoft Windows [Version 10.0.22631.5126]
(c) Microsoft Corporation. All rights reserved.

C:\Users\2022ict78\Desktop\IT1214\s6>javac IT1214_App.java

C:\Users\2022ict78\Desktop\IT1214\s6>java App
Error: Main method not found in class App, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application

C:\Users\2022ict78\Desktop\IT1214\s6>javac IT1214_App.java

C:\Users\2022ict78\Desktop\IT1214\s6>java App
Welcome to demo class App

C:\Users\2022ict78\Desktop\IT1214\s6>javac IT1214_App.java

C:\Users\2022ict78\Desktop\IT1214\s6>java App
Welcome to demo class App

C:\Users\2022ict78\Desktop\IT1214\s6>javac IT1214_App.java

C:\Users\2022ict78\Desktop\IT1214\s6>java App
Welcome to demo class App
student name isHarshiand student marks are100

C:\Users\2022ict78\Desktop\IT1214\s6>javac IT1214_App.java

C:\Users\2022ict78\Desktop\IT1214\s6>java App
Welcome to demo class App
student name is Harshi and student marks are 100

C:\Users\2022ict78\Desktop\IT1214\s6>javac IT1214_App.java
IT1214_App.java:9: error: cannot find symbol
                System.Out.Println(s);
                      ^
  symbol:   variable Out
  location: class System
IT1214_App.java:15: error: cannot find symbol
                System.Out.Println(s);
                      ^
  symbol:   variable Out
  location: class System
2 errors

C:\Users\2022ict78\Desktop\IT1214\s6>javac IT1214_App.java
IT1214_App.java:9: error: cannot find symbol
                System.Out.println(s);
                      ^
  symbol:   variable Out
  location: class System
IT1214_App.java:15: error: cannot find symbol
                System.Out.println(s);
                      ^
  symbol:   variable Out
  location: class System
2 errors

C:\Users\2022ict78\Desktop\IT1214\s6>javac IT1214_App.java
IT1214_App.java:9: error: cannot find symbol
                System.Out.println(s);
                      ^
  symbol:   variable Out
  location: class System
1 error

C:\Users\2022ict78\Desktop\IT1214\s6>javac IT1214_App.java

C:\Users\2022ict78\Desktop\IT1214\s6>javac IT1214_App.java

C:\Users\2022ict78\Desktop\IT1214\s6>java Apps
Hi
Welcome to demo class App
student name is Harshi and student marks are 100

C:\Users\2022ict78\Desktop\IT1214\s6>java APP1
Error: Could not find or load main class APP1
Caused by: java.lang.NoClassDefFoundError: App1 (wrong name: APP1)

C:\Users\2022ict78\Desktop\IT1214\s6>java App1
Hi
Welcome to demo class App
student name is Harshi and student marks are 100

C:\Users\2022ict78\Desktop\IT1214\s6>javac IT1214_App.java

C:\Users\2022ict78\Desktop\IT1214\s6>java App
Hi
Welcome to demo class App
student name is Harshi and student marks are 100
student name is Sanduni and student marks are 90

C:\Users\2022ict78\Desktop\IT1214\s6>javac IT1214_App.java

C:\Users\2022ict78\Desktop\IT1214\s6>java App
Hi
Welcome to demo class App
student s1 name is Harshi and student marks are 100
student s2 name is Sanduni and student marks are 90

C:\Users\2022ict78\Desktop\IT1214\s6>
C:\Users\2022ict78\Desktop\IT1214\s6>javac IT1214_App.java

C:\Users\2022ict78\Desktop\IT1214\s6>java Student
Error: Main method not found in class Student, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application

C:\Users\2022ict78\Desktop\IT1214\s6>java App
Hi
Welcome to demo class App
Creating a student object
student s1 name is Harshi and student marks are 100
Creating a student object
student s2 name is Sanduni and student marks are 90

C:\Users\2022ict78\Desktop\IT1214\s6>javac IT1214_App.java

C:\Users\2022ict78\Desktop\IT1214\s6>java App
Hi
Welcome to demo class App
Creating a student object
student s1 name is Harshi and student marks are 100
Creating a student object
student s2 name is Sanduni and student marks are 90
Creating a student object
student s3 name is Sanduni and student marks are 90

C:\Users\2022ict78\Desktop\IT1214\s6>javac IT1214_App.java

C:\Users\2022ict78\Desktop\IT1214\s6>java App1
Hi
Welcome to demo class App
Creating a student object
student name is Harshi and student marks are 100

C:\Users\2022ict78\Desktop\IT1214\s6>javac IT1214_App.java

C:\Users\2022ict78\Desktop\IT1214\s6>java App
Hi
Welcome to demo class App
Creating a student object
student s1 name is Harshi and student marks are 100
Creating a student object
student s2 name is Sanduni and student marks are 90
Creating a student object
student s3 name is janani and student marks are 90

C:\Users\2022ict78\Desktop\IT1214\s6>javac IT1214_App.java
IT1214_App.java:77: error: unclosed comment
/* Microsoft Windows [Version 10.0.22631.5126]
^
IT1214_App.java:227: error: reached end of file while parsing
2 errors

C:\Users\2022ict78\Desktop\IT1214\s6>javac IT1214_App.java
IT1214_App.java:77: error: unclosed comment
/* Microsoft Windows [Version 10.0.22631.5126]
^
IT1214_App.java:227: error: reached end of file while parsing
2 errors

C:\Users\2022ict78\Desktop\IT1214\s6>javac IT1214_App.java
IT1214_App.java:77: error: unclosed comment
/* Microsoft Windows [Version 10.0.22631.5126]
^
IT1214_App.java:227: error: reached end of file while parsing
2 errors

C:\Users\2022ict78\Desktop\IT1214\s6>javac IT1214_App.java

C:\Users\2022ict78\Desktop\IT1214\s6>java App
Hi
Welcome to demo class App
Creating a student object
student s1 name is Default name and student marks are 100
student s1 name is Harshi and student marks are 100
Creating a student object
student s2 name is Sanduni and student marks are 90
Creating a student object
student s3 name is janani and student marks are 90

C:\Users\2022ict78\Desktop\IT1214\s6>javac IT1214_App.java
IT1214_App.java:28: error: constructor Student in class Student cannot be applied to given types;
                Student s1=new Student("Harshi",100);
                           ^
  required: no arguments
  found: String,int
  reason: actual and formal argument lists differ in length
IT1214_App.java:34: error: constructor Student in class Student cannot be applied to given types;
                Student s2=new Student("sanduni",90);
                           ^
  required: no arguments
  found: String,int
  reason: actual and formal argument lists differ in length
IT1214_App.java:39: error: constructor Student in class Student cannot be applied to given types;
                Student s3=new Student("janani",80);
                           ^
  required: no arguments
  found: String,int
  reason: actual and formal argument lists differ in length
3 errors

C:\Users\2022ict78\Desktop\IT1214\s6>javac IT1214_App.java
IT1214_App.java:28: error: constructor Student in class Student cannot be applied to given types;
                Student s1=new Student(100,"Harshi");
                           ^
  required: no arguments
  found: int,String
  reason: actual and formal argument lists differ in length
IT1214_App.java:34: error: constructor Student in class Student cannot be applied to given types;
                Student s2=new Student(90,"sanduni");
                           ^
  required: no arguments
  found: int,String
  reason: actual and formal argument lists differ in length
IT1214_App.java:39: error: constructor Student in class Student cannot be applied to given types;
                Student s3=new Student(80,"janani");
                           ^
  required: no arguments
  found: int,String
  reason: actual and formal argument lists differ in length
3 errors

C:\Users\2022ict78\Desktop\IT1214\s6>

C:\Users\2022ict78\Desktop\IT1214\s6>javac IT1214_App.java

C:\Users\2022ict78\Desktop\IT1214\s6>java App
Hi
Welcome to demo class App
Creating a student object with name harshiand marks 100
student s1 name is null and student marks are 0
Creating a student object with name sanduniand marks 90
student s2 name is null and student marks are 0
Creating a student object with name jananiand marks 80
student s3 name is null and student marks are 0


another day

Microsoft Windows [Version 10.0.22631.5126]
(c) Microsoft Corporation. All rights reserved.

C:\Users\2022ict78\Desktop\IT1214\s6>javac IT1214_App.java

C:\Users\2022ict78\Desktop\IT1214\s6>java App
Hi
Welcome to demo class App
Creating a student object with name harshi and marks 100
student s1 name is null and student marks are 0
Creating a student object with name sanduni and marks 90
student s2 name is null and student marks are 0
Creating a student object with name janani and marks 80
student s3 name is null and student marks are 0

C:\Users\2022ict78\Desktop\IT1214\s6>javac IT1214_App.java

C:\Users\2022ict78\Desktop\IT1214\s6>java App
Hi
Welcome to demo class App
Creating a student object with name harshi and marks 100
student s1 name is null and student marks are 0
Creating a student object with name sanduni and marks 90
student s2 name is null and student marks are 0
Creating a student object with name janani and marks 80
student s3 name is null and student marks are 0

C:\Users\2022ict78\Desktop\IT1214\s6>javac IT1214_App.java

C:\Users\2022ict78\Desktop\IT1214\s6>java App
Hi
Welcome to demo class App
Creating a student object with name harshi and marks 100
student s1 name is harshi
student s1  marks are 0
student s1 name is Harshi
student s1  marks are 100
Creating a student object with name sanduni and marks 90
student s2 name is sanduni
student s2 marks are 0
Creating a student object with name janani and marks 80
student s3 name is janani
student s3 marks are 0

C:\Users\2022ict78\Desktop\IT1214\s6>javac IT1214_App.java

C:\Users\2022ict78\Desktop\IT1214\s6>java App
Hi
Welcome to demo class App
Creating a student object with name harshi and marks 100
student s1 name is harshi
student s1  marks are 100
student s1 name is Harshi
student s1  marks are 100
Creating a student object with name sanduni and marks 90
student s2 name is sanduni
student s2 marks are 90
student s2 name is Sanduni
student s2 marks are 90
Creating a student object with name janani and marks 80
student s3 name is janani
student s3 marks are 80
student s3 name is janani
student s3 marks are 90

C:\Users\2022ict78\Desktop\IT1214\s6>
*/