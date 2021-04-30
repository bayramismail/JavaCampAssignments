
public class LessonManager {
	public boolean add(Lesson lesson) {
		System.out.println("Added");
		return true;
	}
	public boolean update(Lesson lesson) {
		System.out.println("Updated");
		return true;
	}
	public boolean delete(int id) {
		System.out.println("Deleted");
		return true;
	}
	public Lesson[] lessonList() {
		Lesson [] lessons=new Lesson[] {};
		return lessons;
	}
	public Lesson lessonById(int id) {
		Lesson  lesson=new Lesson();
		return lesson;
	}
}
