package com.cts.sample;

public class Student {
	public Long id;
	public String name;
	public int score;
	
	public Student(Long id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	
}


