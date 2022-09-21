import time 
from pathlib import Path, PosixPath 
import pathlib
import os 
import glob
import operator
from datetime import datetime


class Selector:
    number = None 
    attribute = None
    path = None 

    def __init__(self, path:str="",number:int=0, attribute:str=""): 
        self.path = Path(path) #Creating a path based on what inputted.
        self.number = number
        self.attribute = attribute


        if(attribute == "fspOldest"):
            print("\nOldest File First:")
            self.fspOldest()
        elif(attribute == "fspNewest"): 
            print("\nOldest File First:")
            self.fspNewset()
        elif(attribute =="fspBiggest"): 
            print("\nBiggest file First:")
            self.fspBiggest()
        elif(attribute =="fspSmallest"): 
            print("\nSmallest file First:")
            self.fspSmallest()
        

    def fspOldest(self, reverseStatus=False): #Oldest to newest
        #Get all the files
        listOfFiles = filter( lambda x: os.path.isfile(os.path.join(self.path, x)),os.listdir(self.path) )
        #Sort them out reverse= based on order
        listOfFiles = sorted( listOfFiles,key = lambda x: os.path.getmtime(os.path.join(self.path, x)),reverse=reverseStatus)

        print("[+]Files count in folder: ", len(listOfFiles), "below are ", self.number , "files")

        if(len(listOfFiles) < self.number): # Avoid OUTOFINDEXERROR
            self.number = len(listOfFiles)

        #print the dates with files name 
        for i in range(0,self.number): 
            filePath = os.path.join(self.path, listOfFiles[i])
            timeStamp = time.strftime('%a %b %d %H:%M:%S %Y',time.gmtime(os.path.getmtime(filePath)))
            print(timeStamp, ' = ', listOfFiles[i])    

    def fspNewset(self,): #Newest to oldest
        self.fspOldest(True)


    def fspBiggest(self, reverseStatus=True): 
        listOfFiles = filter( lambda x: os.path.isfile(os.path.join(self.path, x)),os.listdir(self.path) )
        listOfFiles = sorted( listOfFiles,key = lambda x: os.path.getsize(os.path.join(self.path, x)),reverse=reverseStatus)
        print("[+]Files count in folder: ", len(listOfFiles), "below are ", self.number , "files")

        if(len(listOfFiles) < self.number): # Avoid OUTOFINDEXERROR
            self.number = len(listOfFiles)
        
        #print the dates with files name 
        for i in range(0,self.number): 
            filePath = os.path.join(self.path, listOfFiles[i])
            timeStamp = os.path.getsize(filePath)
            print(round(int(timeStamp)/1024, 2), " MB ", ' = ', listOfFiles[i])    

    def fspSmallest(self,): 
        self.fspBiggest(reverseStatus=False) 




