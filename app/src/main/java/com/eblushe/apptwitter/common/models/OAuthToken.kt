package com.eblushe.apptwitter.common.models

class OAuthToken(val accessToken: String?, val tokenType: String? = "bearer") {
    var authorization : String = ""; get() = "$tokenType $accessToken"

    companion object {
        val ACCESS_TOKEN_TAG: String = "ACCESS_TOKEN_TAG"
    }
}