(ns frontend.util.keycode
  "Provides names for common keycodes"
  (:require [clojure.set :as set]))

;; code / keycode should all be deprecated for non funcional keys
;; (def left-square-bracket 219) ;; deprecated
;; (def left-paren 57) ;; deprecated
(def enter 13)

;; (def left-square-bracket-code "BracketLeft") ;; deprecated
;; (def left-paren-code "Digit9") ;; deprecated
(def enter-code "Enter")

(def left-square-brackets-keys #{"[" "【"})
(def left-paren-keys #{"(" "（"})
(def left-sq-brackets-and-parens (set/union left-square-brackets-keys left-paren-keys))
