public class TrappedRainWater{
    public static void ArraysTrappedWater(int height[]){
        int sum=0;
        if(height.length<=2){
            System.out.println("Water can't be trapped.");
        }
        int leftMax[]=new int[height.length];
        int rightMax[]=new int[height.length];
        leftMax[0]=height[0];
        for(int i=1;i<height.length;i++){
            if(leftMax[i-1]>height[i]){
                leftMax[i]=leftMax[i-1];
            }else{
                leftMax[i]=height[i];
            }
            // System.out.println(leftMax[i]);
        }
        rightMax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            if(rightMax[i+1]>height[i]){
                rightMax[i]=rightMax[i+1];
            }else{
                rightMax[i]=height[i];
            }
        }
        for(int i=0;i<height.length;i++){
            int waterlevel=Math.min(leftMax[i],rightMax[i]);
            int trappedWater=waterlevel-height[i];
            if(trappedWater<0){
                trappedWater=0;
            }
            sum=sum+trappedWater;
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        int height[]={4,2,0,6,3,2,5};
        TrappedWater(height);
    }
}