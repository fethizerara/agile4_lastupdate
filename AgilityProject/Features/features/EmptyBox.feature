Feature: 
	En tant que responsable de Box
	Je veux faire sortir tout les chevaux
	Afin de les préparer pour la coruse

  Scenario Outline: Empty the box  
  Given User wants to empty the box <box>
  When  The box  <box> is not empty  
  Then  Empty the box <box> 
  
  Examples: 
  
  |	Box		 | Feedback									    |
  |	"box1" |	"Le box vient d'être vidé"	|



