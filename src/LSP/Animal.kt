package LSP

public open class Animal {
    fun eat(){
        print("Animal can eat")
    }
    fun fly(){
        print("Animal can fly")
    }

}

class Lion : Animal(){
    //here we extend fly method, But lion can't fly , we have unwanted methods
    //we will fix it using LSP that isolate non common methods
}

class Bat : Animal(){
//here we have all Animal prop eat and fly methods ,all true
}