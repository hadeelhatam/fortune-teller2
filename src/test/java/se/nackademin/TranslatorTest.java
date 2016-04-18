/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alhasan
 */
public class TranslatorTest {
    
        

    /**
     * Test of getNoun method, of class Translator.
     */
    @Test
    public void testGetNoun() {
        Translator instance = new Translator();
        String expResult = "en lönehöjning";
        String result = instance.getNoun(0);
        assertEquals(" result för 0 position är en lönehöjning", expResult, result);
              
    }

    /**
     * Test of getVerb method, of class Translator.
     */
    @Test
    public void testGetVerb() {
        Translator instance = new Translator();
        String expResult = "springa";
        String result = instance.getVerb(0);
        assertEquals("result för 0 position är springa", expResult, result);
    }

    /**
     * Test of getAdjective method, of class Translator.
     */
    @Test
    public void testGetAdjective() {
        Translator instance = new Translator();
        String expResult = "stor";
        String result = instance.getAdjective(0);
        assertEquals("result för 0 position är stor", expResult, result);
    }
    
}
