package ISP

enum class Categories{
    Seafood , Fast_food , Dessert , Meat , Liquid
}
interface Food {
    fun name(): String
    fun category() : Categories
    fun boil() : String
    fun freeze(): String

}

class IceCream : Food {
    override fun name(): String {
        return "Creamistry"
    }

    override fun category(): Categories {
        return Categories.Dessert
    }


    override fun boil(): String {
// there no need  to call boil method on foods of type Dessert
        TODO("not implemented")
    }

    override fun freeze(): String {
        return "Freezing"
    }

}

class Soup : Food {
    override fun name(): String {
        return "Chicken Soup"
    }

    override fun category(): Categories {
        return Categories.Liquid
    }


    override fun boil(): String {
        return "Boiling"
    }

    override fun freeze(): String {
// there no need  to call freezing method with soup
        TODO("not implemented")
    }

}
