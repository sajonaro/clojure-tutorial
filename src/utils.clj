(ns utils)

(defn logger [f]
  (fn [& args]
    (prn args)
    (apply f args)))
  
