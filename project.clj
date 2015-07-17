(defproject codingiam "0.0.1"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "0.0-3308"]]
  :plugins [[lein-cljsbuild "1.0.6"]]
  :cljsbuild {:builds  {:development {:source-paths ["app/assets/clojurescripts"]
                                      :notify-command ["notify-send"]
                                      :compiler {:output-to "app/assets/javascripts/codingiam.js"
                                                 :output-dir "tmp/assets/javascripts"
                                                 :optimizations :none
                                                 :main "codingiam"
                                                 :output-wrapper true
                                                 :print-input-delimiter true
                                                 :pretty-print true}}}})
