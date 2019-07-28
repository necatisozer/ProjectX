package co.icanteach.projectx.common.exception.network.api

import co.icanteach.projectx.common.exception.network.NetworkException

open class ApiException(override val cause: Throwable? = null) : NetworkException()
