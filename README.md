# project bottle - Getting Started

Run the application

```
./gradlew bootRun
```
http://localhost:8080/
<img align=center src=assets/localhost001.png> 

Build

```
./gradlew build
```
For generating wrapper
```
gradle wrapper
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
docker run -d -p 8080:8080 ghcr.io/nikhil-donthula/bottle:1.0.0
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
```
docker rmi ghcr.io/nikhil-donthula/bottle:1.0.1
```

Pushing Docker image to github packages

Login to github container registry
```
docker login ghcr.io
```
if you get error in linux as below follow the link :
Error saving credentials: error storing credentials - err: exit status 1, out: `pass not initialized: exit status 1: Error: password store is empty. Try "pass init".`
https://docs.docker.com/desktop/get-started/#credentials-management-for-linux-users
```
docker push ghcr.io/nikhil-donthula/bottle:1.0.0
```

Rancher local setup
```
kubectl config get-contexts
```
```
kubectl config use-context "rancher-desktop"
kubectl config use-context rancher-desktop
```
delete a config context
```
kubectl config delete-context bottle
```
## helm commands
### creating helm files - one time job
helm create <chart_name>
```
helm create helm-bottle
``` 
Validating charts for any syntax errors
```
helm lint helm-bottle
```
to preview rendered templates before installation
```
helm template helm-bottle
```
```
helm upgrade --install bottle helm-bottle/ --set image.tag=1.0.0 --namespace bottle-namespace --create-namespace --wait
```
if upgrade takes more than 5min add timeout flag
```
helm upgrade --install bottle helm-bottle/ --set image.tag=1.0.0 --namespace bottle-namespace --create-namespace --wait --timeout=15m
```
see all the secretes in a namespace
```
kubectl get secrets -n bottle-namespace
```
Create a secret to pull private image from github package repository ghcrk
```
kubectl create secret docker-registry mysecretname --docker-server=https://ghcr.io --docker-username=mygithubusername --docker-password=mygithubreadtoken --docker-email=mygithubemail
```
Secrets are namespace specific
delete a secret
```
kubectl delete secret ghcr-imagepull-secret -n bottle-namespace
```
If set, upgrade process rolls back changes made in case of failed upgrade.
```
helm upgrade <release> <chart> --atomic                   
```
See all the revisons of the deployment
```
helm history bottle -n bottle-namespace
```
helm rollback to previous version
```
helm rollback bottle -n bottle-namespace
```
```
helm status bottle -n bottle-namespace
```
list all the relesses
helm list -all
```
helm list -A
```
list all pods
```
kubectl get pods -A -o wide
```
list pods in specific namespace
```
kubectl get pods -n bottle-namespace
```
Full details of a pod
```
kubectl -n bottle-namespace describe pod bottle-helm-bottle-ffd99f449-hf2cj
```
```
kubectl -n bottle-namespace describe pod bottle-
```
```
kubectl describe pod bottle- -n bottle-namespace
```
delete a pod
```
kubectl -n bottle-namespace delete pod demo-helm-bottle-549c86f97b-f649j
```
unistall a release created with helm
```
helm uninstall bottle --namespace bottle-namespace
```
portforward to access application - Forward a local port to a port on the Pod 
```
kubectl port-forward pods/bottle-helm-bottle-7679d8b56f-8gwxf -n bottle-namespace 8080:8080
```

```
kubectl exec -it bottle- -- curl http://localhost:8080
```
```
kubectl exec -it bottle-helm-bottle-ffd99f449-hf2cj -n bottle-namespace -- curl http://localhost:8080
```
Azure login
```
az login
```
Set the cluster subscription
```
az account set --subscription 531ccf55-a0e0-nnn5-9e2a-aff7b95e45f1
```
Download cluster credentials
```
az aks get-credentials --resource-group jan28 --name bottle-cluster --overwrite-existing
```
Now you are connected to cluster


Kubernetes pod errors:
ErrImagePull > the initial error indicating a failed image pull. authentication error with ghcr.io OR image not prrsent in repo
ImagePullBackOff     > consequence of repeated ErrImagePull attempts, providing a waiting period for potential resolution. container could not start because Kubernetes could not pull a container image (for reasons such as invalid image name, or pulling from a private registry without imagePullSecret). 
crashloopBackOff > 