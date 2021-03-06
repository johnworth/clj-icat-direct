(defproject org.cyverse/clj-icat-direct "2.8.1-SNAPSHOT"
  :description "A Clojure library for accessing the iRODS ICAT database directly."
  :url "https://github.com/cyverse-de/clj-icat-direct"
  :license {:name "BSD Standard License"
            :url "http://www.iplantcollaborative.org/sites/default/files/iPLANT-LICENSE.txt"}
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.mchange/c3p0 "0.9.5.1"]
                 [korma "0.4.2"
                  :exclusions [c3p0]]
                 [org.postgresql/postgresql "9.2-1002-jdbc4"]])
