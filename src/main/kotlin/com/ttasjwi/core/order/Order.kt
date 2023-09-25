package com.ttasjwi.core.order

data class Order(
    val memberId: Long,
    val itemName: String,
    val itemPrice: Int,
    val discountPrice: Int) {

    fun calculatePrice(): Int =
        itemPrice - discountPrice

}
