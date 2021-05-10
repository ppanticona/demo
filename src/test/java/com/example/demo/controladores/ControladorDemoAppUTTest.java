package com.example.demo.controladores;

import com.example.demo.Controlador;
import org.junit.*;

public class ControladorDemoAppUTTest {

    public ControladorDemoAppUTTest(){

    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }


    @Test
    public void testSaludar() {
        System.out.println("saludar");
        Integer sum01 = 10;
        Integer sum02 = 20;
        Controlador instance = new Controlador();
        Assert.assertNotNull(instance.saludar(sum01, sum02));
        Assert.assertEquals(30, Integer.parseInt(String.valueOf(instance.saludar(sum01, sum02).get("resultado"))));
    }



}
