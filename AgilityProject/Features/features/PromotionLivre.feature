Feature: Promotion d'un livre
  En tant que Auteur
  Je veux faire une promotion sur le livre
  Afin de réduire le prix d'un livre pour mieux le vendre

  Scenario Outline: calcul du nouveau prix du livre
    Given un livre et sa promotion <promotion>
    When L'auteur veut faire une promotion
    Then le <nouveauPrix> doit être calculé

    Examples: 
      | promotion |
      | 0.5       |

  Scenario Outline: refus de promotion négatif
    Given un livre et sa promotion <promotion> négatif
    When L'auteur veut faire une promotion
    Then le syustème refuse avec le <messageErreur>

    Examples: 
      | promotion | messageErreur  |
      | -0.1      | "prix négatif" |
