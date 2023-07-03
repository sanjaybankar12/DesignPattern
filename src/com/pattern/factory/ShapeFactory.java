package com.pattern.factory;

/**
 * Factory design pattern is used to return object instance based on specific
 * condition.
 *
 */
public class ShapeFactory {

	public Shape getShape(String shapeType) {
		Shape shape = null;

		switch (shapeType) {
			case "CIRCLE":
				shape = new Circle();
				break;
			case "SQUARE":
				shape = new Square();
				break;
			default:
				shape = new Rectangle();
		}
		return shape;
	}

	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		Shape shape = sf.getShape("SQUARE");
		shape.draw();
	}

}
