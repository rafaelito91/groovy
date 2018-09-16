package com.study.groovy.closures.aaabasic

class Arguments {

    static void main(String[] args) {
        // Simple arugment definition: "*nameOfArgumet* ->"
        [1,2,3].each{ num ->
            print num
        }
        // If no argument defined, the "it" reserved word
        // can be used instead
        [1,2,3].each{
            print it
        }
    }
}
