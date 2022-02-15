package com.crosstestingappium.pagefactory.elements;

import com.crosstestingappium.pagefactory.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.Data;

@Data
public class CalculatorElement extends BasePage {

    @AndroidFindBy(id = "com.example.leonardomenezes.simplecalculatorandroid:id/android_result_text")
    @iOSXCUITFindBy(accessibility = "apple_result_text")
    MobileElement textViewResult;

    @AndroidFindBy(id = "com.example.leonardomenezes.simplecalculatorandroid:id/android_field_first_number")
    @iOSXCUITFindBy(accessibility = "apple_first_input")
    MobileElement fieldFirstNumber;

    @AndroidFindBy(id = "com.example.leonardomenezes.simplecalculatorandroid:id/android_field_second_number")
    @iOSXCUITFindBy(accessibility = "apple_second_input")
    MobileElement fieldSecondNumber;

    @AndroidFindBy(id = "com.example.leonardomenezes.simplecalculatorandroid:id/android_button_sum")
    @iOSXCUITFindBy(accessibility = "apple-sum-button")
    MobileElement btnSum;

    @AndroidFindBy(id = "com.example.leonardomenezes.simplecalculatorandroid:id/android_button_sub")
    @iOSXCUITFindBy(accessibility = "apple-subtract-button")
    MobileElement btnSubtract;

    @AndroidFindBy(id = "com.example.leonardomenezes.simplecalculatorandroid:id/android_button_mult")
    @iOSXCUITFindBy(accessibility = "apple-multiply-button")
    MobileElement btnMultiply;

    @AndroidFindBy(id = "com.example.leonardomenezes.simplecalculatorandroid:id/android_button_div")
    @iOSXCUITFindBy(accessibility = "apple-divide-button")
    MobileElement btnDivide;
}
