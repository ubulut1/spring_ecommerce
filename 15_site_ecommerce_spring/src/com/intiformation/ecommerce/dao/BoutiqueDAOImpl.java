package com.intiformation.ecommerce.dao;

import java.util.List;

import com.intiformation.ecommerce.entity.Categorie;
import com.intiformation.ecommerce.entity.Client;
import com.intiformation.ecommerce.entity.Commande;
import com.intiformation.ecommerce.entity.Panier;
import com.intiformation.ecommerce.entity.Produit;
import com.intiformation.ecommerce.entity.Role;
import com.intiformation.ecommerce.entity.User;

public class BoutiqueDAOImpl implements IBoutiqueDao{

	@Override
	public Long ajouterCategorie(Categorie c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categorie> listCategorie() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorie getCategorie(Long idCategorie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerCategorie(Long idCategorie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierCategorie(Categorie c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long ajouterProduit(Produit p, Long idCategorie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> listProduit() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> produitParMotCle(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> produitParCategorie(Long idCategorie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> produitSelectionnes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit getProduit(Long idProduit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerProduit(Long idProduit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierProduit(Produit p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouterUser(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attribuerRole(Role r, Long idUser) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Commande enregistrerCommande(Panier pa, Client c) {
		// TODO Auto-generated method stub
		return null;
	}

}
