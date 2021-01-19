package br.com.crosstestingappium.steps;

import br.com.crosstestingappium.utils.Utils;
import org.junit.After;
import org.junit.Before;

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
