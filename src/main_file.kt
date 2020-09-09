    fun main(args:Array<String>) {
      var exp1 = StandardLibraryFunction()
        //standard library functions
        exp1.exampleForLet(exp1)
        exp1.exampleForRun(exp1)
        exp1.printLengthByAlso(exp1)
        exp1.exampleForApply(exp1)
        exp1.exampleForWith(exp1)
        exp1.exampleForTakeif(exp1)
        //infix function notation
        //Standard library infix function notation
        var i=InfixFunctionNotation()
        i.standardInfixFun()
        //User defined infix function notation
        val i2 = i doublicate 2
        println("the doublicate of number 2 is: $i2")
        //Member Function
        //Inline Function
        var infun=MemberFunction()
        infun.higherfunc("Inline Function",::print)
        //local function
        var lf=MemberFunction()
        lf.localFunction()

        //Lambda Function
        var lamf=MemberFunction()
        lamf.lambdaFunction()
       //User define functions
       var userDefined= `User-DefinedFunction`()
        userDefined.userDefine("user define function with no return value")
        println(userDefined.userDefine1())
        userDefined.anonymousFun()
        userDefined.anonymousInfFun()


    }


