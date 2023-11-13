package com.example.sample

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.example.sample.ui.theme.SampleTheme
import org.junit.Rule
import org.junit.Test

class MyTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun checkText() {
        composeTestRule.setContent {
            SampleTheme {
                Greeting()
            }
        }

        // 初期状態
        composeTestRule.onNodeWithText(
            text = "hello android!",
            ignoreCase = true
        ).assertIsDisplayed()

        // ボタンをクリック
        composeTestRule.onNodeWithText("Button").performClick()

        // 文字列が変わった状態
        composeTestRule.onNodeWithText(
            text = "hello jetpack compose!",
            ignoreCase = true
        ).assertIsDisplayed()
    }
}