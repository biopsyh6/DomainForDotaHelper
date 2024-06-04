package org.example.entities


//@Parcelize
data class Hero(
    var heroId: Int = 0,
    var attributeId: String = "",
    var roleIds: List<String> = listOf(),
    var name: String = "",
    var health: Int = 0,
    var mana: Int = 0,
    var strength: Int = 0,
    var agility: Int = 0,
    var intelligence: Int = 0,
    var damage: String = "",
    var armor: Double = 0.0,
    var speed: Int = 0,
    var attackRange: Int = 0,
    var attackSpeed: Double = 0.0,
    var image: Int = 0,
    var imageUrl: String = "",
    var description: String = "",
    var nameForUrl: String = "",
    var firebaseId: String = ""
)
//    : Parcelable