package com.stock.mvc.dao;

import java.util.List;

import com.stock.mvc.entities.LigneCommandeClient;
import com.stock.mvc.entities.LigneCommandeFournisseur;

public interface ILigneCommandeClientDao extends IGenericDao<LigneCommandeClient> {
	
	public List<LigneCommandeFournisseur> getByIdCommande(Long idCommandeClient);

}
