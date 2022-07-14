(ns reducers
  (:require [clojure.test :refer [deftest testing is]])
  (:require [utils :refer [logger]]))

(def data (vec (range 10)))

;; eager implementation of
;; mapping function via reduce function
(defn -map [f coll]
  (reduce
   #(conj %1 (f %2)) [] coll))

(deftest name-test
  (testing "Context of the test assertions"
    (is (= (-map inc data) [1 2 3 4 5 6 7 8 9 10]))))

;;eager filter implementation via reduce
(defn -filter [pred coll]
  (reduce
   #(if (pred %2)
      (conj %1 %2)
      %1) [] coll))


(deftest thread-last-usage-test
    (is (= (->> data
                (reduce #(+ %1 %2)))
           (reduce #(+ %1 %2) data))))








