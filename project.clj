(defproject codingiam "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-3126"]]
  :plugins [[lein-cljsbuild "1.0.5"]]
  :cljsbuild {
    :builds [{:source-paths ["app/assets/clojurescripts"]
              :notify-command ["notify-send"]
              :compiler {:output-to "app/assets/javascripts/codingiam.js"
                         :output-dir "tmp/assets/javascripts"
                         :optimizations :simple
                         :output-wrapper true
                         :print-input-delimiter true
                         :pretty-print true}}]})
