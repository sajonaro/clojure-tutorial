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


(defn fibseq [nn]
  (sort (reduce #(conj %1 (fib %2)) () (range 1 (inc nn)))))

(->> (fibseq 40)
     (filter #(< % 4000000))
     (filter #(= 0 (mod % 2)))
     (reduce #(+ %1 %2) 0))

;; What is the index of the first term in 
;; the Fibonacci 
;; sequence to contain 1000 digits?

(defn has1000digits? [num]
  (= 1000 (count (str num))))



(defn prime? [n]
  (loop [i 2]
    (cond
      (= i n) true
      (and
       (= 0 (mod n i))
       (not= i n)) false
      :else (recur (inc i)))))


(prime? 17)
    
  
    
  
