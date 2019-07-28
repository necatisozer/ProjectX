package co.icanteach.projectx.common.exception.network.nonetwork

import co.icanteach.projectx.common.exception.network.NetworkException

class NoNetworkException(override val cause: Throwable? = null) : NetworkException(cause)