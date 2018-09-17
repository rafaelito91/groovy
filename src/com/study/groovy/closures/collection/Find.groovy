package com.study.groovy.closures.collection

class Find {

    static void main(String[] args) {
        List days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Saturday"]
        List weekend = days.findAll { it.startsWith("S")}

        println days
        println weekend
    }
}
