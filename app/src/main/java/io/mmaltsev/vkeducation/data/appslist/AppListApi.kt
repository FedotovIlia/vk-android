package io.mmaltsev.vkeducation.data.appslist

import io.mmaltsev.vkeducation.domain.appdetails.Category

class AppListApi {
    suspend fun getAppList(): List<AppItemDto> = listOf(
        AppItemDto(
            id = "fa2e31b8-1234-4cf7-9914-108a170a1b01",
            name = "QuickNote",
            description = "Умный блокнот для быстрых заметок, списков задач и идей с синхронизацией.",
            category = Category.PRODUCTIVITY,
            iconUrl = "https://fastly.picsum.photos/id/237/200/200.jpg?hmac=zHUGikXUDyLCCmvyww1izLK3R3k8oRYBRiTizZEdyfI",
        ),
        AppItemDto(
            id = "82ea6f63-2b2a-43e1-b54c-ec62e6e27229",
            name = "Calmalist",
            description = "Приложение для медитации и расслабления, которое поможет улучшить сон и снизить стресс.",
            category = Category.HEALTH,
            iconUrl = "https://fastly.picsum.photos/id/238/200/200.jpg?hmac=O4Jc6lqHVfaKVzLf8bWssNTbWzQoaRUC0TDXod9xDdM",
        ),
        AppItemDto(
            id = "c6f64035-c432-4aad-a550-a1dac2d3b047",
            name = "FitRiver",
            description = "Фитнес-трекер и план тренировок для достижения спортивных целей дома и в зале.",
            category = Category.SPORTS,
            iconUrl = "https://fastly.picsum.photos/id/239/200/200.jpg?hmac=8JqlXUpZ9Xy0H6tMK8sCPQAYU9vUn9Qa8Kg-U9h3sCY",
        ),
        AppItemDto(
            id = "d22b7cda-2d36-4ebd-bfa3-be58770fa455",
            name = "TaskLoop",
            description = "Эффективный менеджер задач для командной работы и личной продуктивности.",
            category = Category.PRODUCTIVITY,
            iconUrl = "https://fastly.picsum.photos/id/240/200/200.jpg?hmac=PZiJibMUuv5Zpv9MAcqLaCYJOPt-XNuDh3RPBZiGcoY",
        ),
        AppItemDto(
            id = "f830e414-42a9-4fe6-af16-555a85f6f6c2",
            name = "Pixtrix",
            description = "Мощный графический редактор с фильтрами и инструментами ретуши фотографий.",
            category = Category.PHOTOGRAPHY,
            iconUrl = "https://fastly.picsum.photos/id/241/200/200.jpg?hmac=F-mDYyK1xUiXjlLd5PvE8EQpTwGfFndV7mMaANDtl28",
        ),
        AppItemDto(
            id = "ba31ce5d-b214-46e9-bf7c-35e99e70af14",
            name = "TinyChef",
            description = "Сборник быстрых и вкусных рецептов на каждый день с пошаговыми инструкциями.",
            category = Category.FOOD,
            iconUrl = "https://fastly.picsum.photos/id/242/200/200.jpg?hmac=Z3aa8zbEQkEMFgnVh0Pn96vmCZHhJ17qzCrePYksrcY",
        ),
        AppItemDto(
            id = "204a939c-39fb-4c9d-bed9-daeeba8a465e",
            name = "GymMate",
            description = "Персональный помощник в спортзале для контроля веса и упражнений.",
            category = Category.SPORTS,
            iconUrl = "https://fastly.picsum.photos/id/243/200/200.jpg?hmac=fW5ZwzzyTBy2t2MROp988oq12mZnKwN0coFLhZEE87s",
        ),
        AppItemDto(
            id = "1ec98719-1d86-4cdc-b99d-11c6c23d981e",
            name = "FlowCard",
            description = "Интерактивные карточки для запоминания иностранных слов и обучения.",
            category = Category.EDUCATION,
            iconUrl = "https://fastly.picsum.photos/id/244/200/200.jpg?hmac=Q1gdvE6ZPZUX3nXkxvmzuc12eKVZ9XVEmSH3nCJ2OOo",
        ),
    )
}
