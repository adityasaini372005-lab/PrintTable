public class PrintTable {
    static void PrintTable(int num, int i){
       if(i==11){
        return;
       }
        PrintTable(num, i+1);
        int res =num*i;
         
        System.out.println( num  +"x" + i+ "="+ res);
      //  tail PrintTable(num, i+1);

    }
    public static void main(String[] args) {
        
        PrintTable(5, 1);
    }
    
}
