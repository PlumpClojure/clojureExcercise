(ns tao2-explorer.highcharts-pages.test-highcharts.events
  (:require [re-frame.core :refer [reg-event-db]]))

(reg-event-db
  :test-highcharts/set-chartname
  (fn [db [_ chartname]]
    (assoc-in db [:test-highcharts :chartname] chartname)))

(reg-event-db
  :test-highcharts/set-tablevalue
  (fn [db [_ changeData]]
    (do
      (let [rowIdx (first (first changeData))
            colIdx (second (first changeData))
            oldVal (nth (first changeData) 2)
            newVal (nth (first changeData) 3)]
        (println changeData)
        (println rowIdx)
        (println colIdx)
        (println oldVal)
        (println newVal)
        (assoc-in db [:khongbiet :haha] "")))))

