package com.ereyes.cryptocurrencyappjetpackcompose.di

import com.ereyes.cryptocurrencyappjetpackcompose.common.Constants
import com.ereyes.cryptocurrencyappjetpackcompose.data.network.CoinPaprikaApi
import com.ereyes.cryptocurrencyappjetpackcompose.data.repository.CoinPaprikaRepositoryImpl
import com.ereyes.cryptocurrencyappjetpackcompose.domain.repository.CoinPaprikaRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/****
 * Project: CryptocurrencyAppJC
 * From: com.ereyes.cryptocurrencyappjetpackcompose.di
 * Created by Edgar Reyes Gonzalez on 4/18/2023 at 1:39 PM
 * All rights reserved 2023.
 ****/
@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideCoinPaprikaApi(retrofit: Retrofit): CoinPaprikaApi{
        return retrofit.create(CoinPaprikaApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinPaprikaRepository(api: CoinPaprikaApi): CoinPaprikaRepository {
        return CoinPaprikaRepositoryImpl(api)
    }

}