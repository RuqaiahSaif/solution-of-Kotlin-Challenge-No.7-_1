class StandardLibraryFunction {
    var message: String? = "hello_world"
    var i = 100;
    fun justPrint(message: String) {
        println("I am here to print : $message")
    }

    /*------------------------------------------------
    let takes the object it is invoked upon as the parameter and
    the let expression returns nothing (Unit) as we didn’t specify anything explicitly.
     */
    fun exampleForLet(object1: StandardLibraryFunction) {
        var result = object1.let {
            it.justPrint("hello let")
            it.i = 200
        }
        var strLength = message?.let { it .length }
        println("The Length of message value is  : $strLength ")
        println(result)
    }


    /* ----------------------------------------------------
    Similar to the let function, the run function also returns the last statement.
   Unlike let, the run function doesn’t support the it keyword.
   It requires an object*/
    fun exampleForRun(object2: StandardLibraryFunction) {
        var result2 = object2.run {
            this.justPrint("hello run")
           this.i=300
        }
        println(this.i)
        }


    /*--------------------------------
    also As the name says, also expressions does some additional processing on the object it was invoked.
    Unlike let, it returns the original object instead of any new return data.
    Like let, also uses it too
    The also expression returns the data class object
     whereas the let expression returns nothing (Unit) as we didn’t specify anything explicitly.
     */
    fun printLengthByAlso(object1: StandardLibraryFunction) {
        var result2 = object1.also {
            it.justPrint("hello Also")
            it.i = 400
        }
        println(result2.i)

    }

    /*----------------------------------------------------
    apply is an extension function on a type.
It requires an object reference to run into an expression.
It also return an object reference on completion.*/
    fun exampleForApply(object1: StandardLibraryFunction) {
        var result2 = object1.apply {
            this.justPrint("hello apply")
            this.i = 500
        }
        println(result2.i)
    }

    /*----------------------------------------------------------
    with is  used to change properties of an instance.
    But here we don’t require a object reference to run, i.e.
     we don’t need a dot operator for reference.*/
    fun exampleForWith(object1: StandardLibraryFunction) {
        with(object1) {
            i = 600
            justPrint("hello with $i")


        }
    }

    /*----------------------------------------------------------------
. takeIf As clear from the name itself,
 takeIf will proceed in the chain only if the condition inside is true*/
    fun exampleForTakeif(object1: StandardLibraryFunction) {
        object1.takeIf {
            it.i > 20
        }
                ?.let {
                   println("hello takeif")

                }
    }
}
