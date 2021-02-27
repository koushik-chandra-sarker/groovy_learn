/** Variable
 *  Variables in Groovy can be defined in two ways − using the native syntax
 * for the data type or the next is by using the def keyword.
 * For variable definitions it is mandatory to either provide
 * a type name explicitly or to use "def" in replacement.
 * This is required by the Groovy parser.
 *
 *
 * There are following basic types of variable in Groovy --->
 * -byte
 * -short
 * -int
 * -long
 * -float
 * -double
 * -char
 * -Boolean
 * -String
 * */



/** b, B is define as a variable
 * Variable can be 'lowercase', 'uppercase' or with the 'underscore'
 *
 * Variable can't be start with 'number' or any 'special character'
 * */
byte b = 10
byte B = 20
int _i = 50
String s = "Hello Groovy"
boolean flag = true
println(b)
println(B)
println(_i)
println(s)
println(flag)


//Print variable with String - double quote
println("Sum of b & B is) "+(b+B))
//Print variable with String - single quote
println('Sum of b & B is '+(b+B))
//Print variable in String
println("Sum of b & _i is ${b+_i}")
println("Sum of b & _i is $b") // for a single variable no need to give 'curly braces' {}


/**
 * @def
 * Variable also define as 'def' keyword
 * */

def i = 10
println(i)// Output: 10
println(i.getClass().getName()) // Output: java.lang.Integer

def a = 10.45
println(a)// Output: 10.45
println(a.getClass().getName()) // Output: java.math.BigDecimal

def x = "hello"
println(x)// Output: hello
println(x.getClass().getName()) // Output: java.lang.String



def person = [name: 'Guillaume', age: 36]
println(person)// Output: [name: 'Guillaume', age: 36]
println(person.name)// Output: Guillaume
println(person.age)// Output: 36
println(person.getClass().getName()) // java.util.LinkedHashMap

//you can cast with any datatype
def x1  = (byte) 10
println(x1)// Output: 3
println(x1.getClass().getName()) // java.lang.Byte



// you can declare multiple variable at a time
def (c1,c2,c3) = [4,6,5]
println(c1)
println(c2)
println(c3)





