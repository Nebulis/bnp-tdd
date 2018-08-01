Statement: Potter Kata
Once upon a time there was a series of 5 books about a very British hero named Harry. 
(At least when this Kata was invented, there were only 5. Since then they have multiplied) 
Children all over the world thought he was fantastic, and, of course, so did the publisher. 
So in a gesture of immense generosity to mankind, (and to increase sales) 
they set up the following pricing model to take advantage of Harry's magical powers.

One copy of any of the five books costs 8 EUR. 
If, however, you buy two different books from the series, you get a 5% discount on those two books. 
If you buy 3 different books, you get a 10% discount. With 4 different books, you get a 20% discount. 
If you go the whole hog, and buy all 5, you get a huge 25% discount.

Note that if you buy, say, four books, of which 3 are different titles, 
you get a 10% discount on the 3 that form part of a set, but the fourth book still costs 8 EUR.
Potter mania is sweeping the country and parents of teenagers everywhere are queuing up with shopping baskets overflowing with Potter books. 
Your mission is to write a piece of code to calculate the price of any conceivable shopping basket, giving as big a discount as possible.

- Rules
The following rules can be extracted from the text :

- A book cost 8 EUR
- Multiple books may be bought to get a discount:
 - Buying 1 book gives no discount
 - Buying 2 different books gives a 5% discount
 - Buying 3 different books gives a 10% discount
 - Buying 4 different books gives a 20% discount
 - Buying 5 different books gives a 25% discount


* Optimisation : While buying multiple books, and to have the best discount, books are aggregated by groups in order to apply the appropriated discount.
  - Note :
  Aggregate by different book.
   For instance : Buying 2 x book 1, 2 x book 2, 2 x book 3, 1 x book 4 et 1 x book 5 give two group : 
   [ 1, 2, 3, 4, 5 ] et [ 1, 2, 3 ].
