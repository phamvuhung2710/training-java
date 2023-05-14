package dto;

public class CourseDto {
	private Long courseId;
	private Long subjectId;
	private String courseCode;
	private String title;
	private String numberOfCredits;
	
	public CourseDto(Long courseId, Long subjectId, String courseCode, String title, String numberOfCredits) {
		super();
		this.courseId = courseId;
		this.subjectId = subjectId;
		this.courseCode = courseCode;
		this.title = title;
		this.numberOfCredits = numberOfCredits;
	}
	
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public Long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getNumberOfCredits() {
		return numberOfCredits;
	}
	public void setNumberOfCredits(String numberOfCredits) {
		this.numberOfCredits = numberOfCredits;
	}

	@Override
	public String toString() {
		return "CourseDto [courseId=" + courseId + ", subjectId=" + subjectId + ", courseCode=" + courseCode
				+ ", title=" + title + ", numberOfCredits=" + numberOfCredits + "]";
	}
	
	
	
	
}
