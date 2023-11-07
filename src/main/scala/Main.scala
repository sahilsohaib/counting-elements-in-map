object CountOccurrences {
  def main(args: Array[String]): Unit = {
    // Sample map
    val data = List("apple", "banana", "apple", "cherry", "banana", "date")

    // Count occurrences of elements in the map
    val elementCounts = data.groupBy(identity).view.mapValues(_.size).toMap

    // Print the element counts
    elementCounts.foreach { case (element, count) =>
      println(s"$element: $count")
    }
  }
}
