import requests

url = "http://localhost:8087/add?name=test&age=1&sex=boy"

payload={}
headers = {}

response = requests.request("POST", url, headers=headers, data=payload)

print(response.text)
