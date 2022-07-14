(ns functions
  (:require [clojure.test :refer [deftest testing is]]))

;;recur
(defn mapset
  [f coll]
  "acts similar to map, except it returns sorted set as result"
  (reduce #(conj %1 (f %2)) (sorted-set) coll))

(deftest mapset-test
  (testing "(mapset inc [1 1 2 2]) => #{2 3}")
  (is (= (mapset inc [1 1 2 2]) #{2 3})))


;;will run out of memory with relatively small numbers
(defn factorial1 [n]
  (if (= n 0)
    1
    (* n (factorial1 (dec n)))))

;; use tail recursion optimization
;; *' function converts operands to bigint or decimal
(defn factorial2 [n]
  (if (zero? n) 1
      (loop [val n i n]
        (if (<= i 1) val
            (recur (*' val (dec i)) (dec i))))))


;; return sum of numbers from 
;; 0 to N
(defn sum [n]
  (loop [sum 0 i 0]
    (if (> i n)
      sum
      (recur (+ sum i) (inc i)))))

;; prints N-th fibonacci number
;; F(n) = F(n-1) + F(n-2)
;; 1 2 3 5 8 13
;; 1 2 3 4 5 6
(defn fib [n]
  (if (= n 1) 1
      (loop [f1 0 f2 1 i 0]
        (if (>= i n) f2
            (recur f2 (+ f1 f2) (inc i))))))




(deftest test-fibonacci
  (is (= 13 (fib 6))))

(deftest test2
  (is (= 21 (sum 6))))

(deftest test-loop-sum
  (is (= 21 (sum 6))))

(deftest test-factorial-tailrecursive
  (is (= 720 (factorial2 6))))

(deftest test-factorial
  (is (= 720 (factorial1 6))))

; (List comprehension)
; Calls the macro `for'



