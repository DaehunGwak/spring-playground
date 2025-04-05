```shell
helm create spring-docker-test

kubectl config current-context # minikube 컨텍스트인지 확인


```

### registries

- docker hub: https://hub.docker.com/repository/docker/ordi/spring-docker-test/general

### trouble-shootings
- Error: could not find tiller (when `helm install`)
  - https://stackoverflow.com/questions/59735045/install-helm-2-13-0-on-minikube-server-1-6-2-could-not-find-tiller
  ```shell
  kubectl -n kube-system create serviceaccount tiller 
  
  ```