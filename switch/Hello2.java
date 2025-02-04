// new switch with out break
public class Hello2
{
    public static void main(String[] args)
    {
        String code = "tuesday";
        switch (code) 
        {
            case "Saturday" , "Sunday"->
                System.out.println("set a alarm at 6.00");
            case "Monday"->
                System.out.println("set a alarm at 7.00");
            default ->
                System.out.println("set a alarm at 8.00");               
        }
    }
}
