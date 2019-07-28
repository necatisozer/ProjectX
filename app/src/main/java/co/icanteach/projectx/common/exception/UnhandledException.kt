package co.icanteach.projectx.common.exception

class UnhandledException(override val cause: Throwable) : RuntimeException()