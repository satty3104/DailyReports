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
- DBスキーマを先に作っておく

```
$ mysql -uroot -p

mysql> create database dailyreports character set utf8;
Query OK, 1 row affected (0.05 sec)

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| dailyreports       |
+--------------------+
2 rows in set (0.01 sec)
```

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
  - テーブル：reports
  - ができているはず

```
$ mysql -udailyreports -p ← ログインできる

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

# ブランチのルール
- clone したばかりだと、masterブランチしかないので、自分のメインブランチを作成します

```
$ git checkout -b <name>-work master ← <name>には自分の名前を入れる
$ git push origin <name>-work
```

- さらに、作業用トピックブランチを作成

```
$ git checkout -b feature-add-getReportList-<name> <name>-work
                                            ↑ わかりやすいように自分の名前を入れておく
```

- トピックブランチ上で開発・コミットなどなどをします
- ある程度機能が仕上がって動確も終わったら、Push

```
$ git push origin feature-add-getReportList-<name>
```

- Githubの画面から、プルリクエストを出してください
  feature-add-getReportList-<name> を <name>-work にマージするように指定する

- さあ、レビューの時間です
- レビュー後修正が終わったら、トピックブランチが自分のメインブランチにマージされる
- また、トピックブランチを作成して、開発を続けてください

# 作ってほしい日報APIの仕様

## 共通
- RESTfulです
- サンプルなので認証とかは無し
- APIを直接叩くときはPostmanとかを使ってみてください  
  https://chrome.google.com/webstore/detail/postman/fhbjgbiflinjbdggehcddcbncdddomop

## 各エンドポイントの仕様

### GET /reports/
- すべての日報を返却します
- 0件の場合は空の配列を返却
- レスポンス

```
GET /reports/

200 OK
[
  {
    "id": 1,
    "subject": "4/1",
    "body": "今日はそんなに働かなかった",
    "writer": "山田太郎",
    "published_at": "20160401120000"
  },
  {
    "id": 2,
    "subject": "4/1",
    "body": "きょうもよく働いた",
    "writer": "山田次郎",
    "published_at": "20160401130000"
  },
]
```

### GET /reports/:id
- 1件の日報を返却します
- 存在しない場合は、HTTPステータスコード404を返却
- レスポンス

```
GET /reports/2

200 OK
{
  "id": 2,
  "subject": "4/1",
  "body": "きょうもよく働いた",
  "writer": "山田次郎",
  "published_at": "20160401130000"
}
```

### POST /reports/
- 1件の日報を作成します
- バリデーション
  - 件名（subject）：最大100文字、必須
  - 本文（body）：最大5000文字
  - 筆者（writer）：最大50文字、必須
  - 公開日時（published_at）：YYYYMMDDhhmmss（24h表記）、ここに指定した時刻以降に公開、nullの場合非公開
- リクエスト

```
POST /reports/

{
  "subject": "4/2",
  "body": "きょうはすごく働いた",
  "writer": "山田次郎",
  "published_at": "20160402230000"
}
```

- レスポンス

```
成功時
200 OK
{
  "id": 3,
  "subject": "4/2",
  "body": "きょうはすごく働いた",
  "writer": "山田次郎",
  "published_at": "20160402230000"
}

失敗時
400 Bad Request
{
  "code": "PARAMTER_ERROR",
  "errors" : [
    {
      "code" : "REQUIRED",
      "fields": [
        "subject"
      ],
      "message": "[subject] cannot be blank"
    }
  ]
}
```

### PUT /reports/:id
- 1件の日報を更新します
- バリデーションは登録時と同じ
- リクエスト

```
PUT /reports/3

{
  "id": 3,
  "subject": "4/2",
  "body": "きょうはすごく働いた。つかれたー",
  "writer": "山田次郎",
  "published_at": "20160402230000"
}
```

- レスポンス

```
成功時
200 OK
{
  "id": 3,
  "subject": "4/2",
  "body": "きょうはすごく働いた。つかれたー",
  "writer": "山田次郎",
  "published_at": "20160402230000"
}

失敗時は登録と同じ
```

### DELETE /reports/:id
- 1件の日報を削除します
- すでに削除済みなど、存在しない場合は、HTTPステータスコード404を返却
- リクエスト・レスポンス

```
DELETE /reports/1

成功時
200 OK
```
