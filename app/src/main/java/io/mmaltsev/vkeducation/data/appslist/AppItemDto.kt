package io.mmaltsev.vkeducation.data.appslist

import io.mmaltsev.vkeducation.domain.appdetails.Category
import kotlinx.serialization.Serializable

@Serializable
data class AppItemDto(
    val id: String,
    val name: String,
    val description: String,
    val category: Category,
    val iconUrl: String,
)
