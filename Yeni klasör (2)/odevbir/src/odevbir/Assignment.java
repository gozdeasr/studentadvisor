package odevbir;



import java.util.Calendar;
import java.util.Date;

public class Assignment {

	public static String whichSemester(int month) {
	    switch(month) {
        case Calendar.SEPTEMBER:
        case Calendar.OCTOBER:
        case Calendar.NOVEMBER:
        case Calendar.DECEMBER:
        case Calendar.JANUARY:
              return "FALL";
        case Calendar.FEBRUARY:
        case Calendar.MARCH:
        case Calendar.APRIL:
        case Calendar.MAY:
        case Calendar.JUNE:
              return "SPRING";
        default:
              return "SUMMER";
	    }
	}
	
	public static void getMonth()
	{
		Date date= new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		System.out.println("Current Semester is " + whichSemester(cal.get(Calendar.MONTH)));
		System.out.println("**************************************");
	}
	
	public static void getAdvisorStudents(Advisor reyiz)
	{
		System.out.println(reyiz.getFirstName() + " " + reyiz.getLastName() + " NumberOfStudents : " + reyiz.getNumberOfStudentsAssigned());
		System.out.println("**************************************");
	}
	
	public static void main(String[] args) {
	
		
		Student secondstu = new Student("Ayse","Mercan");
		Student thirtstu = new Student("Mehmet","Bulut",12,5,4);
		Student fourthstu = new Student("Merve","Kusak",21);
	
		Advisor firstadv = new Advisor("Mustafa","Bomb");
		Advisor secondadv = new Advisor("Sevil","Aydeniz");
		Advisor thirtadv = new Advisor("Cihan","Lale");
		
		
		firstadv.assignStudentToAdvisor();
		firstadv.assignStudentToAdvisor();
		firstadv.assignStudentToAdvisor();
		firstadv.assignStudentToAdvisor();
		
		getAdvisorStudents(firstadv);
		
	
		secondadv.assignStudentToAdvisor();
		
		getAdvisorStudents(secondadv);
		
		
		getAdvisorStudents(thirtadv);
		
		
		secondstu.toStrStudentDetails();
		
		thirtstu.currentStatus();
		
		
		fourthstu.setYear(5);
		fourthstu.setGPA(-1.0);
		
		fourthstu.currentStatus();
		
		
		getMonth();
		
		firstadv.toStrAdvisorDetails();
		secondadv.toStrAdvisorDetails();
		thirtadv.toStrAdvisorDetails();
	}
	
	
}



