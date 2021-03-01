
/**
 *@Control structures
 *      @Looping structures
 *          -Classic for loop
 *          -Enhanced classic Java-style for loop
 *          -Multi-assignment in combination with for loop
 *          -for in loop
 *          -while loop
 *          -do/while loop
 * */




/**
 * @Classic for loop
 * Groovy supports the standard Java / C for loop:
 * */

for (int i = 1; i<=5; i++){
    print(i+", ") //Output: 1, 2, 3, 4, 5,
}
println()
/**
 * @Enhanced classic Java-style for loop
 * The more elaborate form of Java’s classic for loop with comma-separate
 * expressions is now supported. Example:
 * */

def arr = []
def count = 5
for (int fect = 1, i = 1; i <= count; i++, fect+=5 ){
    arr << fect
}
println(arr) //Output: [1, 6, 11, 16, 21]


/**
 * @Multi-assignment in combination with for loop
 * Groovy has supported multi-assignment statements since Groovy 1.6:
 * */


def Nums = []
for (def (String u, int v) = ['A', 42]; v < 45; u++, v++) {
    Nums << "$u $v"
}
println(Nums) //Output: [A 42, B 43, C 44]


/**
 * for in loop
 * The for loop in Groovy is much simpler and works with any kind of array, collection, Map, etc.
 * */


def array = [1,2,4,23,54,3]
for (i in array){
    print(i+ "  ") //Output: 1  2  4  23  54  3
}

// iterate over a map
def map = ['abc':1, 'def':2, 'xyz':3]

for ( e in map ) {
    println("$e.key: $e.value")
    /*
    Output:  abc: 1
             def: 2
             xyz: 3
     */
}

/**
 * while loop
 * Groovy supports the usual while {...} loops like Java:
 * */

def a = 3
while (a-- > 0){
    println("Hello Groovy.")
    /*
    Output: Hello Groovy.
            Hello Groovy.
            Hello Groovy.
    * */
}

/**
 * {do/while loop}
 * */

def count1 = 5
def fact1 = 1
do {
    fact1 *= count1--
} while(count1 > 1)

println(fact1)//Output: 120