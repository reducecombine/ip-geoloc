(defproject com.brunobonacci/ip-geoloc "0.2.0-SNAPSHOT"
  :description "A fully automated Clojure library for IP GeoLocation"
  :url "https://github.com/BrunoBonacci/ip-geoloc"

  :license {:name "Apache License 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}

  :scm {:name "git" :url "https://github.com/BrunoBonacci/ip-geoloc"}

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.maxmind.geoip2/geoip2 "2.3.1"]
                 [clj-http "3.2.0"]
                 [pandect "0.5.2"]
                 [com.stuartsierra/component "0.2.3"]
                 [com.brunobonacci/safely "0.2.2"]])
