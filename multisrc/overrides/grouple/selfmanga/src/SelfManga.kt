package eu.kanade.tachiyomi.extension.ru.selfmanga

import eu.kanade.tachiyomi.multisrc.grouple.GroupLe
import eu.kanade.tachiyomi.network.GET
import eu.kanade.tachiyomi.source.model.Filter
import eu.kanade.tachiyomi.source.model.FilterList
import okhttp3.HttpUrl.Companion.toHttpUrlOrNull
import okhttp3.Request

class SelfManga : GroupLe("SelfManga", "https://selfmanga.live", "ru") {

    override val id: Long = 5227602742162454547

    override fun searchMangaRequest(page: Int, query: String, filters: FilterList): Request {
        val url = "$baseUrl/search/advanced".toHttpUrlOrNull()!!.newBuilder()
        (if (filters.isEmpty()) getFilterList() else filters).forEach { filter ->
            when (filter) {
                is GenreList -> filter.state.forEach { genre ->
                    if (genre.state != Filter.TriState.STATE_IGNORE) {
                        url.addQueryParameter(genre.id, arrayOf("=", "=in", "=ex")[genre.state])
                    }
                }
                is Category -> filter.state.forEach { category ->
                    if (category.state != Filter.TriState.STATE_IGNORE) {
                        url.addQueryParameter(category.id, arrayOf("=", "=in", "=ex")[category.state])
                    }
                }
                else -> return@forEach
            }
        }
        if (query.isNotEmpty()) {
            url.addQueryParameter("q", query)
        }
        return if (url.toString().contains("?"))
            GET(url.toString().replace("=%3D", "="), headers)
        else  popularMangaRequest(page)
    }

    private class Genre(name: String, val id: String) : Filter.TriState(name)
    private class GenreList(genres: List<Genre>) : Filter.Group<Genre>("Genres", genres)
    private class Category(categories: List<Genre>) : Filter.Group<Genre>("Category", categories)

    override fun getFilterList() = FilterList(
        Category(getCategoryList()),
        GenreList(getGenreList())
    )

    private fun getCategoryList() = listOf(
        Genre("Артбук", "el_5894"),
        Genre("Веб", "el_2160"),
        Genre("Журнал", "el_4983"),
        Genre("Ранобэ", "el_5215"),
        Genre("Сборник", "el_2157")
    )

    private fun getGenreList() = listOf(
        Genre("боевик", "el_2155"),
        Genre("боевые искусства", "el_2143"),
        Genre("вампиры", "el_2148"),
        Genre("гарем", "el_2142"),
        Genre("гендерная интрига", "el_2156"),
        Genre("героическое фэнтези", "el_2146"),
        Genre("детектив", "el_2152"),
        Genre("дзёсэй", "el_2158"),
        Genre("додзинси", "el_2141"),
        Genre("драма", "el_2118"),
        Genre("ёнкома", "el_2161"),
        Genre("история", "el_2119"),
        Genre("комедия", "el_2136"),
        Genre("махо-сёдзё", "el_2147"),
        Genre("мистика", "el_2132"),
        Genre("научная фантастика", "el_2133"),
        Genre("повседневность", "el_2135"),
        Genre("постапокалиптика", "el_2151"),
        Genre("приключения", "el_2130"),
        Genre("психология", "el_2144"),
        Genre("романтика", "el_2121"),
        Genre("сверхъестественное", "el_2159"),
        Genre("сёдзё", "el_2122"),
        Genre("сёдзё-ай", "el_2128"),
        Genre("сёнэн", "el_2134"),
        Genre("сёнэн-ай", "el_2139"),
        Genre("спорт", "el_2129"),
        Genre("сэйнэн", "el_5838"),
        Genre("трагедия", "el_2153"),
        Genre("триллер", "el_2150"),
        Genre("ужасы", "el_2125"),
        Genre("фантастика", "el_2140"),
        Genre("фэнтези", "el_2131"),
        Genre("школа", "el_2127"),
        Genre("этти", "el_4982")
    )
}
