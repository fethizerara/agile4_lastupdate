Feature: Présenter un auteur
  En tant que Employé
  Je veux presenter un auteur
  Afin de donner ses informations aux lecteurs

  Scenario Outline: Le nom de l'auteur et son nombre de ventes sont donnés
    Given Un auteur caracterisé par son box <box> et son nombre de ventes <nbVentes>
    When Un lecteur demande la présentation de l'auteur
    Then l'application renvoie <infoAuteur>

    Examples: 
      | nom    | nbVentes | infoAuteur               |
      | "Mich" |       50 | "Mich a vendu 50 livres" |
