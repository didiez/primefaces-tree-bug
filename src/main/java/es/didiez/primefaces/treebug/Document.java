package es.didiez.primefaces.treebug;

import java.io.Serializable;

/**
 *
 * @author didiez
 */
public class Document implements Serializable {
    private String name;

    public Document(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}
