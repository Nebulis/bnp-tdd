# Kata Tennis

## Rules

Implement tennis scoring system.

| Points won   |   Real points  |
|--------------|---------------:|
| 0            | 0              |
| 1            | 15             |
| 2            | 30             |
| 3            | 40             |
| 4            | Game won       |

- If both players score at least 3 points, 
  - the first one to score two more points than the other win the game.
  - If one has more point, he has *advantage*.
  - If they have won same number of point, the score is *deuce*.

## Exercise

Write an implementation to compute tennis score. The score must be a `String`.

The score must follow the rules :

- Use `X - Y` format where X is the score of first player and Y of the second player.
- If *deuce*, return `DEUCE`.
- If *advantage*, return `AV` for the player with advantage and `40` for the other.
- When the game is won, return `GAME !`.

## Going further

- return `15A`, `30A` ou `40A` before they have both won more than 3 points.
- return `love` instead of `0` (ie. `15 - love`).
