# このアプリについて

このアプリケーションは、Spring BootとDBFluteの学習のためのアプリです。

# 開発環境構築

## Eclipseで開発できるようにする
- リポジトリをclone

```
$ git clone https://github.com/satty3104/DailyReports
```

- Eclipse のプロジェクトとしてインポート
- gradlew もしくは gradlew.bat を実行して依存関係を解決

```
$ sh gradlew eclipse
```
- SUCCESSと出ればOK

## DBのセットアップ
- localhost で MySQL が起動していることが前提
- root ユーザのパスワード設定ファイルを作成

```
$ vi dbflute_dailyreports/dfprop/root-password.txt
```

- manage.sh もしくは manage.bat をキック

```
$ sh manage.sh
     |\  |-\ |-- |      |      
     | | |-\ |-  | | | -+- /_\
     |/  |-/ |   | |_|  |  \-  

 <<< DB Change >>> *delete database
   0 : replace-schema  => drop tables and create schema
   1 : renewal         => call 0->21->22->23->25->24
   7 : save-previous  8 : alter-check

 <<< Generate >>>
   2 : regenerate  => call 21->22->23->25->24
  21 : jdbc        22 : doc  23 : generate
  24 : sql2entity  25 : outside-sql-test

 <<< Utility >>>
   4 : load-data-reverse  5 : schema-sync-check
  11 : refresh  12 : freegen  13 : take-assert
  88 : intro    94 : upgrade  97 : help

(input on your console)
What is your favorite task? (number):
0 ← 0を入力してエンター
```
- SUCCESSと出ればOK
  - ユーザ：dailyreports（パスワードはapplication.propertiesあたりを見てください）
  - スキーマ：dailyreports
  - テーブル：reports
  - ができているはず

```
$ mysql -udailyreports -p
Enter password: ************
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 36
Server version: 5.7.11-log MySQL Community Server (GPL)

Copyright (c) 2000, 2016, Oracle and/or its affiliates. All rights reserved.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| dailyreports       |
+--------------------+
2 rows in set (0.01 sec)

mysql> use dailyreports;
Database changed

mysql> show tables;
+------------------------+
| Tables_in_dailyreports |
+------------------------+
| reports                |
+------------------------+
1 row in set (0.00 sec)
```
## とりあえず起動してみる
- `src/main/java/proj/sample/dailyreport/Bootstrap.java` の main メソッドを実行

```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v1.3.3.RELEASE)

なんかいろいろ出る

・・・

2016-04-07 02:36:57.126  INFO 8864 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2016-04-07 02:36:57.140  INFO 8864 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase 0
2016-04-07 02:36:57.328  INFO 8864 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8080 (http)
2016-04-07 02:36:57.335  INFO 8864 --- [           main] proj.sample.dailyreport.Bootstrap        : Started Bootstrap in 6.057 seconds (JVM running for 6.557)
```
- ブラウザで `http://localhost:8080/health` にアクセスし、↓のようなレスポンスが返ってきたらOK
```
{"status":"UP","diskSpace":{"status":"UP","total":120860962816,"free":69629513728,"threshold":10485760},"db":{"status":"UP","database":"MySQL","hello":1}}
```
