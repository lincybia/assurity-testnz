package test;

import org.testng.annotations.BeforeClass;
import steps.CategoryBaseStep;
import steps.CategoryStep;

public class CategoryBaseTest {

    protected CategoryStep categoryStep = new CategoryStep();

    @BeforeClass
    public void setup() {

        CategoryBaseStep.setRequestSpec();
    }
}
