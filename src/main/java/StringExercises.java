public class StringExercises
{
    public static void main(String args[]) {
        String hello = "Hello";
    }

    public static String createString(StringCreationType sct)
    {
        if(sct.equals(StringCreationType.RETURN))
        {
            return "hello";
        }
        else if(sct.equals(StringCreationType.ASSIGN_RETURN))
        {
            String s = "hello";
            return s;
        }
        else if(sct.equals(StringCreationType.CREATE_ASSIGN_RETURN))
        {
            String s = new String("hello");
            return s;
        }
        else
            return null;
    }
}


