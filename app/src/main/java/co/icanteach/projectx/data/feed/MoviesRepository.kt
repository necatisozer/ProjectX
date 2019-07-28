package co.icanteach.projectx.data.feed

import javax.inject.Inject


class MoviesRepository @Inject constructor(private val moviesRemoteDataSource: MoviesRemoteDataSource) {

    fun fetchMovies(page: Int) = moviesRemoteDataSource.fetchMovies(page)

}