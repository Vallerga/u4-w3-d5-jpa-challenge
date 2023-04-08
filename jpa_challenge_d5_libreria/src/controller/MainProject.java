package controller;

import javax.persistence.EntityManager;

import utils.JpaUtil;

public class MainProject {
	static EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
	
	public static void main(String[]args) {
		System.out.println("sono dentro il main");
	}
}
