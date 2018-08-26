Steps to Build, Deploy and Deploy a Spring-boot application in Kubernetes

1. Clone this project from my GitHub:
	https://github.com/vijayjaiswal/time-service.git
	
2. Build the Docker Image using following Maven command:
	> mvn package dockerfile:build
	Alternatively, you can run the following;if you are using docker:
	> mvn clean compile package
	> docker build -t springboot-time-service .
	
3. Push the Docker Image into your DOCKER repository using following Maven command:
	> mvn package dockerfile:push
	Alternatively, you can run the following;if you are using docker:
	> docker image ls (THIS WILL GIVE YOU THE IMAGE DETAILS)
	> docker push vijayjaiswalvictory/springboot-time-service:latest
		Image will be pushed to https://hub.docker.com/r/vijayjaiswalvictory/time-service
		
4. Create Docker image pull secrets:
	> kubectl create secret docker-registry vjcred --docker-server=hub.docker.com --docker-username=<USERNAME> --docker-password=<XXXXX> --docker-email=<YYYYYYY@CCC.com>
	> kubectl get secret vjcred --output=yaml
		To view the details
	
5. Deploy the Dockerimage into your Kuberenetes Cluster:
	> kubectl create -f .\src\main\resources\deployment.yaml
	
6. Kubernetes Dashboard can be see using(if using mininkube):
	> minikube dashboard