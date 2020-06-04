Feature: Augmenter la capacité du Box
  En tant que proprétaire de l'installation 
  Je veux augmenter la capacité des chevaux que je peux prendre 
  Afin d'avoir de nombreux chevaux soit plus de choix

  Scenario Outline: il faut donner le box en question
    Given Un box a traiter <box> et une nouvelle capacite <capacity>
    When la capacite <capacity> est superieur à la capacité actuelle
    Then augmenter la capacité du box <box> par la capacité <capacity>

    Examples: 
      | box    | capacity |
      | "box1" |       10 |
      | "box1" |       20 |
	