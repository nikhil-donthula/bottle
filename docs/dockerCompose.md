Add docker-compose.yaml file and .env file
```
docker compose up -d
```
```
docker ps -a
```
```
docker images
```

```
docker compose down
```
list all the volumes created by docker and when run by docker compose file
```
docker volume ls
```
delete a volume
```
docker volume rm <volume_name>
```
removes all unused volumes, meaning any volume that is not currently attached to a running container will be deleted.
```
docker volume prune
```