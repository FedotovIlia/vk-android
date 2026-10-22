package io.mmaltsev.vkeducation.presentation.appdetails

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import io.mmaltsev.vkeducation.domain.appslist.AppItem
import io.mmaltsev.vkeducation.presentation.appslist.AppListItemCard

@Composable
fun AppShowcase(
    apps: List<AppItem>,
    onAppClick: (AppItem) -> Unit,
    modifier: Modifier = Modifier,
) {
    val pages = apps.chunked(3).take(3)
    if (pages.isEmpty()) return

    val pagerState = rememberPagerState { pages.size }

    Column(modifier = modifier) {
        Text(
            text = "Витрина",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 16.dp),
        )
        Spacer(Modifier.height(8.dp))
        HorizontalPager(
            state = pagerState,
            contentPadding = PaddingValues(horizontal = 16.dp),
            pageSpacing = 16.dp,
        ) { pageIndex ->
            val pageApps = pages[pageIndex]
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                pageApps.forEach { app ->
                    AppListItemCard(
                        app = app,
                        modifier = Modifier.fillMaxWidth(),
                        onClick = { onAppClick(app) },
                    )
                }
            }
        }
    }
}
