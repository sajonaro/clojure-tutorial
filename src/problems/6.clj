(ns problems.6)


;;Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
(def sumsquares (reduce + (map #(* % %) (range 1 101))))

(def sumofhundred (reduce + (range 1 101)))

(def squareofsum ( * sumofhundred sumofhundred))

(def difff ( - squareofsum sumsquares))
