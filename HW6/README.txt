1. What is a docker container?
 >A docker container is a executable package of software that includeds everything 
 >you  need to run an application. It's made possily by virtualization. They are instances created from
 > docker images

2. What is the difference between a container and a virtual machine?
 > The difference between a container and a virtual machine is a container is a stand
 > alone executable. A virtual machine is bigger since it contains a whole operating
 > system, it can also contain more than one. In a VM the the hardware is virtualized but containers
 > don't do that.  

3. What is the purpose of a Dockerfile?
 > A docker file is like a makeFile. It contains all of the commands on how to assemble
 > an image. It automates the process with a couple of commands the user could use.

4. What is the purpose of a requirements.txt file?
 > The purpose of the requirements.txt file is it holds the name of the 
 > libraries that the user might need to install. To automate the process, this file
 > holds the names and during building, pip installs those libraries so the user 
 > has everything they need. In our case we are using pip to install come of the required
 > libraries

5. What is the purpose of a docker-compose.yml file?
 > The docker-compose file provides a way to document and configure all of the apps
 > services and dependencies.

6. What is the difference between a docker image and docker container?
 > Images describe the applications and how they should be run.
 > Containers are a specific instance of that Image. Images are like classes
 > and Containers are like the specific objects created from that class.

7. What command can be used to create an image from a Dockerfile?
 > docker build creates an image from a docerFile. In our case we are using 
 > docker-compose build.

8. What command will start a docker container?
 > docker run will start a docker container.

9. What command will stop a docker container?
 > docker rm will stop a running container. ctrl + c also stops a container.

10. What command will remove a docker container? Image?
 > To remove a docker container use the "docker container rm <id>" command
 > To remove a docker image use the "docker image rm <id>" command

11. What command will list all running docker containers? all containers?
 > To list all running containers, use "docker container ls"
 > To list all containers add a --all to the end of the previous command

12. What command will list all docker images?
 > use the command "docker images"
 > This command defaults to listing only running images

13. What command do you use to deploy docker containers using information in the dockercompose.yml file?
 > You can use the command "docker-compose up --build" to deploy docker containers
 > using information from docker-compose.yml 

14. How can you specify in the docker-compose.yml file that you want docker containers to use the hosts network?
 > you can use the line "network_mode: host" to specify that you want to use 
 > the host network

15. How can you specify in the docker-compose.yml file where the Dockerfile for a particular container is found? 
 > To specify where a DockerFile is, use the line "build: client/" or
 > "build (file location)". This tells the docker-compose file where the 
 > Dockerfile is found
