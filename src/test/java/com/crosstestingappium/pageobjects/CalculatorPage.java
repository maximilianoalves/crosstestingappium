package com.crosstestingappium.pageobjects;

import com.crosstestingappium.utils.FindTypes;
import com.crosstestingappium.utils.Mappings;
import io.appium.java_client.MobileElement;

public class CalculatorPage extends BasePage {

    Mappings mappings = new Mappings("CalculatorPage");

    MobileElement textViewResult = element(FindTypes.valueOf(mappings.getType("textViewResult")), mappings.getValue("textViewResult"));
    MobileElement fieldFirstNumber = element(FindTypes.valueOf(mappings.getType("fieldFirstNumber")), mappings.getValue("fieldFirstNumber"));
    MobileElement fieldSecondNumber = element(FindTypes.valueOf(mappings.getType("fieldSecondNumber")), mappings.getValue("fieldSecondNumber"));
    MobileElement btnSum = element(FindTypes.valueOf(mappings.getType("btnSum")), mappings.getValue("btnSum"));
    MobileElement btnSubtract = element(FindTypes.valueOf(mappings.getType("btnSubtract")), mappings.getValue("btnSubtract"));
    MobileElement btnMultiply = element(FindTypes.valueOf(mappings.getType("btnMultiply")), mappings.getValue("btnMultiply"));
    MobileElement btnDivide = element(FindTypes.valueOf(mappings.getType("btnDivide")), mappings.getValue("btnDivide"));

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
