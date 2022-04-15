
#imports
from flask import Flask, request
import requests
import jsonify
import logging
import json

#Stop flask printing every time request is diven
logging.getLogger('werkzeug').disable= True
#start flask app
app = Flask(__name__)

#hold the incoming data

#Server looking for post request
@app.route("/", methods = ["POST"])
def hello_world():
    # if it is post, get the name of the client
    if request.method == "POST":
        incoming = request.get_json()
        # save the name of the client
        inData = incoming['name']
        print("Client Name is", inData, flush=True)
        # return
        return str("Successfully stored ")

# start running the server on localhost on port 5000
app.run(host='0.0.0.0',port=5000)
