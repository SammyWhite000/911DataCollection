
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

@app.route("/", methods = ["POST"])
def hello_world():
    if request.method == "POST":
        incoming = request.get_json()
        inData = incoming['name']
        print("Data: ", inData)
        print("Client Name is", inData, flush=True)
        return str("Successfully stored ")


app.run(host='0.0.0.0',port=5000)
