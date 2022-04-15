# Import of python system libraries.
# These libraries will be used to create the web server.
# You don't have to install anything special, these libraries are installed with Python.
from flask import Flask
from flask import request
import sys
# This variable is going to handle the requests of our client on the server.
app = Flask(__name__)

# Description = printing thing
# Get methods 

@app.route('/', methods=['GET'])
# "Printing" Statement
def hello_world():
    description = request.data
    print("Client Name is ", description, flush=True)
    return description

# Start Server
app.run(host='0.0.0.0', port=5000)