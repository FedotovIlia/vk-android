package io.mmaltsev.vkeducation.domain.appslist

import javax.inject.Inject

class GetAppListUseCase @Inject constructor(
    private val repository: AppListRepository,
) {
    suspend operator fun invoke(): List<AppItem> = repository.getAppList()
}
