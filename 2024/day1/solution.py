from functools import reduce

# left = [3,
# 4,
# 2,
# 1,
# 3,
# 3]
# right = [4,
#    3,
#    5,
#    3,
#    9,
#    3]


def distance(left, right):
   sorted_left = sorted(left)
   sorted_right = sorted(right)

   zipped = zip(sorted_left, sorted_right)
   distances = []
   for pair in zipped:
       distances.append(abs(pair[1] - pair[0]))

   print(distances)

   total_distance = reduce(lambda x, y: x + y, distances)
   print(total_distance)

with open('input.txt') as f:
   lines = f.readlines()
   left = [int(line.split()[0]) for line in lines]
   right = [int(line.split()[1]) for line in lines]
   distance(left, right)