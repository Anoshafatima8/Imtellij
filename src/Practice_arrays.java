public class Practice_arrays {
    public static void main(String[] args) {
        float[] marks={34.2f,92.1f,33.f,67.4f,45.2f};
        float sum=0;
       for(float element:marks){
            sum=sum+element;
        }
        System.out.println("The value of sum is:"+sum);

    }
}
