package org.example.entities

data class Neutral (
    var neutralId: Int? = null,
    var name: String,
    var description: String,
    var generalGold: Int,
    var generalExp: Int,
    var generalHp: Int,
    var skills: String,
    var image: Int
)