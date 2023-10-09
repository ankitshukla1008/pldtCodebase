#Implementation of class and object in python.
class Summantion: 
    def __init__(self,a,b): 
        self.x=a
        self.y=b
    def sum(self):
        s=self.x + self.y
        return s #Function returns value
obj1=Summantion(11,12) #Object creation
obj2=Summantion(11,12)
print("Sum of 11 and 12= ",obj1.sum()) #Function calling and print result
print("Sum of 11 and 12= ",obj2.sum())