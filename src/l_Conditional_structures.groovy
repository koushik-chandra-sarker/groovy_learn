
/**
 *@Control structures
 *      @Conditional structures
 *          -if / else
 *          -switch / case
 * */


/**
 * Groovy supports the usual if - else syntax from Java
 * */

int i = 100
if (i>100){
    println "i is greater then 100"
}
else if(i<100) {
    println "i is less then 100"
}
else {
    println 'i is equal 100'
}


int n = 6
switch (n){
    case 10:
        println 'n is equal 10'
        break
    case {it <10 }:
        println "n is less then 10"
        break
    case {it > 10 }:
        println "n is greater then 10"
        break
    default:
        println "nothing"

}
