/**
 * @param {number[][]} edges
 * @return {number}
 */
var findCenter = function(edges) {
    
    //1 of the 2 integers in each edge is the star node
    //First we check the first integer and compare it to the integers in the other edges
    
    const findCenter = (edges) => {

        const [[a,b], [c,d]] = edges;
        return a === c || b === c ? c : d;
    }
    
};