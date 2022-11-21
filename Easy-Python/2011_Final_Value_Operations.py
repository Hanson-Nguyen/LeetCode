# Solution 1 (For loop iterating)

class Solution(object):
    def finalValueAfterOperations(self, operations):
        """
        :type operations: List[str]
        :rtype: int
        """
        x = 0

        for y in operations:
            if y[1] == "+":
                x += 1
            else:
                x -= 1

        return x

# Solution 2 (Count function)

class Solution(object):
    def finalValueAfterOperations(self, operations):
        """
        :type operations: List[str]
        :rtype: int
        """
        a = 0
        b = 0
        c = 0
        d = 0
        
        a = operations.count("X++")
        b = operations.count("++X")
        c = operations.count("X--")
        d = operations.count("--X")
        
        return a + b - c - d