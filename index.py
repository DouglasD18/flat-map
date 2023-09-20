def flat_map(array):
    newArray = []
    for item in array:
        if isinstance(item, list):
            newArray.extend(flat_map(item))
        else:
            newArray.append(item)
    return newArray


array = [3, [-2, [[8]], [9]], [12]]
print(flat_map(array))
