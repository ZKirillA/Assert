import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class RunTest {

    @BeforeEach
      public void beforeClass() {

        System.out.println("Before test");
    }

    @AfterEach
    public void afterClass() {
        System.out.println("After test");
    }

    @Test
    public void test1 () {
        System.out.println ("1й тест");
        Assertions.assertEquals("test", "test");
    }

    @Test
    public void test2 () {
        System.out.println ("2й тест");
        Assertions.assertEquals("test", "test2");
    }
    @Test
    public void test3 (){
        int a = 100;
        int b = 200;
        int sum = a + b;
        Assertions.assertTrue(sum==300);
    }
    @Test
    public void test4 () {
        int a = 100;
        int b = 200;
        int sum = a + b;
        Assertions.assertTrue(sum == 302);
    }

    @Test
    public void main() {
        open("https://demoqa.com/automation-practice-form");
    }
}