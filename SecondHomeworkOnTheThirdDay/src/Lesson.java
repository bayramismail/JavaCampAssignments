
public class Lesson {
	private int id;
	private int lessonGroupId;
	private String lessonName;

	public Lesson() {
		super();
	}

	public Lesson(int id, int lessonGroupId, String lessonName) {
		super();
		this.id = id;
		this.lessonGroupId = lessonGroupId;
		this.lessonName = lessonName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLessonGroupId() {
		return lessonGroupId;
	}

	public void setLessonGroupId(int lessonGroupId) {
		this.lessonGroupId = lessonGroupId;
	}

	public String getLessonName() {
		return lessonName;
	}

	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}
}
