package com.ereyes.cryptocurrencyappjetpackcompose.domain.repository

import com.ereyes.cryptocurrencyappjetpackcompose.data.model.CoinDetailModel
import com.ereyes.cryptocurrencyappjetpackcompose.data.model.CoinModel

/****
 * Project: CryptocurrencyAppJC
 * From: com.ereyes.cryptocurrencyappjetpackcompose.domain.repository
 * Created by Edgar Reyes Gonzalez on 4/18/2023 at 2:35 PM
 * All rights reserved 2023.
 ****/
interface CoinPaprikaRepository {

    suspend fun getAllCoins(): List<CoinModel>

    suspend fun getCoinById(coinId: String): CoinDetailModel
}