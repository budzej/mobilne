public class Kod01 {
    public static void main(String[] args) {
        
        int[] A = new int[10];
        for (int i =0; i <A.length; i++){
            System.out.println(A[i]);
        }
        for (int i =0; i <A.length; i++){
            A[i]=10*i;
        }
        for (int i =0; i <A.length; i++){
            System.out.println(A[i]);
        }
        int[] B = {3,4,5,65,6,7,787,8};
        for (int i=0; i<B.length;i++){
            System.err.println(B[i]);
        }

        String [] C = new String(10);
    }
}
