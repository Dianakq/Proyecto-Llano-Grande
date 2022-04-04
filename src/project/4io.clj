(ns dataico.release

  (:require [clojure.string :as string]))

(def yorman "hola")
(def yorman :yorman)
(def texto "Hola como estas. XXX hola soy abada. XXX abada2. XXX abad3
asdflkajsdflkj abad2
adflkasjdlfkja abd3")


(string/upper-case texto)
(str "a" "b")
(str (string/upper-case texto) "XXX abad4")
(-> texto string/upper-case (str "XXX abad4"))
(+ 1 1)
(defn divide [x y] (/ y x))
(-> 1 (+ 1) (+ 4) (* 5) (divide 2))

(string/split texto #"XXX")

(count (string/split texto #"XXX"))
(-> texto (string/split #"XXX") (count))
(-> texto (string/split #"XXX") count)
(-> texto (string/split #"XXX"))

(map #(+ 2 %) [1 2 3])
(->> [1 2 3]
     (map #(+ 2 %))
     (filter #(<= 4 %)))
(->> [1 2 3]
     (map (fn [x] (+ x 2)))
     (filter (fn [x] (<= 4 x))))

(<= (count "XXX") 5)

(->> (string/split texto #"XXX")
     (filter #(<= 10 (count %)))
     (map string/upper-case)
     (map count)
     ;(reduce + 0)
     )

(defn dividir-newlines [s] (string/split s #"\n"))
(defn string-mayor10 [s] (<= 10 (count s)))

(->> (string/split texto #"XXX")
     (filter string-mayor10)
     (map string/upper-case)
     (mapcat dividir-newlines)
     (map count))

(->> (string/split texto #"XXX")
     (filter string-mayor10)
     (map (comp inc count string/upper-case))
     ;(map (fn [x] (-> x string/upper-case count)))
     #_(map count))

(defn resta-uno [x] (- x 1))
(defn suma-uno [x] (+ 1 x))
((comp resta-uno suma-uno) 2)

(->>
  (repeat 10000 "AAA")
  (take 10)
  )

'sarlaft-terminado                                          ; Vector de resultados
(map string/trim 'sarlaft-terminado)

(string/trim " ABDULAAH      ")



; map(lambda x: x + 2, [ 1 2 3])
;[e + 1 for e in [1 2 3] ]
;[e + 2 for e in [1 2 3] ]
;[e * 2 for e in [1 2 3] ]

; collection functions
; map
; filter
;[e for e in texto if len(e) > 10]







