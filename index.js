const array = [[[3], 8], 5, [[[[8]]]]];

const flatMap = (array) => {
  let newArray = [];

  for (const value of array) {
    if (value instanceof Array) {
      newArray = newArray.concat(flatMap(value));
    } else {
      newArray.push(value);
    }
  }

  return newArray;
}

console.log(flatMap(array));
