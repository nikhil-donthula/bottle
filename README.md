# project bottle - Getting Started

Run the application

```
./gradlew bootRun
```
<img align=center src=assets/localhost001.png> 

Build

```
./gradlew build
```

Building Docker image
```
docker build --tag image-name:tag .
```
```
docker build -t ghcr.io/nikhil-donthula/bottle:1.0.0 --build-arg DESCRIPTION=bottle .
```

docker images

```
docker inspect <id/name:tag>
```

Run Docker Container 

```
docker run -p host-port:container-port image-name:tag
```
```
docker run -d -p 8081:8080 ghcr.io/nikhil-donthula/bottle:1.0.
0
```
naming convention ghcr.io/your-username/your-repo-name:tag

-d or --detach for running container in background

Listing Docker containers
```
docker ps -a
```
```
docker container ls
```
Docker container logs
```
docker logs container-id
```
Stopping Container 
```
docker stop container-id
```
Delete container
```
docker container rm container-id
```
Delete docker image
```
docker image rm image-name:tag
```

Pushing Docker image to github packages

Login to github container registry
```
docker login ghcr.io
```
```
docker push ghcr.io/nikhil-donthula/bottle:1.0.0
```

Rancher local setup
```
kubectl config get-contexts
```
```
kubectl config use-context "rancher-desktop"
```
## helm commands
### creating helm files - one time job
helm create <chart_name>
```
helm create helm-bottle
``` 

```
helm upgrade --install bottle helm-bottle/ --set image.tag=1.0.0 --namespace bottle-namespace --create-namespace --wait
```

```

kubectl get pods -A -o wide
```
```
kubectl -n bottle-namespace describe pod bottle-helm-bottle-ffd99f449-hf2cj
```
```
kubectl -n bottle-namespace describe pod bottle-
```
```
kubectl get pods -n bottle-namespace
```
```
kubectl -n bottle-namespace delete pod demo-helm-bottle-549c86f97b-f649j
```
```
helm uninstall demo --namespace bottle-namespace
```
```
kubectl describe pod bottle- -n bottle-namespace
```
```
kubectl exec -it bottle- -- curl http://localhost:8080
```
```
ubectl exec -it bottle-helm-bottle-ffd99f449-hf2cj -n bottle-namespace -- curl http://localhost:8080
```
Azure login