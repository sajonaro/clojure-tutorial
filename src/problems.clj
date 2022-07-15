(ns problems
  (:require [functions :refer [fib]]))

;; If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
;; Find the sum of all the multiples of 3 or 5 below 1000.

(def data (for [n (range 1000)
                :when (or
                       (= 0 (mod n 3))
                       (= 0 (mod n 5)))]
            n))

(reduce #(+ %1 %2) data)


;;By considering the terms in the Fibonacci sequence 
;;whose values do not exceed four million, 
;;find the sum of the even-valued terms.

;;TODO check why this doesnt work
;;(defn fibseq [num]
 ;;   (loop [n 1 r []]
 ;;     (if (>= n num) r
  ;;      (recur (inc n) (cons r (fib n))))


(defn fibseq [num]
  (reduce #(conj %1 (fib %2)) () (range 1 (inc num))))

(->> (fibseq 40)
     (filter #(< % 4000000))
     (filter #(= 0 (mod % 2)))
     (reduce #(+ %1 %2) 0))







(conj () 1)