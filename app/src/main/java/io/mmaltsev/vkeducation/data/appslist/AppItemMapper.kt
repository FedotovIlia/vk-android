package io.mmaltsev.vkeducation.data.appslist

import io.mmaltsev.vkeducation.domain.appslist.AppItem

class AppItemMapper {
    fun toDomain(dto: AppItemDto): AppItem = AppItem(
        id = dto.id,
        name = dto.name,
        description = dto.description,
        category = dto.category,
        iconUrl = dto.iconUrl,
    )
}
