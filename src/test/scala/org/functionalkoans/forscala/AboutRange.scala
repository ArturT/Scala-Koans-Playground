package org.functionalkoans.forscala

import support.KoanSuite

class AboutRange extends KoanSuite {

  koan("Range are not inclusive at end of range") {
    // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
    val someNumbers = Range(0, 10)

    someNumbers.size should be(10)
  }

  koan("Range can specify increment") {
    // 2, 5, 8
    val someNumbers = Range(2, 10, 3)

    someNumbers.size should be(3)
  }

  koan("Range can indicate inclusion") {
    val someNumbers = Range(0, 34, 2)
    someNumbers.contains(33) should be(false) // not parity
    someNumbers.contains(32) should be(true) // parity
    someNumbers.contains(34) should be(false) // 34 is not in range
  }

  koan("Range can specify to include value") {
    val someNumbers = Range(0, 34).inclusive

    someNumbers.contains(34) should be(true)
  }

}
