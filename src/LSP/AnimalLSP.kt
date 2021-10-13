package LSP

public open class AnimalLSP {
    fun eat(){
        print("Animal can eat")
    }

}

open class AnimalCanFly : AnimalLSP() {

    fun fly(){
        print("Animal can fly")
    }
}

class LionLSP : AnimalLSP(){
    //here we only inherit AnimalLsp methods eat()
}

class BatLSP : AnimalCanFly(){
//here we have all AnimalCanFly methods and extended methods from AnimalLSP
}