public class Exer7{
    public static void main(String[]args){
        double pi=1;
        int i=-1;
        int s=1;
        while(Math.abs(1.0/s)>1e-7){
            s+=2;
            pi+=i*1.0/s;
            i*=-1;
        }
        pi*=4;
        System.out.println(pi);
    } 
}
