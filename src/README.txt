CHIKHAOUI Anass, numéro étudiant : 22612344
BELABBAS Ghiles, numéro étudiant : 22609982

Rendu 1 du fil rouge : partie 1 (jeu de Nim) et partie 2 (jeu du morpion).

Organisation du code
  games/nim/Nim.java              classe du jeu de Nim
  games/nim/Demo.java             classe exécutable : partie de Nim à deux joueurs
  games/tictactoe/TicTacToe.java  classe du jeu du morpion
  games/tictactoe/Demo.java       classe exécutable : partie de morpion à deux joueurs

Compilation (depuis la racine de l'archive, là où se trouve ce fichier)
  mkdir build
  javac -d build $(find games -name "*.java")

Exécution
  java -cp build games.nim.Demo
  java -cp build games.tictactoe.Demo

Remarques
  - Au morpion, le joueur 1 joue X, le joueur 2 joue O ; les deux noms doivent être différents.
  - Une méthode wins (indication de l'exercice 2.5) est définie dans TicTacToe.

Parties non traitées
  - Partie 3 (morpion avec indices, exercice optionnel) : non traitée.
