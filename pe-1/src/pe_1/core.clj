(ns pe-1.core
  (:gen-class))

(defn divisible-by-3-or-5? [x]
  "Check if x is divisible by 3 or 5"
  (if (or (= (mod x 3) 0) (= (mod x 5) 0)) true false))

(defn sum [seq]
  "Sum up all values in seq"
  (reduce + 0 seq))

(defn -main
  "Project Euler Problem 1"
  [& args]
  (print "The sum of all numbers divisible by 3 or 5 below 1000 is: ")
  (println (sum (filter divisible-by-3-or-5? (range 1 1000)))))
