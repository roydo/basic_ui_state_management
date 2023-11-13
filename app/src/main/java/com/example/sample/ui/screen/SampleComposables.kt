package com.example.sample.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.sample.ui.SampleAppViewModel
import com.example.sample.ui.SampleUiState

@Composable
fun ComposableA(
    uiState: SampleUiState,
    viewModel: SampleAppViewModel = viewModel(),
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = modifier
            .fillMaxWidth()
    ) {
        Button(
            onClick = { viewModel.countUp() },
        ) {
            Text(
                text = "Count Up",
                fontSize = 24.sp
            )
        }
        Switch(
            checked = uiState.switchState,
            onCheckedChange = { viewModel.toggleSwitchState() })
    }
}

@Composable
fun ComposableB(
    uiState: SampleUiState,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Text(text = "${uiState.count}", fontSize = 36.sp)
    }
}

@Composable
fun ComposableC(
    uiState: SampleUiState,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Text(text = "${uiState.switchState}", fontSize = 36.sp)
    }
}

@Preview
@Composable
fun ComposableAPreview() {
    ComposableA(uiState = SampleUiState(), viewModel = viewModel())
}
