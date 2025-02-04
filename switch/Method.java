public class Method
{
    public static void main (String[] args)
    {
        String day = "monday";
        String result = "result";

        switch (day)
        {
            case "sunday", "saturday" -> result = "set a alarm on 9am";
            case "monday" -> result = "set a alarm on 6am";
            default -> result = "set a alarm on 7 am";
        }
        System.out.println(result);
    }
}

//2nd method
public class Method
{
    public static void main (String[] args)
    {
        String day = "monday";
        String result = "result";

        result = switch (day)
        {
            case "sunday", "saturday" -> "set a alarm on 9am";
            case "monday" -> "set a alarm on 6am";
            default -> "set a alarm on 7 am";
        };
        System.out.println(result);
    }
}

// yield term is used to replace break term 
//2nd method
public class Method
{
    public static void main (String[] args)
    {
        String day = "monday";
        String result = "result";

        result = switch (day)
        {
            case "sunday", "saturday" : yield "set a alarm on 9am";
            case "monday" : yield "set a alarm on 6am";
            default : yield "set a alarm on 7 am";
        };
        System.out.println(result);
    }
}