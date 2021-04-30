
public class Education {
	private int id;
	private int lessonId;
	private int instructorId;

	public Education() {
		super();
	}

	public Education(int id, int lessonId, int instructorId) {
		super();
		this.id = id;
		this.lessonId = lessonId;
		this.instructorId = instructorId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLessonId() {
		return lessonId;
	}

	public void setLessonId(int lessonId) {
		this.lessonId = lessonId;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

}
