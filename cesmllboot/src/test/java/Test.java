public class Test {
    public static void main(String[] args){
            Test test=new Test();
            test.divisorGame(3);
    }
    public boolean divisorGame(int N) {
        return divisorGame(N,1);
    }
    public boolean divisorGame(int N,int order) {
        boolean result=false;
        if(N==1&&order%2==1){
            result= false;
        }else if(N==1&&order%2!=1){
            result= true;
        }else{
            for(int i=1;i<N;i++){
                if(N%i==0){
                    N=N-i;
                    order++;
                    result= divisorGame(N,order);
                    break;
                }else{
                    if(i==N-1&&order%2!=1){
                        result= false;
                    }
                    if(i==N-1&&order%2==1){
                        result= true;
                    }
                }
            }
        }
        return result;
    }
}
