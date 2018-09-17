package com.study.groovy.closures.curry

class RCurryAndNCurry {

    static void main(String[] args) {
        def log = { String type, Date createdOn, String msg ->
            println "$createdOn [$type] - $msg"
        }
        // Right curry
        def crazyPersonLog = log.rcurry("Why am I logging this way")
        crazyPersonLog("ERROR", new Date())

        // Index based curry
        def typeMsgLog = log.ncurry(1, new Date())
        typeMsgLog("ERROR", "This is using ncurry")
    }
}
