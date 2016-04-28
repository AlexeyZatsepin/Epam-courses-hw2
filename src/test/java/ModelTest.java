import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alex on 4/28/16.
 */
public class ModelTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGeneratorX(){
        System.out.println("Test generator X");
        Model model=new Model();
        int expectedResult=30;
        model.generateX(10,10,10);
        assertEquals(model.getX(),expectedResult);
    }

    @Test
    public void testAnswer(){
        System.out.println("test answer");
        Model model=new Model();
        int expectedResult=5;
        model.generateX(10,11,1);
        assertEquals(expectedResult,model.answer());

        model.generateX(25,1,1);
        assertEquals(expectedResult,model.answer());
    }

    @Test
    public void testAnswerWithZeroValues(){
        System.out.println("test answer zero values");
        Model model=new Model();
        int expectedResult=0;
        model.generateX(0,0,0);
        assertEquals(expectedResult,model.answer());
    }


}