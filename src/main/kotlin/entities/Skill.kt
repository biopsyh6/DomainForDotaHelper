package org.example.entities

//@Parcelize
data class Skill(
    var skillId: Int = 0,
    var heroId: String = "",
    var skillName: String = "",
    var heroName: String = "",
    var description: String = "",
    var image: Int = 0,
    var imageUrl: String = "",
    var damageType: String = "",
    var maxLevel: Int = 0,
    var specialValues: List<SpecialValue> = listOf(),
    var abilityHasScepter: Boolean = false,
    var abilityHasShard: Boolean = false,
    var abilityIsGrantedByScepter: Boolean = false,
    var abilityIsGrantedByShard: Boolean = false,
    var shardDescription: String = "",
    var scepterDescription: String = "",
    var firebaseId: String = ""
)
//    : Parcelable