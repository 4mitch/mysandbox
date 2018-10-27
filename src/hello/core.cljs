(ns hello.core
  (:require [clojure.pprint :as pp]))   

(println "Hello world!")

;; ADDED
(defn average
  [a b]
  (/ (+ a b) 2.0))
  
