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

    public void testGetClassNumber(){
        if (this.getClassNumber() > 45) {
            System.out.println("number is greater than 45");
        }
        else {
            System.out.println("number less than or equal to 45");
        }
    }
}
