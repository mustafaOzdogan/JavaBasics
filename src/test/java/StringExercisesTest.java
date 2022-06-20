import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class StringExercisesTest
{
    @Test
    public void testInitializedString_0()
    {
        String s1 = "hello";
        String s2 = "hello";

        Assertions.assertTrue(s1 == s2);

        Assertions.assertSame(s1, s2);
        Assertions.assertEquals(s1, s2);

        Assertions.assertEquals(s1.hashCode(),  s2.hashCode());
    }

    @Test
    public void testInitializedString_1()
    {
        String s1 = "hello";

        String s2 = StringExercises.createString(StringCreationType.RETURN);

        Assertions.assertTrue(s1 == s2);

        Assertions.assertSame(s1, s2);
        Assertions.assertEquals(s1, s2);

        Assertions.assertEquals(s1.hashCode(),  s2.hashCode());
    }

    @Test
    public void testInitializedString_2()
    {
        String s1 = "hello";

        String s2 = StringExercises.createString(StringCreationType.ASSIGN_RETURN);

        Assertions.assertTrue(s1 == s2);

        Assertions.assertSame(s1, s2);
        Assertions.assertEquals(s1, s2);

        Assertions.assertEquals(s1.hashCode(),  s2.hashCode());
    }

    @Test
    public void testInitializedString_3()
    {
        String s1 = "hello";

        String s2 = StringExercises.createString(StringCreationType.CREATE_ASSIGN_RETURN);

        Assertions.assertFalse(s1 == s2);

        Assertions.assertNotSame(s1, s2);
        Assertions.assertEquals(s1, s2);

        Assertions.assertEquals(s1.hashCode(),  s2.hashCode());
    }
}
