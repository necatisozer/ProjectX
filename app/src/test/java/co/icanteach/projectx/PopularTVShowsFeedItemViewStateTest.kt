package co.icanteach.projectx

import co.icanteach.projectx.data.feed.TvShow
import co.icanteach.projectx.ui.PopularTVShowsFeedItemViewState
import com.google.common.truth.Truth
import org.junit.Test

class PopularTVShowsFeedItemViewStateTest {

    @Test
    fun `should match tv show name for given tv show`() {

        // Given
        val tvShow = createDummyTvShow()
        val givenViewState = PopularTVShowsFeedItemViewState(tvShow)

        // When
        val actualResult = givenViewState.getTvShowName()

        // Then
        Truth.assertThat(actualResult).isEqualTo("Chernobyl")
    }

    @Test
    fun `should match image url for given tv show`() {

        // Given
        val tvShow = createDummyTvShow()
        val givenViewState = PopularTVShowsFeedItemViewState(tvShow)

        // When
        val actualResult = givenViewState.getImageUrl()

        // Then
        Truth.assertThat(actualResult).isEqualTo("/hlLXt2tOPT6RRnjiUmoxyG1LTFi.jpg")
    }

    private fun createDummyTvShow(): TvShow {
        return TvShow(name = "Chernobyl", imageUrl = "/hlLXt2tOPT6RRnjiUmoxyG1LTFi.jpg", rating = "8.3")
    }
}