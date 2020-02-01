//Currying is the technique of tranforming a function
// that takes multiple arguments into a function
//that takes a single argument


object Currying {

  def add(x: Int, y:Int) = x + y
  
  def add2 (x: Int) = (y: Int) => x+y;
  
  def main(args:Array[String]) {
    println(add(30,40));
    
    
    println(add2(2)(30));
    val sum40 = add2(40)
  }
  
  
}