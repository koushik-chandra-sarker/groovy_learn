package Opps.a_AbstructClass

import groovy.transform.ToString

@ToString
class Student extends User{

    def id
    def name

    Student() {
//        super()
    }

    Student(id, name) {
        this.id = id
        this.name = name
    }
    Student(id, name,username, password, email) {
        this.id = id
        this.name = name
        this.username = username
        this.password = password
        this.email = email
    }


    @Override
    void display() {
        println("id:${id}, name: ${name}, Username: ${username}, Password: ${password}, Email: ${email}")
    }
}
