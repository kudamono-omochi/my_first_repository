public class RSA{
    public static void main(String[] args){
        int p = 37;
        int q= 71;
        int e = 79;
        int c = 904;
        int n = p * q;
        int m ;
        for(int i=1;;i++){
            if (i*(p-1)*(q-1)%e==e-1){
                m=i;
                break;
            }
        }
        int d =(m*(p-1)*(q-1)+1)/e;
        //long M = (long)Math.pow(c, d)%n;
        int M=1;
        for(int i=0;i<d;i++){
            M=M*c;
            M=M%n;
        }
        System.out.println(M);
    }
}