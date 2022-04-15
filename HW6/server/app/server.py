
#imports
from flask import Flask
import requests
import jsdonify
import logging

#Stop flask printing every time request is diven
logging.getLogger('werkzeug').disable= True
#start flask app
app = Flask(__name__)

#hold the incoming data
#data = []

@app.route('/', methods = ['POST'])
def hello_world():
    if requests.method == 'POST':
        inData = requests.data['name']
        print("Client Name is", inData, flush=True)

app.run(host='0.0.0.0',port=5000)
