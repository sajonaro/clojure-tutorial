(ns problems.5
  (:require [clojure.test :refer [deftest testing is]]))

;;What is the smallest positive number
;; that is evenly divisible by all
;; of the numbers from 1 to 20?

(defn devisible-by-1-to-20? [n]
  (loop [i 21]
    (if (= i 1) true
        (if (not= 0 (mod n i)) false
            (recur (dec i))))))
        


(for [n (range 2000 1000000000)
      :when (devisible-by-1-to-20? n)]
  n)
