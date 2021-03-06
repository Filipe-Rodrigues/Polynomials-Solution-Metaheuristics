/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ag.main;

import ag.core.GeneticAlgorithm;
import ag.core.ObjectiveFunction;
import ag.core.PolynomialFunction;
import ag.gui.ApplicationDisplay;
import ag.utils.ThreadUtils;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author filipe
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PolynomialFunction of = new PolynomialFunction("x^6+8x^5+13x^4-12x^3-2x^2+9x-3");
        System.err.println(of.getUnicodeEquation());
        testProgram();
        testAllFonts();
    }

    private static void testProgram() {
        //GeneticAlgorithm ag = new GeneticAlgorithm(30, 8, 3, 21f, 0f, 4, 0.01f, 0.7f, "x^2-3x+4", true);
        //GeneticAlgorithm ag = new GeneticAlgorithm(30, 8, 3, 5f, -0.75f, 4, 0.01f, 0.7f, "x^3+3x^2-x-4", false);
        GeneticAlgorithm ag = new GeneticAlgorithm(30, 12, 8, 5.3f, -2.15f, 4, 0.01f, 0.7f, "x^6+8x^5+13x^4-12x^3-2x^2+9x-3", true);
        ApplicationDisplay appDisplay = new ApplicationDisplay("Monospaced", ag);
        //ag.evolve(10);
        appDisplay.start();
    }

    private static void testAllFonts() {
        String fonts[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for (int i = 0; i < fonts.length; i++) {
            System.out.println(fonts[i]);
        }
    }

}
