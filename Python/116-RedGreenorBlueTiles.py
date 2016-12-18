#Joseph Day
#Project Euler
#116 Red, Green, or Blue Tiles

import itertools as it 
from itertools import permutations

import math

red = 2
blue = 4
green = 3

def preperms(length_color, num_colors, total_length=50):
    ''' Given length of a color tile, the number of colored tiles,
    and total length of tile string, generates list for use in 
    itertools.permutations
    '''
    assert length_color * num_colors <= total_length
    tiles = [length_color for i in range(0,num_colors)] 
    tiles += [1 for i in range(0,total_length-(num_colors*length_color))]
    return tiles

def choose(n,k):
    numerator = math.factorial(n)
    denominator = math.factorial(k) * math.factorial(n-k)
    return numerator/denominator


def compute(length_color, total_length=50):
    '''Given length of color tile, total length of tile string
    returns sum of number of ways that n color tiles can be arranged
     with total_length-n black tiles, over n from 1 to limit
     allowed by total_length
    '''
    poss_num = [x for x in range(1,total_length//length_color+1)]
    total_ways = 0
    #print(poss_num)
    for i in poss_num:
        #total_ways += set(it.permutations(preperms(length_color, i, total_length)))
        total_ways += choose(total_length - i*(length_color-1), i)
    return (total_ways)

print(compute(red, 50) + compute(blue,50) + compute(green,50))