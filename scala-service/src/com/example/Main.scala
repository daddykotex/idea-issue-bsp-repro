package com.example

import software.amazon.smithy.model.shapes.ShapeId

object Main extends App {
  println(ShapeId.fromParts("namespace", "name"))
}
