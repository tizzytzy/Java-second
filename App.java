import java.util.ArrayList;

/**
 * Hello world!
 *
 */
<<<<<<< HEAD
public class App {
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
=======
public class App
{
    public static void main( String[] args ) {
        System.out.println("Hello World!");

        ArrayList<String> a = new ArrayList();
        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");
        a.add("5");


        String value = null;
        try {
           value = a.get(5);
           System.out.println(value.equals("5"));

        }catch ( IndexOutOfBoundsException e){

            e.printStackTrace();
        }catch (NullPointerException e){

            e.printStackTrace();
        }finally {

        }

        System.out.println("第五个数的值是：" + value);

>>>>>>> dcb4341f9448bd644926b180d88dfec8d0d8cb0b
    }

}
