#!/usr/bin/env python3

# Import of python system library.
# This library is used to download the 'index.html' from server.
# You don't have to install anything special, this library is installed with Python.
import sys
import requests
import json
# Get the parameter
name = sys.argv[1]
#print required text
#print whose name it is
print("my name is", name, flush=True)
#save it in a set
data = {'name': name}
# post request to give the name to the server
responce = requests.post("http://0.0.0.0:5000", json=data)
