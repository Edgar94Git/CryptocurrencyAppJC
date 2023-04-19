package com.ereyes.cryptocurrencyappjetpackcompose.presentation.coin_list

import com.ereyes.cryptocurrencyappjetpackcompose.domain.model.Coin

/****
 * Project: CryptocurrencyAppJC
 * From: com.ereyes.cryptocurrencyappjetpackcompose.presentation.coin_list
 * Created by Edgar Reyes Gonzalez on 4/18/2023 at 4:27 PM
 * All rights reserved 2023.
 ****/
data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = mutableListOf(),
    val error: String = ""
)