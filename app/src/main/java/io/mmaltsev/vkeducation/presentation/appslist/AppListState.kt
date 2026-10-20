package io.mmaltsev.vkeducation.presentation.appslist

import androidx.compose.runtime.Immutable
import io.mmaltsev.vkeducation.domain.appslist.AppItem

@Immutable
sealed interface AppListState {
    data object Loading : AppListState
    data object Error : AppListState
    data class Content(val apps: List<AppItem>) : AppListState
}
