package model;

public class Student {

	private String name;
	private int age;
	private String sex;
	private String stuNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getStuNo() {
		return stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	public Student() {
		this("", 0, "男", "000");
	}

	public Student(String name, int age, String sex, String stuNo) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.stuNo = stuNo;
	}

	public String toString() {
		return "姓名：" + this.getName() + "\n年龄：" + this.getAge() + "岁\n性别：" + this.getSex() + "\n学号：" + this.getStuNo();
	}

	public static void main(String[] args) {
		Student student = new Student("张三", 18, "男", "001");
		System.out.println(student.toString());
	}
}
