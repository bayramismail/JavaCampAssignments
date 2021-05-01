
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Education education1 = new Education();
		Education education2 = new Education();
		Education education3 = new Education();
		EducationManager educationManager = new EducationManager();
		education1.setLessonId(1);
		education2.setLessonId(15);
		education3.setLessonId(58);
		Education[] educations = new Education[] { education1, education3, education2 };
		educationManager.multipleAdd(educations);

	}

}
