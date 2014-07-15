(defproject com.andrewmcveigh/datecljs "0.1.0-SNAPSHOT"
  :description "Use datejs from ClojureScript"
  :url "https://github.com/andrewmcveigh/datecljs"
  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"}
  :scm {:url "git@github.com:andrewmcveigh/datecljs.git"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2268"]]

  :plugins [[com.cemerick/clojurescript.test "0.3.0"]
            [lein-cljsbuild "1.0.3"]
            [com.cemerick/austin "0.1.4"]]

  :jvm-opts ["-Djava.awt.headless=true"]
  :hooks [leiningen.cljsbuild]
  :clojurescript? true
  :cljsbuild
  {:builds
   {:dev {:source-paths ["src"]
          :compiler {:output-to "target/main.js"
                     :optimizations :whitespace
                     :pretty-print true
                     :foreign-libs [{:file "lib/datejs/build/date.js"
                                     :provides ["datejs"]}]}}}})
