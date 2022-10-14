package com.leroy.oparetachallenge.utils

import android.text.TextUtils
import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException
import java.util.concurrent.TimeUnit

class NetworkInterceptor : Interceptor {
    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        val sTimeout = original.header("timeout")
        val timeout =
            if (sTimeout != null && TextUtils.isDigitsOnly(sTimeout)) sTimeout.toInt() else 60
        val requestBuilder = original.newBuilder()
            .header("X-CMC_PRO_API_KEY", "6c3cb570-cfd6-4ddc-9c1b-7e5bddb2c69a")
            .method(original.method, original.body)
        val newRequest = requestBuilder.build()
        val response = chain.withConnectTimeout(timeout, TimeUnit.SECONDS).proceed(newRequest)
        return response.newBuilder()
            .header("Cache-Control", "no-cache,no-store, must-revalidate")
            .removeHeader("ETag")
            .build()
    }
}