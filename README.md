# ProgrHomeTask - Микросервис, который выводит день программиста в вводимом году.

## Реализация
Для написания данного микросервиса я использовал framework Spring.
Так же была использована система автоматической сборки Gradle.

## Пример работы программы
* curl http://localhost:8080?year=2020
{"errorCode":200,"dataMessage":"12/9/2020"}

* curl http://localhost:8080?year=2017
{"errorCode":200,"dataMessage":"13/9/2017"}
