public class Main {
    static int getMoneySpent(int keyboards[], int drives[], int budget) {
        int maxSpend = -1;
        for(int key: keyboards) {
            for(int drive: drives ){
                int price = key + drive;
                if (price <= budget) {
                    if (maxSpend < price) {
                        maxSpend = price;
                    }
                }
            }
        }
//        this.maxSpend = maxSpend;
        return maxSpend;
    }
    public static void main (String args []) {
        int keybo
        int value = getMoneySpent([10,12,17], [10, 30, 40], 50);
        System.out.println(value);
    }
}
