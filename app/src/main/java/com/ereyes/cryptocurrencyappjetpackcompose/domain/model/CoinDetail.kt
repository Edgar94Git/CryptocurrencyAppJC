package com.ereyes.cryptocurrencyappjetpackcompose.domain.model

import com.ereyes.cryptocurrencyappjetpackcompose.data.model.TeamMember

/****
 * Project: CryptocurrencyAppJC
 * From: com.ereyes.cryptocurrencyappjetpackcompose.domain.model
 * Created by Edgar Reyes Gonzalez on 4/18/2023 at 1:30 PM
 * All rights reserved 2023.
 ****/
data class CoinDetail(
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val isActive: Boolean,
    val tags: List<String>,
    val team: List<TeamMember>
)