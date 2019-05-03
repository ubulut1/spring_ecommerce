package com.intiformation.ecommerce.dao;

import java.util.List;

import com.intiformation.ecommerce.entity.Categorie;
import com.intiformation.ecommerce.entity.Client;
import com.intiformation.ecommerce.entity.Commande;
import com.intiformation.ecommerce.entity.Panier;
import com.intiformation.ecommerce.entity.Produit;
import com.intiformation.ecommerce.entity.Role;
import com.intiformation.ecommerce.entity.User;

public interface IBoutiqueDao {

	public Long ajouterCategorie(Categorie c);

	public List<Categorie> listCategorie();

	public Categorie getCategorie(Long idCategorie);

	public void supprimerCategorie(Long idCategorie);

	public void modifierCategorie(Categorie c);

	public Long ajouterProduit(Produit p, Long idCategorie);

	public List<Produit> listProduit();

	public List<Produit> produitParMotCle(String mc);

	public List<Produit> produitParCategorie(Long idCategorie);

	public List<Produit> produitSelectionnes();

	public Produit getProduit(Long idProduit);

	public void supprimerProduit(Long idProduit);

	public void modifierProduit(Produit p);

	public void ajouterUser(User u);

	public void attribuerRole(Role r, Long idUser);

	public Commande enregistrerCommande(Panier pa, Client c);
}
