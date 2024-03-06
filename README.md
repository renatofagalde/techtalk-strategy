### Instalando
Usando o maven como gerenciador de dependencias e através do plugin ``maven-assembly-plugin`` o empacotamento do aplicativo em um arquivo do tipo jar
```shell
mvn clean install
```


### Cenario "JSON"
```shell
java -jar ./target/techtalk-strategy-1.0-SNAPSHOT-jar-with-dependencies.jar json < ./dados/MOCK_DATA.txt
```

### Cenario "XML"
```shell
java -jar ./target/techtalk-strategy-1.0-SNAPSHOT-jar-with-dependencies.jar  xml < ./dados/MOCK_DATA.txt
```

### Cenario "YAML"
```shell
java -jar ./target/techtalk-strategy-1.0-SNAPSHOT-jar-with-dependencies.jar yaml < ./dados/MOCK_DATA.txt
```
