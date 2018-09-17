package com.study.groovy.closures.curry

class Curry {
    // Curry allows you to created a new closure based on
    // an existing one
    static void main(String[] args) {
        def log = { String type, Date createdOn, String msg ->
            println "$createdOn [$type] - $msg"
        }

        log("DEBUG", new Date(), "This is my first debug statement...")

        def debugLog = log.curry("DEBUG")
        debugLog(new Date(), "This is another debug statement based on a previous one....")
        debugLog(new Date(), "This is one more....")

        def todayDebugLog = log.curry("DEBUG", new Date())
        todayDebugLog("This is today's debug msg")
    }
}
