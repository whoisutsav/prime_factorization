(ns prime-factorization.core)

(defn prime-factor-of [n]
(loop [factor-candidate n factors '() divisor 2]
  (if (< factor-candidate 2)
    factors
    (if (zero? (mod factor-candidate divisor))
      (recur (/ factor-candidate divisor) (conj factors divisor) divisor)
      (recur factor-candidate factors (inc divisor))))
)
)

(defn mapassoc [mapping elem]
  (assoc mapping elem (inc (mapping elem 0))))

(defn prime-factor-hash [n]
  (reduce mapassoc (prime-factor-of n)))

(defn prime-factors [n]
  (loop [num-to-be-factored n factors '() divisor 2] 
    (if (< num-to-be-factored 2) 
    (sort factors)
    (if (zero? (mod num-to-be-factored divisor))
      (recur (/ num-to-be-factored divisor) (conj factors divisor) divisor)
      (recur num-to-be-factored factors (inc divisor))
     ))))
