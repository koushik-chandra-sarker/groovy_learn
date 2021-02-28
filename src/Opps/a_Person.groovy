package Opps

import groovy.transform.ToString

@ToString
class a_Person {
    def name
    def age

    static void main(String[] args) {
        def a_person = new a_Person()
        a_person.name = 'Abul'
        a_person.age = 20

        println(a_person)
    }
}
