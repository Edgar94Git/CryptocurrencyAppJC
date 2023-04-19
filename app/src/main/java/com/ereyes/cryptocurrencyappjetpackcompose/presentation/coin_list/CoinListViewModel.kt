package com.ereyes.cryptocurrencyappjetpackcompose.presentation.coin_list

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ereyes.cryptocurrencyappjetpackcompose.common.Resource
import com.ereyes.cryptocurrencyappjetpackcompose.domain.use_case.GetCoinsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

/****
 * Project: CryptocurrencyAppJC
 * From: com.ereyes.cryptocurrencyappjetpackcompose.presentation.coin_list
 * Created by Edgar Reyes Gonzalez on 4/18/2023 at 4:22 PM
 * All rights reserved 2023.
 ****/
@HiltViewModel
class CoinListViewModel @Inject constructor(
    private val getCoinsUseCase: GetCoinsUseCase
): ViewModel() {

    private val _state = mutableStateOf(CoinListState())
    val state: State<CoinListState> = _state

    init {
        getCoins()
    }

    private fun getCoins(){
        getCoinsUseCase().onEach { result ->
            when(result) {
                is Resource.Error -> {
                    _state.value = CoinListState( error = result.message ?: "An unexpected error occurred")
                }
                is Resource.Loading -> {
                    _state.value = CoinListState(isLoading = true)
                }
                is Resource.Success -> {
                    _state.value = CoinListState(coins = result.data ?: emptyList())
                }
            }
        }.launchIn(viewModelScope)
    }

}