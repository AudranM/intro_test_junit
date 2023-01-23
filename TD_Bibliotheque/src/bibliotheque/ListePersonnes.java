package bibliotheque;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;


/**
 *
 * @author lucas
 */
public class ListePersonnes{

  private List<Personne> registre;

  public ListePersonnes(){
      registre = new ArrayList();
  }

public void ajouter(Personne p){
      registre.add(p);
  }

public boolean personneAppartient(Personne p){
      return registre.contains(p);
  }

public boolean nomPrenomAppartient(String nom, String prenom){
      return false;
  }
}
