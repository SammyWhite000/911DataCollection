#!/usr/bin/env python3

# Import of python system library.
# This library is used to download the 'index.html' from server.
# You don't have to install anything special, this library is installed with Python.
import sys
import requests
# Get the parameter
name = sys.argv[1]
#print required text
print("my name is ", name, flush=True)
data = {'name', name}
responce = requests.post("http://0.0.0.0:5000", data)
