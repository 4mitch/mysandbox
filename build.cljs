(require '[lumo.build.api :as b])

(b/build "src"
    { :main 'hello.core
      :output-to "main.js"
      :optimizations :advanced
      :target :nodejs})
  
