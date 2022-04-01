

(ns project1)

(def data-file (io/resource "Ejemplo.txt"))
(slurp data-file)