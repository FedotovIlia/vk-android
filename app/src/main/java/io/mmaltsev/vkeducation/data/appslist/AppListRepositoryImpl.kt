package io.mmaltsev.vkeducation.data.appslist

import io.mmaltsev.vkeducation.domain.appslist.AppItem
import io.mmaltsev.vkeducation.domain.appslist.AppListRepository
import javax.inject.Inject

class AppListRepositoryImpl @Inject constructor(
    private val api: AppListApi,
    private val mapper: AppItemMapper,
) : AppListRepository {
    override suspend fun getAppList(): List<AppItem> {
        return api.getAppList().map { mapper.toDomain(it) }
    }
}
