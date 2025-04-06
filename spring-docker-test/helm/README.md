### commands

```shell
# 헬름 차트 생성
helm create spring-docker-test 

# minikube 컨텍스트인지 확인
kubectl config current-context 

# 차트 minkube에 배포
helm install spring-docker-test-mini spring-docker-test --set image.tag=0.1.1
```

### registries

- docker hub: https://hub.docker.com/repository/docker/ordi/spring-docker-test/general

### trouble-shootings
- Error: could not find tiller (when `helm install`)
  - helm2 에서 tiller 사용하는데, helm3에서는 사용하지 않음
  - helm3 버전으로 업데이트 조치 후 해결
