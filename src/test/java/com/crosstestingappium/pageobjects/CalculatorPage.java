package com.crosstestingappium.pageobjects;

import com.crosstestingappium.elements.models.ElementsModel;
import com.crosstestingappium.elements.models.GenericElements;
import com.crosstestingappium.utils.Mappings;
import io.appium.java_client.MobileElement;

public class CalculatorPage extends BasePage {

    GenericElements map = new Mappings<ElementsModel>("CalculatorPage").getJson();

    MobileElement textViewResult = element(map.getTextViewResult());
    MobileElement fieldFirstNumber = element(map.getFieldFirstNumber());
    MobileElement fieldSecondNumber = element(map.getFieldSecondNumber());
    MobileElement btnSum = element(map.getBtnSum());
    MobileElement btnSubtract = element(map.getBtnSubtract());
    MobileElement btnMultiply = element(map.getBtnMultiply());
    MobileElement btnDivide = element(map.getBtnDivide());

   public String getTextViewResult() {
       return getText(textViewResult);
   }

   public void fillFieldFirstNumber(String number) {
       sendKeys(fieldFirstNumber, number);
   }

    public void fillFieldSecondNumber(String number) {
        sendKeys(fieldSecondNumber, number);
    }

    public void clickBtnSum() {
       click(btnSum);
    }

    public void clickBtnSubtract() {
        click(btnSubtract);
    }

    public void clickBtnMultiply() {
        click(btnMultiply);
    }

    public void clickBtnDivide() {
        click(btnDivide);
    }

    public void isCalculatorPage() {
       visibilityOf(textViewResult);
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
