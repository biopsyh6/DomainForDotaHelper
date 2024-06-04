package org.example.entities

data class Role(
    var  roleId: Int? = null,
    var name: String = "",
    var image: Int = 0,
    var imageUrl: String = "",
    var firebaseId: String = ""
)