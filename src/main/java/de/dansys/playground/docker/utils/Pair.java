/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.dansys.playground.docker.utils;

import java.io.Serializable;

/**
 *
 * @author dansys gmbh
 */
public class Pair implements Serializable
{
    private String first;
    private String second;

    /**
     * @return the first
     */
    public String getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(String first) {
        this.first = first;
    }

    /**
     * @return the second
     */
    public String getSecond() {
        return second;
    }

    /**
     * @param second the second to set
     */
    public void setSecond(String second) {
        this.second = second;
    }
    
    
}
