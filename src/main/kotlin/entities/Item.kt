package org.example.entities

data class Item (
    var itemId: Int = 0,
    var name: String = "",
    var price: String = "",
    var description: String = "",
    var image: Int = 0,
    var imageUrl: String = "",
    var attributes: List<Attributes> = listOf(),
    var type: String = "",
    var firebaseId: String = "",

    )
//    : Parcelable

//@Parcelize
data class Attributes(
    val value: String = "",
    val label: String = ""
)
//    : Parcelable