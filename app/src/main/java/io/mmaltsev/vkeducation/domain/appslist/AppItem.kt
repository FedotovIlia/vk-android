package io.mmaltsev.vkeducation.domain.appslist

import io.mmaltsev.vkeducation.domain.appdetails.Category

data class AppItem(
    val id: String,
    val name: String,
    val description: String,
    val category: Category,
    val iconUrl: String,
)
