package io.mmaltsev.vkeducation.presentation.appslist

sealed interface AppListEvent {
    data class ShowSnackbar(val message: String) : AppListEvent
}
