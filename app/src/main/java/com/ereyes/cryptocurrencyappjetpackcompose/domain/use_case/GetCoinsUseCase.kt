package com.ereyes.cryptocurrencyappjetpackcompose.domain.use_case

import com.ereyes.cryptocurrencyappjetpackcompose.common.Resource
import com.ereyes.cryptocurrencyappjetpackcompose.data.model.toCoin
import com.ereyes.cryptocurrencyappjetpackcompose.domain.model.Coin
import com.ereyes.cryptocurrencyappjetpackcompose.domain.repository.CoinPaprikaRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

/****
 * Project: CryptocurrencyAppJC
 * From: com.ereyes.cryptocurrencyappjetpackcompose.domain.use_case
 * Created by Edgar Reyes Gonzalez on 4/18/2023 at 2:40 PM
 * All rights reserved 2023.
 ****/
class GetCoinsUseCase @Inject constructor(
    private val repository: CoinPaprikaRepository
) {

    operator fun invoke() : Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading())
            val coin = repository.getAllCoins().map { it.toCoin() }
            emit(Resource.Success(coin))
        }
        catch (e: HttpException){
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        }
        catch (e: IOException){
            emit(Resource.Error(e.localizedMessage ?: "Couldn't reach the server. Check your internet connection"))
        }
    }
}