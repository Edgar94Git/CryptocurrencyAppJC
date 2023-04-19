package com.ereyes.cryptocurrencyappjetpackcompose.domain.use_case

import com.ereyes.cryptocurrencyappjetpackcompose.common.Resource
import com.ereyes.cryptocurrencyappjetpackcompose.data.model.toCoinDetail
import com.ereyes.cryptocurrencyappjetpackcompose.domain.model.CoinDetail
import com.ereyes.cryptocurrencyappjetpackcompose.domain.repository.CoinPaprikaRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

/****
 * Project: CryptocurrencyAppJC
 * From: com.ereyes.cryptocurrencyappjetpackcompose.domain.use_case
 * Created by Edgar Reyes Gonzalez on 4/18/2023 at 2:53 PM
 * All rights reserved 2023.
 ****/
class GetCoinUseCase @Inject constructor(
    private val repository: CoinPaprikaRepository
) {

    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading())
            val coin = repository.getCoinById(coinId).toCoinDetail()
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