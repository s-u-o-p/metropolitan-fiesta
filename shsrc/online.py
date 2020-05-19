import requests
def update1():
    F1 = requests.get('https://raw.githubusercontent.com/s-u-o-p/metropolitan-fiesta/master/Funnys/Funnys1.txt')
    F1 = F1.text
    return F1.split()
    print(Fun1)
