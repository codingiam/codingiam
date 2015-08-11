(defproject codingiam "0.0.1"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.48"]]
  :plugins [[lein-cljsbuild "1.0.6"]
            [lein-figwheel "0.3.7"]]
  :cljsbuild {:builds  {:development {:source-paths ["src/main/cljs"]
                                      :notify-command ["notify-send"]
                                      :figwheel true
                                      :compiler {:output-to "app/assets/javascripts/codingiam.js"
                                                 :output-dir "target/javascripts"
                                                 :asset-path "/assets"
                                                 :optimizations :none
                                                 :main "codingiam.core"
                                                 :print-input-delimiter true
                                                 :pretty-print true}}}})
