(ns problems.7
  (:require [problems.3 :refer :all]))

;;What is the 10 001st prime number?

(def seqq (filter problems.3/prime? (range 1 10000000)))

(nth seqq 10000)