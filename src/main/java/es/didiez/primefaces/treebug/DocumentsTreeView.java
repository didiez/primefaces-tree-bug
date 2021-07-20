package es.didiez.primefaces.treebug;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.primefaces.model.TreeNode;

/**
 *
 * @author didiez
 */
@Named("documentsTreeView")
@ViewScoped
public class DocumentsTreeView implements Serializable {
    
    public TreeNode getRoot(){
        // invoked by UITree.visitTree(..) when an <h:form> is found in the view :S
        throw new RuntimeException("Dummy exception!");
    }
    
}
