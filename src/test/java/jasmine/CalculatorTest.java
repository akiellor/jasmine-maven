package jasmine;

import jasmine.junit.JasmineSuite;
import jasmine.junit.JasmineTestRunner;
import org.junit.runner.RunWith;

@RunWith(JasmineTestRunner.class)
@JasmineSuite(specs = "jasmine/calculatorSpec.js")
public class CalculatorTest {
}
