(ns project.Prueba
  (:require [clojure.string :as string]))

(def lista1 (slurp "resource/lista_naciones_unidas.txt"))
(def lista2 (slurp "resource/lista_ofac.txt"))
(def ejemp (slurp "resource/Ejemplo.txt"))

(defn first-replace [s] (string/split s #"a.k.a."))
(defn second-replace [s] ((string/replace s #"[\( \) \r \n ;]" " ")))

(->> ejemp
     first-replace
     (map string/trim)
     (map (fn [list] (string/replace list #"[\( \) \r \n ; ]" " ")))
     )





