object functionExample {
  def fac(n: Int): Int = {
    var r = 1
    for (i <- 1 to n) {
      r = r * i
    }
    r
  }

  fac(-1)
  fac(0)
  fac(1)
  fac(5)

  def factorial_recursive(n: Int): Int = {
    if (n <= 0) {
      1
    } else {
      n * factorial_recursive(n - 1)
    }
  }

  factorial_recursive(-1)
  factorial_recursive(0)
  factorial_recursive(1)
  factorial_recursive(5)
}