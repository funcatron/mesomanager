(ns mesosmanager.core
  (:import (com.mesosphere.mesos.rx.java MesosClientBuilder)
           (java.net URI)))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(->
  (MesosClientBuilder/newBuilder)
  (.mesosUri (URI. "http://localhost:5050"))
  .build
  )