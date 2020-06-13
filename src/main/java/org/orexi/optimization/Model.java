/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.orexi.optimization;

/**
 *
 * @author Hakan Tek
 */
public class Model {

    public Model(double big_M) {
        this.big_M = big_M;
    }
    
    
    /* type of model */
    private Type type = null;

    public Type getType() {
        return type;
    }
    
    
    
    /* big m value */    
    public final double big_M;
    
    /* number of variable */
    private int variableCount = 0;
    
    public int getVariableCount() {
        return variableCount;
    }
    
    
    /* decision variable of model */
    public class Variable {
        
        /* generate variable */
        private Variable(VariableType type) {
            
            /* set column index */
            this.columnIndex = variableCount;
            
            variableCount++;
            
            
            /* set variable and data types */
            this.type = type;
            
            switch(type) {
                case Integer: case Binary:
                    break;
                case Decimal:
                    break;
                default:
            }
            
        }
        
        
        
        /* column index on simplex tableu */
        private final int columnIndex;
        
        /* data and variable types of variable */
        public final VariableType type;
        
    }
    
    
    /* model type */
    public enum Type {
        
        LinearProgramming,
        
        IntegerProgramming,
        
        MixedIntegerLinearProgramming,
        
    }
    
    /* variable types */
    public enum VariableType {

        Decimal,
        
        Integer,
        
        Binary;

    }   
    
    
    /* exception absed on setting model */
    public static class ModellingExceptions extends RuntimeException {
        
        public ModellingExceptions(String message) {
            super(message);
        }
    
    } 
    
}
