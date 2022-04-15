# Same thing than the 'server' Dockerfile.
FROM python:latest

# Same thing than the 'server' Dockerfile.
# We import 'client.py' in '/client/' folder.
ADD main.py /client/
# Use requirements.txt
COPY requirements.txt requirements.txt
# Use pip to install it
RUN pip install -r requirements.txt
# I would like to introduce something new, the 'WORKDIR' command.
# This command changes the base directory of your image.
# Here we define '/client/' as base directory.
WORKDIR /client/