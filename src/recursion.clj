(ns recursion)

(defn product [coll] (if (empty? coll)
                       1
                       (* (first coll)
                          (product (rest coll)))))
;  :-)

(defn singleton? [coll] (and (not (nil? (first coll))) (= () (rest coll))))
;  :-)

(defn my-last [coll] (if (nil? (seq coll)) nil
                         (if (nil? (next coll)) (first coll) (my-last (rest coll)))))
;  :-)

(defn max-element [a-seq] (if (nil? (seq a-seq)) nil
                            (if (nil? (next a-seq)) (first a-seq)
                              (max (first a-seq) (max-element (next a-seq))))))
;  :-)

(defn seq-max [seq-1 seq-2] (if (> (count seq-1) (count seq-2)) seq-1 seq-2))
;  [:-])

(defn longest-sequence [a-seq] (if (nil? (seq a-seq)) nil
                                 (if (nil? (next a-seq)) (first a-seq)
                                   (seq-max (first a-seq) (longest-sequence (next a-seq))))))
;  [:-])

(defn my-filter [pred? a-seq] (if (empty? a-seq)
                                (sequence nil)
                                (if (pred? (first a-seq))
                                  (cons (first a-seq) (my-filter pred? (next a-seq)))
                                  (my-filter pred? (next a-seq)))))


;  [:-])

(defn sequence-contains? [elem a-seq]
  (cond
    (empty? a-seq)
      false
    (not= (first a-seq) elem)
      (sequence-contains? elem (rest a-seq))
    :else
      true))

;  :-)

(defn my-take-while [pred? a-seq]
     (if (nil? (seq a-seq))
       (sequence nil)
       (if (pred? (first a-seq))
         (cons (first a-seq) (my-take-while pred? (rest a-seq)))
       )))

;  [:-])

(defn my-drop-while [pred? a-seq]
  (cond
    (nil? (seq a-seq))
      (sequence nil)
    (pred? (first a-seq))
      (my-drop-while pred? (next a-seq)) ; skip
    :else
      a-seq))

;  [:-])

(defn seq= [a-seq b-seq]
  (cond
   (or (empty? a-seq) (empty? b-seq))
     false
   (not= (first a-seq) (first b-seq))
     false
   (and (nil? (second a-seq)) (nil? (second b-seq)))
     true
   :else
     (seq= (next a-seq) (next b-seq))))

;  :-)

(defn my-map [f seq-1 seq-2]
  (cond
   (or (empty? seq-1) (empty? seq-2))
     (sequence nil)
   (or (nil? (first seq-1)) (nil? (first seq-2)))
     (sequence nil)
   :else
     (cons (f (first seq-1) (first seq-2)) (my-map f (next seq-1) (next seq-2)))))

;  [:-])

(defn power [n k]
  (cond
   (= n 0)
     0
   (= k 0)
     1
   :else
     (* n (power n (dec k)))))

;  :-)

(defn fib [n] (if (< n 2)
                n
                (+ (fib (- n 1)) (fib (- n 2)))))
;  :-)

(defn my-repeat [how-many-times what-to-repeat]
  (let [my-list ()]
    (cond
     (neg? how-many-times)
        ()
     (pos? how-many-times)
       (conj (my-repeat (dec how-many-times) what-to-repeat) what-to-repeat)
     :else
       my-list)))

;  [:-])

(defn my-range [up-to] (let [my-list ()
                             count up-to]
                         (cond
                          (neg? up-to)
                            ()
                          (pos? up-to)
                            (conj (my-range (dec up-to)) (dec count))
                          :else
                            my-list)))

;  [:-])

(defn tails [a-seq] (let [my-list (seq a-seq)]
                      (cond
                       (empty? a-seq)
                         ()
                       (not (nil? (first a-seq)))
                         (cons my-list (tails (next a-seq)))
                       :else
                         ())))
;  [:-])

(defn inits [a-seq] (let [my-list ()]
                      (cond
                       (empty? a-seq)
                         my-list
                       (not (nil? (first a-seq)))
                         (cons (first a-seq) (inits (rest a-seq)))
                       :else
                         my-list)))

;  [:-])

(defn rotations [a-seq] (cond
                         (empty? a-seq)
                           a-seq
                         (not (nil? (first a-seq)))
                           (conj (take 1 a-seq) (rotations (rest a-seq)))
                         :else
                           a-seq))

;  [:-])

(defn my-frequencies-helper [freqs a-seq]
  [:-])

(defn my-frequencies [a-seq]
  [:-])

(defn un-frequencies [a-map]
  [:-])

(defn my-take [n coll]
  [:-])

(defn my-drop [n coll]
  [:-])

(defn halve [a-seq]
  [:-])

(defn seq-merge [a-seq b-seq]
  [:-])

(defn merge-sort [a-seq]
  [:-])

(defn split-into-monotonics [a-seq]
  [:-])

(defn permutations [a-set]
  [:-])

(defn powerset [a-set]
  [:-])

