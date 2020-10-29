import sys,time
# str is printed slowly using sleep()
def slowstr(stri, times):
  for c in stri + '\n':
     sys.stdout.write(c)
     sys.stdout.flush()
     time.sleep(times)

def intro():
      stri = """dwdwdwd """
      slowstr(stri, 0.1)