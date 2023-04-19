package com.ereyes.cryptocurrencyappjetpackcompose.domain.model

/****
 * Project: CryptocurrencyAppJC
 * From: com.ereyes.cryptocurrencyappjetpackcompose.domain.model
 * Created by Edgar Reyes Gonzalez on 4/18/2023 at 1:29 PM
 * All rights reserved 2023.
 ****/
data class Coin(
    val Id: String,
    val IsActive: Boolean,
    val Name: String,
    val Rank: Int,
    val Symbol: String
)