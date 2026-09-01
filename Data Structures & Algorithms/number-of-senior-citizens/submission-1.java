class Solution {
    public int countSeniors(String[] details) {
        int cnt = 0;
        for(String tmp : details){
            if(tmp.length() <= 15)
            {
                int s = Integer.parseInt(tmp.substring(11,13));
                if(s > 60)
                    cnt++;
            }
        }
        return cnt;

    }
}