package fr.eftl.agence_voyage.test;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import fr.eftl.agence_voyage.CalculPrixBillet;
import fr.eftl.agence_voyage.CalculPrixUnitaire;


public class TestCalculPrixBillet {

	
	@Test
	public void PrixBilletClasseEco() {
		CalculPrixBillet prixBillet = new CalculPrixBillet();
		// CalculPrixUnitaire calculPrixUnitaire = new CalculPrixUnitaire();
		CalculPrixUnitaire calculPrixUnitaire = Mockito.mock(CalculPrixUnitaire.class);
		Mockito.when(calculPrixUnitaire.generer()).thenReturn(200);
		
		
		prixBillet.setCalculPrixUnitaire(calculPrixUnitaire);
		
		Integer prixObtenu = prixBillet.calculer("Paris", "Londres", "eco");
		Assert.assertEquals(200, prixObtenu,0);
		
		
	}
}
