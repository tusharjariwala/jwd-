/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package sessionBean;

import demp.Countemploye;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Tushar Jariwala
 */
@Local
public interface CountEmpLocal {
     public String insert(Countemploye employe);
    public List<Countemploye> showall();
}
