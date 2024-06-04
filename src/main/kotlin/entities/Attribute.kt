package org.example.entities


data class Attribute(
    var attributeId: Int = 0,
    var name: String = "",
    var image: Int = 0,
    var imageUrl: String = "",
    var firebaseId: String = ""
)