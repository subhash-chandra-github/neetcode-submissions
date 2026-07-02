class Solution {
    public int[][] merge(int[][] intervals) {

        List<int[]> lst = new ArrayList<>();

        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);

        for(int i=0;i<intervals.length;i++){
            if(lst.isEmpty() || lst.get(lst.size()-1)[1] < intervals[i][0]){
                lst.add(intervals[i]);
            }else{
                lst.get(lst.size()-1)[1] = Math.max(lst.get(lst.size()-1)[1], intervals[i][1]);
            }
        }

        return lst.toArray(int[][]::new);
        
    }
}
