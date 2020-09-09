class `User-DefinedFunction` {
    var type:String=""


    fun userDefine(type1: String) {
        type = type1
        println(type)
    }

    fun userDefine1(): String {
        type = "user define function with  return value"
        return type
    }

    fun anonymousFun() {

        var  s: () -> String = {

            type= "anonymous function"
            type
        }

        println("this is an  explicit type anonymous function ")

    }

    fun anonymousInfFun() {

        var s = {

            "anonymous function"
        }

        println("this is an inference type  anonymous function ")
    }
}