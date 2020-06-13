/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.orexi.optimization;

/**
 *
 * @author Hakan Tek
 * @author Gülşah Aslı Arslan
 */
public interface Solver {
    
    /* solver capability */
    public boolean canSolve(Model.Type type);
    
    /* optimize the tableau */
    public void optimize(Tableau tableau) throws SolverException;
        
    
    /* exception based on solver */
    public static class SolverException extends  RuntimeException {

        public SolverException() {
            super();
        }
        
        public SolverException(String message) {
            super(message);
        }
        
        public SolverException(Throwable cause) {
            super(cause);
        }
        
        public SolverException(String message, Throwable cause) {
            super(message, cause);
        }
        
    }
    
    /* default solver */
    public static final Solver SIMPLEX = new Solver() {
        @Override
        public boolean canSolve(Model.Type type) {
            return false;
        }

        @Override
        public void optimize(Tableau tableau) throws SolverException {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    
    public static final Solver BRANCH_AND_BOUND = new Solver() {
        @Override
        public boolean canSolve(Model.Type type) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void optimize(Tableau tableau) throws SolverException {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
}
