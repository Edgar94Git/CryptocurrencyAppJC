package com.ereyes.cryptocurrencyappjetpackcompose.data.repository

import com.ereyes.cryptocurrencyappjetpackcompose.data.model.CoinDetailModel
import com.ereyes.cryptocurrencyappjetpackcompose.data.model.CoinModel
import com.ereyes.cryptocurrencyappjetpackcompose.data.network.CoinPaprikaApi
import com.ereyes.cryptocurrencyappjetpackcompose.domain.repository.CoinPaprikaRepository
import javax.inject.Inject

/****
 * Project: CryptocurrencyAppJC
 * From: com.ereyes.cryptocurrencyappjetpackcompose.data.repository
 * Created by Edgar Reyes Gonzalez on 4/18/2023 at 1:35 PM
 * All rights reserved 2023.
 ****/
class CoinPaprikaRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinPaprikaRepository{

    override suspend fun getAllCoins(): List<CoinModel> {
        return api.getAllCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailModel {
        return api.getCoinById(coinId)
    }
}