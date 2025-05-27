class Solution {
    public int solution(int n, int k) {
        int freeDrinks = n / 10;
        int payDrinks = k - freeDrinks;
        return (n * 12000) + (payDrinks * 2000);
    }
}