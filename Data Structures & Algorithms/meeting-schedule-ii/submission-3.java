/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int n = intervals.size();
        int[] start = new int[n];
        int[] end = new int[n];
        int i =0;
        int rooms = 0;
        int minRooms = 0;
        for(Interval interval: intervals){
            start[i] = interval.start;
            end[i] = interval.end;
            i++;
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int s = 0;
        int e = 0;

        while(s<n){
            if(start[s] < end[e]){
                rooms++;
                s++;
            }else{
                rooms --;
                e++;
            }

            minRooms = Math.max(rooms, minRooms);
        }

        return minRooms;

    }
}
