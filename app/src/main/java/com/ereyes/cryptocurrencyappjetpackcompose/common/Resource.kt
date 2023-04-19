package com.ereyes.cryptocurrencyappjetpackcompose.common

/****
 * Project: CryptocurrencyAppJC
 * From: com.ereyes.cryptocurrencyappjetpackcompose.common
 * Created by Edgar Reyes Gonzalez on 4/18/2023 at 1:59 PM
 * All rights reserved 2023.
 ****/
sealed class Resource<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T) : Resource<T>(data)
    class Error<T>(message: String, data: T? = null): Resource<T>(data, message)
    class Loading<T>(data: T? = null) : Resource<T>(data)
}