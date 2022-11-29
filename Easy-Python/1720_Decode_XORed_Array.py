class Solution(object):
    def decode(self, encoded, first):
        """
        :type encoded: List[int]
        :type first: int
        :rtype: List[int]
        """

        arr = []
        arr.append(first)
        
        for i in range(len(encoded)):
            arr.append(encoded[i] ^ arr[i])
            
        return arr