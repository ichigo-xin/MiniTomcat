package test;

/**
 * @author : ichigo-xin
 * @date 2024/8/23
 */
public class TryCatchTest {

    public void error() {
        int a = 1 / 0;
    }

    public static void main(String[] args) {
        TryCatchTest test = new TryCatchTest();
        try {
            test.error();
        } catch (Exception e) {
            System.out.println("catch exception");
        }
        System.out.println("--------------");
    }
}
