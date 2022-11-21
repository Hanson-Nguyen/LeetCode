class Solution(object):
    def mostWordsFound(self, sentences):
        """
        :type sentences: List[str]
        :rtype: int
        """
        
        result = 0
        x = 0

        for i in sentences:
            x = i.count(" ") + 1
            if x > result:
                result = x
                
        return result