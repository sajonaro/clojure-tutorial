(ns problems.3
  (:require [clojure.test :refer [deftest testing is]]))

(defn prime? [n]
  (loop [i 2]
    (cond
      (= i n) true
      (and
       (= 0 (mod n i))
       (not= i n)) false
      :else (recur (inc i)))))



(deftest name-test
  (testing "Context of the test assertions"
    (is (prime? 17))))


;;600851475143

(def rex (loop [i  2]
           (if (= (mod nn i) 0) i
               (recur (inc i)))))



(defn largest-prime [nn divider]
  (loop [i (/ nn divider)]
    (if (or(def rex (loop [i  2]
                      (if (= (mod nn i) 0) i
                          (recur (inc i)))))
         (= i 3)
         (and
          (= (mod nn i) 0)
          (prime? i))) i
        (recur (dec (dec i))))))

(largest-prime 600851475143 71)







(def xf
  (comp
    #(if (= 0 (mod nn %2)) (conj %1 %2) %1)
     (take 5)
     (filter prime?)))




(def seqq (take-last 10 (range (dec (unchecked-divide-int nn 3)) (dec (unchecked-divide-int nn 2)))))

(transduce xf #(conj %1 %2) [] seqq)