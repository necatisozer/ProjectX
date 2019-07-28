package co.icanteach.projectx.data.util.errorhandler

import co.icanteach.projectx.common.exception.network.NetworkException
import co.icanteach.projectx.common.exception.network.api.ApiException
import co.icanteach.projectx.common.exception.network.api.client.UnauthorizedException
import co.icanteach.projectx.common.exception.network.api.server.ServerException
import co.icanteach.projectx.common.exception.network.nonetwork.NoNetworkException
import retrofit2.HttpException
import java.io.IOException

object NetworkExceptionHandler {

    fun handle(throwable: Throwable) = when (throwable) {
        is HttpException -> throwable.handle()
        is IOException -> NoNetworkException(throwable)
        else -> NetworkException(throwable)
    }

    private fun HttpException.handle() = when (this.code()) {
        in 400..499 -> this.handleClientError()
        in 500..599 -> ServerException(this)
        else -> ApiException(this)
    }

    private fun HttpException.handleClientError() = when (this.code()) {
        401 -> UnauthorizedException()
    }

    private object ApiExceptionHandler {

    }
}