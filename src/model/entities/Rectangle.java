package model.entities;

import model.enums.Color;

public class Rectangle extends Shape {

	private double widht;
	private double height;
	
	public Rectangle() {
		super();
	}
		
	public Rectangle(Color color, double widht, double height) {
		super(color);
		this.widht = widht;
		this.height = height;
	}

	public double getWidht() {
		return widht;
	}

	public void setWidht(double widht) {
		this.widht = widht;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return widht * height;
	}
}
