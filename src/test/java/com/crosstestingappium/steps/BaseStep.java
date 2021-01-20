package com.crosstestingappium.steps;

import com.crosstestingappium.utils.Utils;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.net.MalformedURLException;

public class BaseStep {

    @Before
    public void setup() throws MalformedURLException {
        Utils.init();
    }

    @After
    public void tearDown() {
        Utils.quit();
    }

}
