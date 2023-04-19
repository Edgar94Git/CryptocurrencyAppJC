package com.ereyes.cryptocurrencyappjetpackcompose.presentation

/****
 * Project: CryptocurrencyAppJC
 * From: com.ereyes.cryptocurrencyappjetpackcompose.presentation
 * Created by Edgar Reyes Gonzalez on 4/18/2023 at 5:27 PM
 * All rights reserved 2023.
 ****/
sealed class Screen(val route: String){
    object CoinListScreen: Screen("coin_list_screen")
    object CoinDetailScreen: Screen("coin_detail_screen")
}
