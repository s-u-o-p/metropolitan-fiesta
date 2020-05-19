import requests
import socket
def is_connected():
    try:
        # connect to the host -- tells us if the host is actually
        # reachable
        socket.create_connection(("www.google.com", 80))
        return True
    except OSError:
        pass
    return False


def update1():
    F1 = requests.get('https://raw.githubusercontent.com/s-u-o-p/metropolitan-fiesta/master/Funnys/Funnys1.txt')
    F1 = F1.text
    return F1.splitlines()


def update2():
    F2 = requests.get('https://raw.githubusercontent.com/s-u-o-p/metropolitan-fiesta/master/Funnys/Funnys2.txt')
    F2 = F2.text
    return F2.splitlines()


def update3():
    F3 = requests.get('https://raw.githubusercontent.com/s-u-o-p/metropolitan-fiesta/master/Funnys/Funnys3.txt')
    F3 = F3.text
    return F3.splitlines()


def update4():
    F4 = requests.get('https://raw.githubusercontent.com/s-u-o-p/metropolitan-fiesta/master/Funnys/Funnys4.txt')
    F4 = F4.text
    return F4.splitlines()


def update5():
    F5 = requests.get('https://raw.githubusercontent.com/s-u-o-p/metropolitan-fiesta/master/Funnys/Funnys5.txt')
    F5 = F5.text
    return F5.splitlines()