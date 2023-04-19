package com.ereyes.cryptocurrencyappjetpackcompose.presentation.coin_detail

import com.ereyes.cryptocurrencyappjetpackcompose.domain.model.CoinDetail

/****
 * Project: CryptocurrencyAppJC
 * From: com.ereyes.cryptocurrencyappjetpackcompose.presentation.coin_detail
 * Created by Edgar Reyes Gonzalez on 4/18/2023 at 4:43 PM
 * All rights reserved 2023.
 ****/
data class CoinDetailState (
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)