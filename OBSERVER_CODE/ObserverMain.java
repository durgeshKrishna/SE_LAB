public class ObserverMain {

    public static void main(String[] args) {
		
		Student student = new Student();
		new GradesObserver(student);
		student.AddGrades(15.0f);
		System.out.println(student.getAverage());
		student.AddGrades(5.0f);
		System.out.println(student.getAverage());
		student.AddGrades(13.0f);
		System.out.println(student.getAverage());
		
	}
}