# gatling_rest_vs_grpc_tests

The repository includes basic Gatling configuration with Maven. More info:
https://gatling.io/docs/current/extensions/maven_plugin/

# configuration
- gatling.conf file
- pom.xml file

# run gatling test scenarios
To run REST and gRPC simulations first run the `movie_rest.py` and `movie_server.py` from:
https://github.com/WojciechGalecki/python_grpc_api
- `run-gatling-test.sh`   or simply `mvn gatling:test`
- results under target directory

# gRPC
- profo messages under `src/main/protobuf`

- `protoc-jar-maven-plugin` used for generation classes based on `.proto` file.
- run `mvn protoc-jar:run` -> generated classes -> `target/generated-sources`

- plugin used for gRPC:
https://github.com/phiSgr/gatling-grpc

If you will have issues with scala imports running gatling tests, move your generated grpc classes under src/test/scala
where simulations are declared


# REST
- body JSON files under `src/test/resources/bodies`
