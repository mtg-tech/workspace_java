class richest_customer{
    public static void main(String[] args) {
        int accounts[][] = {{1,2,3},{3,2,1}};
        int maxi = 0;

        for (int i = 0; i < accounts.length; i++) {
            int  sum=0;
            for (int j = 0; j < accounts[i].length; j++) {

                sum+=accounts[i][j];
                maxi = Math.max(maxi, sum);
            }
           
        }

        System.out.println(maxi);
    }
    
}
