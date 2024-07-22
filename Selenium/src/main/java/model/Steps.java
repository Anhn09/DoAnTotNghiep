package model;

public class Steps {
    public String resul;
    public String action;
    public String locatorType;
    public String locatorValue;
    public String dataInput;
    public String error;
    public String evidence;
    public TestCase testCase;

    public Steps(String resul, String action, String locatorType, String locatorValue, String dataInput, String error, String evidence, TestCase testCase) {
        this.resul = resul;
        this.action = action;
        this.locatorType = locatorType;
        this.locatorValue = locatorValue;
        this.dataInput = dataInput;
        this.error = error;
        this.evidence = evidence;
        this.testCase = testCase;
    }

    public Steps() {
    }

    public String getResul() {
        return resul;
    }

    public String getAction() {
        return action;
    }

    public String getLocatorType() {
        return locatorType;
    }

    public String getLocatorValue() {
        return locatorValue;
    }

    public String getDataInput() {
        return dataInput;
    }

    public String getError() {
        return error;
    }

    public String getEvidence() {
        return evidence;
    }

    public TestCase getTestCase() {
        return testCase;
    }
}
