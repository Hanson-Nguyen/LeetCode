/*
arr = [1,2,3,4,5]
for (var i = 0; i < arr.length; i++) {
    setTimeout(function (j) {
        return function() {
            console.log('something ' + j);
        }
    } (i), 3000);
}
*/


function factorialize(num) {

    let result = 0;

    for (var i = 1; i <= num; i++) {
        console.log(i);
    }

    return result;
    
}

factorialize(5);

