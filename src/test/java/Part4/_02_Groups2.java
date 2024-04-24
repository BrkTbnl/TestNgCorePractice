package Part4;
import org.testng.annotations.Test;

public class _02_Groups2 {

    @Test(groups = "Smoke")
    void test1(){
        System.out.println("test 1 from group 2 is running ");
    }

    @Test(groups = "Regression")
    void test2(){
        System.out.println("Test 2 from group 2 is running");
    }
}
