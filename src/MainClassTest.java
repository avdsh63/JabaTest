import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetLocalNumber (){

        if (MainClass.getLocalNumber() == 14) {
            System.out.println("getLocalNumber works correctly");
        }
        else {
            System.out.println("getLocalNumber is not working correctly");
        }

    }
}
