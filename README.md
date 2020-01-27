# todo

FIXME

## Prerequisites

You will need [Leiningen][] 2.0.0 or above installed.

[leiningen]: https://github.com/technomancy/leiningen

A MySQL database is needed too with this table:
`
CREATE DATABASE todo;

CREATE TABLE items (
  id MEDIUMINT NOT NULL AUTO_INCREMENT,
  title varchar(255),
  description varchar(255),
  primary key (id)
);
`


## Running

To start a web server for the application, run:

    lein ring server

## License

Copyright © 2020 FIXME
