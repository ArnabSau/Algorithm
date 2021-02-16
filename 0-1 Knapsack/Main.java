public class Main {

   public static void main(String[] args) {
	int profit[]={60, 100, 120};
	int weight[]={10, 20, 30};
	int maxWeight=50;
	System.out.println(knapsack(profit,weight,maxWeight,profit.length));
    }
   static int knapsack(int profit[],int weight[],int maxWeight,int n){
        if(n==0||maxWeight==0){
            return 0;
        }
        if(weight[n-1]>maxWeight){
            return knapsack(profit,weight,maxWeight,n-1);
        }else{
            return Math.max((profit[n-1]+knapsack(profit,weight,maxWeight-weight[n-1],n-1)),knapsack(profit,weight,maxWeight,n-1));
        }
    }
}
