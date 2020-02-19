(ns clojure-fizzbuzz.core)

(defn fizz-buzz-helper [max current] 
  (do
	  (if (and (= 0 (mod current 3)) (= 0 (mod current 5)))
		    (println "FizzBuzz!")
		    (if (= 0 (mod current 3))
	        (println "Fizz")
	        (if (= 0 (mod current 5)) (println "Buzz") (println current))
		    )
		)
	  (if (= max current) 
	    (println "Job's done!") 
	    (recur max (+ current 1))
    )
   )
  ) 

(defn fizz-buzz [max] (fizz-buzz-helper max 1))

(defn main [] (fizz-buzz 100))
