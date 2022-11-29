class Solution(object):
    def interpret(self, command):
        """
        :type command: str
        :rtype: str
        """
        
        string = ""
        temp = ""
        
        for i in command:
            if i == "G":
                string += "G"
                
            elif i == "(":
                temp += "("
                
            elif temp == "(" and i == ")":
                string += "o"
                temp = ""
                
            elif temp == "(" and i == "a":
                string += "al"
                temp = ""
            
        return string