import online
from secrets import choice
import random
import colorama
ISONLINE = online.is_connected()
def cryptoinsult(nam, insul):
    while insul != 0:
        print(colorama.Fore.RED + f'{nam} {choice(Funny1)} {choice(Funny2)} {choice(Funny3)} {choice(Funny4)} {choice(Funny5)}')
        insul -= 1


def seedinsult(nam, insul, sed):
    random.seed(sed)
    while insul != 0:
        print(colorama.Fore.RED + f"{nam} {random.choice(Funny1)} {random.choice(Funny2)} {random.choice(Funny3)} {random.choice(Funny4)} {random.choice(Funny5)}")
        insul -= 1
try:
    if ISONLINE:
        Funny1 = online.update1()
        Funny2 = online.update2()
        Funny3 = online.update3()
        Funny4 = online.update4()
        Funny5 = online.update5()
    else:
        pass
    while len(Funny1):
        name = input(colorama.Fore.GREEN + "Insert name or nothing to quit: ")
        if len(name) == 0:
            exit()
        seed = input("Insert seed or nothing for random: ")
        try:
            amount = int(input("Insert the amount of insults you want: "))
        except:
            amount = 1
        name = name.lower()
        name = name.capitalize()
        ifs = len(seed)
        if ifs == 0:
            cryptoinsult(name, amount)
        else:
            seedinsult(name, amount, seed)
except KeyboardInterrupt:
    print(colorama.Fore.LIGHTYELLOW_EX + ("""
User ended session"""))