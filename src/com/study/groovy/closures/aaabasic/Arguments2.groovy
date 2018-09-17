package com.study.groovy.closures.aaabasic

class Arguments2 {

    // this is the same as defining "def first" and
    // "def last"
    static def sayHello = { first, last ->
        println "Hello, $first $last"
    }

    // In case you want to, you can define as such:
    static def sayHello2 = { String first, String last ->
        println "Hello, $first $last"
    }

    // Default values
    static def greet = { String greeting = "Howdy", String name ->
        println "$greeting $name"
    }

    // Var args  !!!! CAN ALSO BE USED FOR METHODS !!!!!
    static def concat = { String... args ->
        args.join('')
    }

    static void main(String[] args) {
        sayHello("Rafael", "Ito")
        sayHello2("Rafael", "Ito")
        greet("Greetings", "Rafael")
        greet("Rafael")
        print concat("I", " like", " big", " personalities", " and", " I", " cannot", " lie")
    }
}
