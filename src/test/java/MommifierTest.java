import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {
    @Test
    public  void should_return_the_origin_string(){
        Mommifier mommifier = new Mommifier();
        String result = mommifier.convert("1234");
        assertEquals("1234",result);
    }

    @Test
    public  void should_return_the_new_string(){
        Mommifier mommifier = new Mommifier();
        String result = mommifier.convert("eaa34");
        assertEquals("e妈妈aa34",result);
    }


    @Test
    public  void should_return_the_new_string_2(){
        Mommifier mommifier = new Mommifier();
        String result = mommifier.convert("a3e42ee");
        assertEquals("a3e42妈妈ee",result);
    }

}
