package com.crosstestingappium.elements.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseElementsGeneric extends GenericElements {

    @SerializedName("type")
    @Expose
    public String type;

    @SerializedName("value")
    @Expose
    public String value;

}
