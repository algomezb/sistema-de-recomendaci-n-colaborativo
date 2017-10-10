/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaderecomendación;

import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author oscar
 */
public class SparseMatrix {

    private final int rows;
    private final int cols;
    private final Map<Map.Entry<Integer, Integer>, Double> storage;

    public SparseMatrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.storage = new HashMap();
    }

    public double at(int row, int col) {
        Map.Entry<Integer, Integer> key = new SimpleEntry<>(row, col);
        if (this.storage.containsKey(key)) {
            return (double) this.storage.get(key);
        }
        return 0.0;
    }

    public void add(int row, int col, double value) {
        Map.Entry<Integer, Integer> key = new SimpleEntry<>(row, col);
        this.storage.put(key, value);
    }
    
    public SparseVector getRow(int row) {
        SparseVector result = new SparseVector(this.cols);
        for(Map.Entry<Map.Entry<Integer, Integer>, Double> entry : this.storage.entrySet()) {
            if (entry.getKey().getKey() == row) {
                result.add(entry.getKey().getValue(), entry.getValue());
            }
        }
        return result;
    }
}
