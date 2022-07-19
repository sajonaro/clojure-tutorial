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
(def nn 600851475143)

(def rex (loop [i  2]
           (if (= (mod nn i) 0) i
               (recur (inc i)))))



(defn largest-prime [nn divider]
  (loop [i (/ nn divider)]
    (if (or
         (= i 3)
         (and
          (= (mod nn i) 0)
          (prime? i))) i
        (recur (dec (dec i))))))

;;600851475143(largest-prime 600851475143 71)