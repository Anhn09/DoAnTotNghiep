package model;

import java.util.List;

public class TestCase {
    public int idTestCase;
    public List<Steps> steps;

    public TestCase(int idTestCase, List<Steps> steps) {
        this.idTestCase = idTestCase;
        this.steps = steps;
    }

    public TestCase() {
    }

    public int getIdTestCase() {
        return idTestCase;
    }

    public List<Steps> getSteps() {
        return steps;
    }

    public void setIdTestCase(int idTestCase) {
        this.idTestCase = idTestCase;
    }

    public void setSteps(List<Steps> steps) {
        this.steps = steps;
    }

}
