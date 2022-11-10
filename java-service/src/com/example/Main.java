package com.example;

import software.amazon.smithy.model.shapes.ShapeId;

class Main {
	public static void main(String[] args) {
		System.out.println(ShapeId.fromParts("namespace", "name"));
	}
}