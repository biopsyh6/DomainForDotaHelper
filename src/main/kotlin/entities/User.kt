package org.example.entities

data class User (
    var userId: Int? = null,
    var login: String = "",
    var email: String = "",
    val steamid: String = "",
    var firebaseId: String = ""
)