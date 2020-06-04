Feature: 
	En tant que Parieur
	Je veux prendre le plus petit cheval
	Afin d'avoir plus de chance de gagner 
	
  Scenario Outline: Take the yougest horse from the box 
  Given User wants to take the yougest horse from the box <box>
  When  the box  <box> is filled
  Then  get the yougest hourse <cheval>


    Examples: 

  |	Box		 |   cheval		|
  |	"box1" |	"cheval3"	|

