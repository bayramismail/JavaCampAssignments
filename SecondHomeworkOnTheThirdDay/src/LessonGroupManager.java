
public class LessonGroupManager {

	public boolean add(LessonGroup lessonGroup) {
		System.out.println("Added");
		return true;
	}
	public boolean update(LessonGroup lessonGroup) {
		System.out.println("Updated");
		return true;
	}
	public boolean delete(int id) {
		System.out.println("Deleted");
		return true;
	}
	public LessonGroup[] lessonGroupList() {
		LessonGroup [] lessonGroups=new LessonGroup[] {};
		return lessonGroups;
	}
	public LessonGroup lessonById(int id) {
		LessonGroup  lessonGroup=new LessonGroup();
		return lessonGroup;
	}
}
