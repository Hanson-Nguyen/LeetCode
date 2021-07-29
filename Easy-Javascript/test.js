arr = [1,2,3,4,5]
for (var i = 0; i < arr.length; i++) {
    setTimeout(function (j) {
        return function() {
            console.log('something ' + j);
        }
    } (i), 3000);
}

