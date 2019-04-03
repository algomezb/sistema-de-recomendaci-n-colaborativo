/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaderecomendación;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author oscar
 */
public class SparseVector {

    private final int length;
    Map storage;

    public SparseVector(int length) {
        this.length = length;
        this.storage = new HashMap<Integer, Double>();
    }

    public double at(int key) {
        if (!this.storage.containsKey(key)) {
            return 0.0;
        }
        return (double) this.storage.get(key);
    }

    public int getLength() {
        return length;
    }
    
    public void add(int key, double value) {
        this.storage.put(key, value);
    }

}
