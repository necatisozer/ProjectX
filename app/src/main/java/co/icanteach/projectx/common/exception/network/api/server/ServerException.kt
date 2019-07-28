package co.icanteach.projectx.common.exception.network.api.server

import co.icanteach.projectx.common.exception.network.api.ApiException

open class ServerException(override val cause: Throwable? = null) : ApiException()
