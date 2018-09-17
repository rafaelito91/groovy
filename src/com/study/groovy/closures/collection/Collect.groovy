package com.study.groovy.closures.collection

class Collect {

    static void main(String[] args) {
        List nums = [2, 5, 6, 8 , 19]
        List collectedList = nums.collect {
            it * 10
        }
        println nums
        println collectedList
    }
}
