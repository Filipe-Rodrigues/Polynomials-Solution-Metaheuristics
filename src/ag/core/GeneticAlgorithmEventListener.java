/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ag.core;

import java.util.EventListener;

/**
 *
 * @author filip
 */
public interface GeneticAlgorithmEventListener extends EventListener {

    public void generationEvolved(GeneticAlgorithmStats stats);
}
