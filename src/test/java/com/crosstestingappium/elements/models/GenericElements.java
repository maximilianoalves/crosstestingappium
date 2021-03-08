package com.crosstestingappium.elements.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class GenericElements {

    @Expose
    @SerializedName("textViewResult")
    protected BaseElementsGeneric textViewResult;

    @Expose
    @SerializedName("fieldFirstNumber")
    protected BaseElementsGeneric fieldFirstNumber;

    @Expose
    @SerializedName("fieldSecondNumber")
    protected BaseElementsGeneric fieldSecondNumber;

    @Expose
    @SerializedName("btnSum")
    protected BaseElementsGeneric btnSum;

    @Expose
    @SerializedName("btnSubtract")
    protected BaseElementsGeneric btnSubtract;

    @Expose
    @SerializedName("btnMultiply")
    protected BaseElementsGeneric btnMultiply;

    @Expose
    @SerializedName("btnDivide")
    protected BaseElementsGeneric btnDivide;
}
