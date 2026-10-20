package io.mmaltsev.vkeducation.domain.appslist

interface AppListRepository {
    suspend fun getAppList(): List<AppItem>
}
