#!/usr/bin/env python3

# Import of python system library.
# This library is used to download the 'index.html' from server.
# You don't have to install anything special, this library is installed with Python.
import sys
import requests
# Get the parameter
name = sys.argv[1]
r = requests.put('http://localhost:5000/',data=name)