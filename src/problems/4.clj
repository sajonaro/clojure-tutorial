(ns problems.4
    (:require [clojure.test :refer [deftest testing is]]))



(take 3 (str 123321))
(reverse (take-last 3 (str 123321)))

(defn palindrome? [n]
  (if (= (take 3 (str n)) 
         (reverse (take-last 3 (str n))))
      true
      false))

;;Find the largest palindrome made from
;; the product of two 3-digit numbers.
(def data (for [n (range 100 1000)
                m (range 100 1000)
                :when(palindrome? (* n m))]
            (* n m)))

(take 1 (reverse (sort data)))

((deftest palindrome-test
      (testing "Context of the test assertions"
        (is (palindrome? '(123 321))))))
