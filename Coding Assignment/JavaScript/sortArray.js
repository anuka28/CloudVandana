function sortArrayDescending(arr) {
    // Use the sort() method with a custom sorting function
    arr.sort(function(a, b) {
        // To sort in descending order, return a negative value if b should come before a
        return b - a;
    });
    return arr;
}
