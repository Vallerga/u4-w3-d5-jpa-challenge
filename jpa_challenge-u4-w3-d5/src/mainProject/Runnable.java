package mainProject;

import javax.persistence.EntityManager;

import utils.JpaUtil;

public class Runnable {
	
	static EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
	
	public static void main(String[] args) {
		
	}

}
