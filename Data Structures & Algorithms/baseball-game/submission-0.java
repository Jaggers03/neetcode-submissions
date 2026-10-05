class Solution {
    public int calPoints(String[] operations) {
        List<Integer> scores = new ArrayList<>();

        for(String op : operations){
            int size = scores.size();

            if(op.equals("+")){
                int lastscore = scores.get(size-1);
                int seclastscore = scores.get(size-2);
                scores.add(lastscore + seclastscore);
            }
            else if (op.equals("D")){
                int lastscore = scores.get(size-1);
                scores.add(lastscore * 2);
            }
            else if (op.equals("C")){
                scores.remove(size-1);
            }
            else{
                int newscore = Integer.parseInt(op);
                scores.add(newscore);
            }
        }
        int total = 0;
        for(int score : scores)
        {
            total += score;
        }
        return total;
    }

}