#Joseph Day
#Project Euler
#52. Permuted Multiples

import collections

def equal(x,y):
    return collections.Counter([int(d) for d in str(x)]) == collections.Counter([int(d) for d in str(y)])

def sixequal(x):
    if equal(x,2*x):
        if equal(x,3*x):
            if equal(x,4*x):
                if equal(x,5*x):
                    if equal(x,6*x):
                        return True
                else:
                    return False
            else:
                return False
        else:
            return False
    else:
        return False

def go():
    x=1
    while not sixequal(x):
        x+=1
    return x