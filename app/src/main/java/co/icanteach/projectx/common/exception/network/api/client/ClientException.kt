package co.icanteach.projectx.common.exception.network.api.client

import co.icanteach.projectx.common.exception.network.api.ApiException

open class ClientException(open val statusCode: Int? = null) : ApiException()