
public class LessonGroup {
	private int id;
	private String groupName;

	public LessonGroup() {
		super();
	}

	public LessonGroup(int id, String groupName) {
		super();
		this.id = id;
		this.groupName = groupName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
}
