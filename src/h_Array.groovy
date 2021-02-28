import java.lang.reflect.Array

int[] xInt = [1, 3, 4, 5]
String[] str = ["apple","orange"]
println(xInt) //Output: [1, 3, 4, 5]
println(xInt.size()) //Output: 4
println(xInt[1]) //Output: 3
println(str)


def xint2 = [2,1,3,4,5] as int[]



//Java-style array initialization
def primes = new int[] {2, 3, 5, 7, 11}
def pets = new String[] {'cat', 'dog'}

println(primes) //Output: [2, 3, 5, 7, 11]
println(primes.size()) //Output: 5
println(primes.sum()) //Output: 28
println(pets)