package org.example.entities

//@Parcelize
data class SpecialValue (
    var name: String = "",
    var values: List<Float> = listOf(),
    var isPercentage: Boolean = false,
    var heading: String = ""
)
//    : Parcelable