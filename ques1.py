class Solution:
    def isFriend(self, n : int, x : int, y : int, arr : List[int]) -> str:
        # code here
        if((y-x) in arr):
            return "yes"
        else:
            return "no"
