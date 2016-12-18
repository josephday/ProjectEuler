#Joseph Day
#Project Euler
#112 Bouncy Numbers

def increasing(x):
    digits = [int(d) for d in str(x)]
    first = digits[0]
    for digit in digits:
        second = digit
        if first > second:
            return False
        first = digit 
    return True   

def decreasing(x):
    return increasing(int(str(x)[::-1]))

def bouncy(x):
    return not(increasing(x) or decreasing(x)) 


def go(bound):
    '''
    '''
    numerator = 0
    denominator = 1
    current = 1
    while numerator/denominator < bound:
        current+=1
        if bouncy(current):
            numerator+=1
        denominator+=1
    return denominator  


    