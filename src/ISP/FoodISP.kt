package ISP

//here we let non_common methods in isolated interface (Hot food & cold food) to achieve ISP and avoid unwanted inherited code
enum class CategoriesISP{
    Seafood , Fast_food , Dessert , Meat , Liquid
}

interface FoodISP {
    fun name(): String
    fun category() : CategoriesISP
}

interface ColdFood: FoodISP {
    fun freeze() : String
}
interface HotFood: FoodISP {
    fun boil() : String
}

class IceCreamISP : ColdFood {
    override fun name(): String {
        return "Creamistry"
    }

    override fun category(): CategoriesISP {
        return CategoriesISP.Dessert
    }


    override fun freeze(): String {
        return "Freezing"
    }

}

class SoupISP : HotFood {
    override fun name(): String {
        return "Chicken Soup"
    }

    override fun category(): CategoriesISP {
        return CategoriesISP.Liquid
    }


    override fun boil(): String {
        return "Boiling"
    }

}
