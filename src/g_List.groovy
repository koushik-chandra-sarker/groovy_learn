
def list=[1,2,3,6,4]
println(list) //Output: [1,2,3,6,4]
println(list[3]) //Output: 6
println(list.size()) //Output: 5

def listt=[1,2,3,6,4] as LinkedList
println(listt.getClass().getName())

def list2 = [3,5, [4,1,3], "hi"]
println(list2) //Output: [3,5, [4,1,4], "hi"]
println(list2[-1]) //Output: hi
println(list2[2]) //Output: [4, 1, 4]
println(list2[2][0]) //Output: 4


/**
 * @add
 * Append the new value to the end of this List or given index of the list
 * */

def list3 = ['apple',5, 5.67,]
println(list3) //Output: ['apple',5, 5.67,]
list3.add('Orange')
println(list3) //Output: [apple, 5, 5.67, Orange]
list3.add(2,'Banana')
println(list3) //Output: [apple, 5, Banana, 5.67, Orange]

/**
 * @contains
 * Returns true if this List contains the specified value.otherwise return false
 * */

list4 = [1,4, 5,'hello', 6]
boolean f = list4.contains(4)
println(f)  //Output: true
println(list4.contains(22))  //Output: false

/**
 * @get
 * Returns the element at the specified position in this List.
 * */

def v1 = list4.get(3)
println(v1) //Output: hello

/**
 * @isEmpty
 * Returns true if this List contains no elements.
 * */

println(list4.isEmpty()) //Output: false
list5 = []
println(list5.isEmpty()) //Output: true

/**
 * @minus
 * Creates a new List composed of the elements of the original without those specified in the collection.
 * */

list6 = [12,32,45,33]
list7 = list6.minus([33,45])
//or
//list7 = list6 - [33, 45]
println(list7)  //Output: [12, 32]

/**
 * @plus
 * Creates a new List composed of the elements of the original together with those specified in the collection.
 * */

list8 = list6.plus([66,50])
//or
//list8 = list6 + [66.50
println(list8)//Output: [12, 32, 45, 33, 66, 50]

/**
 * @pop
 * Removes the initial item from the List.
 * */
list9 = [3,35,2,5]
println(list9.pop())//Output: 3
println(list9)//Output: [35, 2, 5]

/**
 * @drop(int num)
 * ->Drops the given number of elements from the head of this List.
 * @dropRight(int num)
 *  ->Drops the given number of elements from the tail of this List.
 *  @dropWhile(Closure condition)
 *   ->Returns a suffix of this List where elements are dropped from the front while the given Closure evaluates to true.
 * */
list10 = [2,4,44,65,33,20]
println(list10.drop(3))//Output: [65, 33, 20]
list11 = [2,4,44,65,33,20]
println(list11.dropRight(3))//Output: [2, 4, 44]
list12 = [2,4,44,65,33,20]
println(list12.dropWhile {it<20}) //Output: [44, 65, 33, 20]




/**
 * For more learning go to this link and find 'list' from all Classes
 * https://groovy-lang.org/gdk.html
 * */


