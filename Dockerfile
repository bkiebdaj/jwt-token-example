FROM mysql:8

ENV MYSQL_ROOT_PASSWORD=local123! \
    MYSQL_DATABASE=jwt-example

RUN printf '[mysqld]\nport=8005\nbind-address=0.0.0.0\n' > /etc/mysql/conf.d/custom.cnf

EXPOSE 8005

CMD ["mysqld"]