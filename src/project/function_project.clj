(ns project.function-project
  (:require [clojure.string :as string]))

(defn delete_characters [s] (string/split s # "a.k.a"))