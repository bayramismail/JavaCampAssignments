
public class EducationManager {
	public void add(Education education) {
		System.out.println("Added");
	}
	public void update(Education education) {
		System.out.println("Updated");
	}
	public void delete(int educationId) {
		System.out.println("Deleted");
	}
	public Education[] educationList() {
		Education []educations=new Education[] {};
		return educations;
	}
	public Education educationById(int id) {
		Education education =new Education();
		return education;
	}
}
