class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        result = []
        intervals.sort(key = lambda x : x[0])
        curr = intervals[0]
        for i in range(1,len(intervals)):
            current = intervals[i]
            if(curr[1] >= current[0]):
                curr[1] = max(curr[1], current[1])
            else:
                result.append(curr)
                curr = intervals[i]
        result.append(curr)
        return result