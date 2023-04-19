package com.ereyes.cryptocurrencyappjetpackcompose.data.model

import com.ereyes.cryptocurrencyappjetpackcompose.domain.model.Coin
import com.google.gson.annotations.SerializedName

data class CoinModel(
    @SerializedName("id") val Id: String,
    @SerializedName("is_active") val IsActive: Boolean,
    @SerializedName("is_new") val IsNew: Boolean,
    @SerializedName("name") val Name: String,
    @SerializedName("rank") val Rank: Int,
    @SerializedName("symbol") val Symbol: String,
    @SerializedName("type") val Type: String
)

fun CoinModel.toCoin() = Coin(
    Id = Id,
    IsActive = IsActive,
    Name = Name,
    Rank = Rank,
    Symbol = Symbol
)