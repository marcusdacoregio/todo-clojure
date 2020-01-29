(ns todo.database
  (:require [korma.db :as korma]))

(def db-connection-info
  (korma/mysql
    {:subprotocol "mysql"
     :user "root"
     :password "root"
     :subname "//localhost:3306/todo"}))

(korma/defdb db db-connection-info)