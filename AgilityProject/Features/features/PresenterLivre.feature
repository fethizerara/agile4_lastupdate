Feature: Presenter un Livre
  En tant que Employé
  Je veux presenter un livre
  Afin de faciliter son utilisation par les lecteurs

  Scenario Outline: Un livre est caractérisé par un Titre et un prix
    Given Un livre caracterisé par son titre <titre> son prix <prixVente>
    When Le lecteur lui demande de lui montrer le livre
    Then l'application renvoie <infoLivre> du livre demandé

    Examples: 
      | titre     | prixVente | infoLivre                     |
      | "mister1" | 15.0      | "Le livre mister1 coûte 15.0" |
