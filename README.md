# archetype api bxcode microservice

archetype-api-bxcode-microservice

## Definition

```bash
mvn archetype:generate \
  -DarchetypeGroupId=com.bxcode.archetypes.reactive \
  -DarchetypeArtifactId=archetype-api-bxcode-microservice \
  -DarchetypeVersion=1.0.0-SNAPSHOT \
  -DgroupId=[YOUR_GROUP_ID] \
  -DartifactId=[YOUR_ARTIFAC_ID] \
  -Dversion=[YOUR_VERSION] \
  -DinteractiveMode=false
```

## Usage

Use of maven generator:

Terminal Bash :

```bash
mvn archetype:generate \
  -DarchetypeGroupId=com.bxcode.archetypes.reactive \
  -DarchetypeArtifactId=archetype-api-bxcode-microservice \
  -DarchetypeVersion=1.0.0-SNAPSHOT \
  -DgroupId=com.bxcode.demo \
  -DartifactId=api-bxcode-demo-microservice \
  -Dversion=1.0.0-SNAPSHOT \
  -DinteractiveMode=false
```

Terminal Cmd:

```bash
mvn archetype:generate ^
  -DarchetypeGroupId=com.bxcode.archetypes.reactive ^
  -DarchetypeArtifactId=archetype-api-bxcode-microservice ^
  -DarchetypeVersion=1.0.0-SNAPSHOT ^
  -DgroupId=com.bxcode.demo ^
  -DartifactId=api-bxcode-demo-microservice ^
  -Dversion=1.0.0-SNAPSHOT ^
  -DinteractiveMode=false
```

# TABLE OF VERSIONS

| **VERSION**    | **CHANGES**                                                                 | **DATE**   | **BY**                                  |
|----------------|-----------------------------------------------------------------------------|------------|-----------------------------------------|
| 1.0.0-SNAPSHOT | Implementation of an archetype for the generation of reactive microservices | 05-01-2024 | [bxcode](https://github.com/dbacilio88) |

