(ns prime-factorization.core-spec
  (:require [speclj.core :refer :all]
            [prime-factorization.core :refer :all]))

(describe "PrimeFactors"
          (it "should factor 1 as '(1)"
              (should= '() (prime-factors 1)))
          (it "should factor 2 as '(2)"
              (should= '(2) (prime-factors 2)))
          (it "should factor 3 as '(3)"
              (should= '(3) (prime-factors 3)))
          (it "should factor 4 as '(2 2)"
              (should= '(2 2) (prime-factors 4)))
          (it "should factor 5 as '(5)"
              (should= '(5) (prime-factors 5)))
          (it "should factor 5 as '(2 3)"
              (should= '(2 3) (prime-factors 6)))
          (it "should factor 8 as '(2 2 2)"
              (should= '(2 2 2) (prime-factors 8)))
          (it "should factor 9 as '(3 3)"
              (should= '(3 3) (prime-factors 9)))
          (it "should factor 2*3*7*13 as '(2 3 7 13)"
              (should= '(2 3 7 13) (prime-factors (* 2 3 7 13)))))
