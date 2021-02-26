
/**
 * Groovy has the following types of operators −
 * -Arithmetic operators  {+, -, *, /, %, ++, --  }-> (addition, subtraction, multiplication, division, Modulus(get remainder between two number, increment, decrement) )
 * -Relational operators { ==, !=, <, >, <=, >= }  -> (equal, not Equal, less than, grater then, less then equal, grater then equal)
 * -Logical operators { &&, ||, ! }-> logical(and, or, not)
 * -Bitwise operators { &, |, ^, ~ } -> bitwise(and, or, xor, negation )
 * -Assignment operators {
 *  += {This adds right operand to the left operand and assigns the result to left operand. def A = 5; A+=3; Output will be 8}
 *  -= {This subtracts right operand from the left operand and assigns the result to left operand. A = 5; A-=3; Output will be 2}
 *  *= {This multiplies right operand with the left operand and assigns the result to left operand. A = 5; A*=3; Output will be 15}
 *  /= {This divides left operand with the right operand and assigns the result to left operand. A = 10; A/=2; Output will be 5}
 *  %= {This takes modulus using two operands and assigns the result to left operand. A = 5; A%=3; Output will be 2}
 *  }
 *
 *
 * */


/**
 * @Arithmetic_operators
 * */
println'============= Arithmetic_operators ============'
println(5+2) //Output will be 7
println(5-2) //Output will be 3
println(5*2) //Output will be 10
println(10/2) //Output will be 5
println(5%2) //Output will be 1
int a = 5
println(a++) //post-increment. Output will be 5, in the next line it will be 6
println(a) // Output will be 6
int b = 3
println(++b) //pre-increment. Output will be 4

int x = 4
println(x--) //post-decrement. Output will be 4,in the next line it will be 3
println(x) // Output will be 3
int z = 10
println(--z) //pre-decrement. Output will be 9


/**
 * @Relational_operators
 * */
println'============= Relational_operators ============'

println'       ------ equal ------'
println(5==5) //Output: true
println(5==6) //Output: false

println'       ------ not equal ------'
println(5!=6) //Output: true
println(5!=5) //Output: false

println'       ------ less then  ------'
println(5<5) //Output: false
println(5<6) //Output: true

println'       ------ Grater then  ------'
println(5>6) //Output: false
println(6>5) //Output: true

println'       ------ less then or equal ------'
println(6<=5) //Output: false
println(6<=7) //Output: true
println(6<=6) //Output: true
println'       ------ Grater then or equal ------'
println(6>=5) //Output: true
println(6>=7) //Output: false
println(6>=6) //Output: true


/**
 * @Logical_operators
 * */
println'============= Logical_operators ============'
println'            ------ AND------'
println(5==5 && 6==6) //Output: true
println(5==6 && 6==6) //Output: false

println'            ------ OR------'
println(5==5 || 6==6) //Output: true
println(5==6 || 6==6) //Output: ture
println(5==6 || 6==7) //Output: false

println'       ------ NOT ------'
println(!true) //Output: false
println(!false) //Output: true


/**
 * @Bitwise_operators
 * */
println'============= Bitwise_operators ============'
println'       ------ AND ------'
println(0&0) //Output: 0
println(0&1) //Output: 0
println(1&0) //Output: 0
println(1&1) //Output: 1

println'       ------ AND ------'
println(0|0) //Output: 0
println(0|1) //Output: 1
println(1|0) //Output: 1
println(1|1) //Output: 1

println'       ------ XOR ------'
println(0^0) //Output: 0
println(0^1) //Output: 1
println(1^0) //Output: 1
println(1^1) //Output: 0

