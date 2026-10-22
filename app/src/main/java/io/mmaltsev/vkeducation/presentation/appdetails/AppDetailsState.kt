package io.mmaltsev.vkeducation.presentation.appdetails

import androidx.compose.runtime.Immutable
import io.mmaltsev.vkeducation.domain.appdetails.AppDetails
import io.mmaltsev.vkeducation.domain.appdetails.SimilarApp
import io.mmaltsev.vkeducation.domain.appslist.AppItem

@Immutable
sealed interface AppDetailsState {
    data object Error : AppDetailsState
    data object Loading : AppDetailsState
    data class Content(
        val appDetails: AppDetails,
        val similarApps: List<SimilarApp>,
        val showcaseApps: List<AppItem>,
        val descriptionCollapsed: Boolean,
    ) : AppDetailsState
}
