package com.ereyes.cryptocurrencyappjetpackcompose.data.network

import com.ereyes.cryptocurrencyappjetpackcompose.data.model.CoinDetailModel
import com.ereyes.cryptocurrencyappjetpackcompose.data.model.CoinModel
import retrofit2.http.GET
import retrofit2.http.Path

/****
 * Project: CryptocurrencyAppJC
 * From: com.ereyes.cryptocurrencyappjetpackcompose.data.network
 * Created by Edgar Reyes Gonzalez on 4/18/2023 at 1:32 PM
 * All rights reserved 2023.
 ****/
interface CoinPaprikaApi {

    @GET("v1/coins/")
    suspend fun getAllCoins(): List<CoinModel>

    @GET("v1/coins/{coinId}")
    suspend fun getCoinById(
        @Path("coinId") coinId: String
    ): CoinDetailModel
}