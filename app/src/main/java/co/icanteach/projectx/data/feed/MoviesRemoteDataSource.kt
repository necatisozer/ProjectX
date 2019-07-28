package co.icanteach.projectx.data.feed

import co.icanteach.projectx.common.ui.asRemote
import co.icanteach.projectx.data.InterviewRestInterface
import javax.inject.Inject

class MoviesRemoteDataSource @Inject constructor(private val restInterface: InterviewRestInterface) {

    fun fetchMovies(page: Int) = restInterface.fetchMovies(page).asRemote()

}