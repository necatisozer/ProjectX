package co.icanteach.projectx.data.feed

import com.google.gson.annotations.SerializedName

class PopularTVShowsResponse(
    @SerializedName("results")
    val results: List<TvShow>
)