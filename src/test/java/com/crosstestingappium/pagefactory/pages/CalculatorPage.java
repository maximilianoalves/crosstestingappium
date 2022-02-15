package com.crosstestingappium.pagefactory.pages;

import com.crosstestingappium.pagefactory.elements.CalculatorElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage extends CalculatorElement {

    public CalculatorPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

   public String viewResultText() { return getText(getTextViewResult());}

   public void fillFieldFirstNumber(String number) {
       sendKeys(getFieldFirstNumber(), number);
   }

    public void fillFieldSecondNumber(String number) {
        sendKeys(getFieldSecondNumber(), number);
    }

    public void clickBtnSum() {
       click(getBtnSum());
    }

    public void clickBtnSubtract() {
        click(getBtnSubtract());
    }

    public void clickBtnMultiply() {
        click(getBtnMultiply());
    }

    public void clickBtnDivide() {
        click(getBtnDivide());
    }

    public void isCalculatorPage() {
       visibilityOf(getTextViewResult());
    }

    public void clickOperator(String operator) {
       if (operator.equals("sum")) {
           clickBtnSum();
       } else if (operator.equals("subtract")) {
           clickBtnSubtract();
       } else if (operator.equals("multiply")) {
           clickBtnMultiply();
       } else if (operator.equals("divide")) {
           clickBtnDivide();
       }
    }
}
