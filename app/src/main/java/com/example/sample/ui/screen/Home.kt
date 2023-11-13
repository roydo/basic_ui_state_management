package com.example.sample.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.sample.ui.SampleAppViewModel

@Composable
fun Home(
    modifier: Modifier = Modifier,
    viewModel: SampleAppViewModel = viewModel()
) {
    // Enable to use UiState
    val uiState by viewModel.uiState.collectAsState()
    
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        ComposableA(
            uiState = uiState,
            viewModel = viewModel,
            modifier = modifier.weight(1F)
        )
        ComposableB(
            uiState = uiState,
            modifier = modifier.weight(1F)
        )
        ComposableC(
            uiState = uiState,
            modifier = modifier.weight(1F)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    Home(modifier = Modifier.fillMaxSize())
}