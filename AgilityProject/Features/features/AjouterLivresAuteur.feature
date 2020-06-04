Feature: Ajouter des livres d'un auteur
  En tant que Employé
  Je veux ajouter les livres d'un auteur
  Afin d'ajouter et afficher les livres d'un auteur

  Scenario Outline: Les livres de l'auteur sont affichés
    Given Un auteur
    And un livre <titre1> et son <prixVente1>
    And un livre <titre2> et son <prixVente2>
    When l employé ajoute des livres d'un auteur
    Then l application renvoie les <infoLivres>

    Examples: 
      | titre1        | prixVente1 | titre2       | prixVente2 | infoLivres |
      | "Livre Agile" | 15.0       | "Livre Java" | 10.0       | "Les livres de Laye sont : Livre Agile,Livre Java"    |
