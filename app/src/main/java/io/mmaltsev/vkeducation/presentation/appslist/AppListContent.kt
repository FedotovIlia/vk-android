package io.mmaltsev.vkeducation.presentation.appslist

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AppListContent(
    state: AppListState.Content,
    modifier: Modifier = Modifier,
) {
    val appIconUrl = state.apps.firstOrNull()?.iconUrl ?: "https://fastly.picsum.photos/id/237/200/200.jpg"

    Column(modifier = modifier.fillMaxSize()) {
        AppListToolbar(appIconUrl = appIconUrl)
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            items(state.apps, key = { it.id }) { app ->
                AppListItemCard(app = app)
            }
        }
    }
}
