package se.lexicon.sindre;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    //arrange, sätta upp tester
    //Act, anropa metoden som ska testas
    //Assert. Junit testar om resultatet av metodanropet, public void inte statisk.
    @Test
    public void test_Sub(){
        //arrange
        double source = 4;
        double source2 = 2;
        double expected = 2;
        //act
        double actual = App.Sub(source, source2);
        //assert
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void test_Add(){
        double source = 1;
        double source2 = 2;
        double expected = 3;
        double actual = App.Add(source, source2);
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void test_Div(){
        double source = 5;
        double source1 = 2;
        double expected = 2.5;
        double actual = App.Div(source, source1);
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void test_Mul(){
        double source = 5;
        double source1 = 5;
        double expected = 25;
        double actual = App.Mul(source, source1);
        Assert.assertEquals(expected, actual, 0);
    }
}
