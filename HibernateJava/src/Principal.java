
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory fab = Persistence.createEntityManagerFactory("trabalho05");
        EntityManager gerente = fab.createEntityManager();
        
        Usuario u = new Usuario("Alex");
        
        
        gerente.getTransaction().begin();
        gerente.persist(u);
        gerente.getTransaction().commit();
        
    }
    
}
