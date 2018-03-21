(defproject jepsen.fauna "0.1.0-SNAPSHOT"
  :description "A Jepsen test for FaunaDB"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main jepsen.fauna
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [clj-yaml "0.4.0"]
                 [jepsen "0.1.8"]
                 [com.faunadb/faunadb-java "1.2.0"]
                 [com.faunadb/faunadb-java-dsl "1.2.0"]])
