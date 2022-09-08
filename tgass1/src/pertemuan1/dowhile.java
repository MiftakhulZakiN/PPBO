package pertemuan1;

public class dowhile{
    public static void main(String[] args) {
            String nim []= {"2","1","4","1","7","6","2","0","6","7"};        
            int i = 1;  
    do{
        int j =i;
    do{
        if (j == nim.length){
            break;
        }
    
        System.out.print(" ");
        j++;
        
    }while (j <= (nim.length-1));
       int k = 0;
    
    do{
        System.out.print(nim[i-1]);
         k++;
        }while(k <= (i*2) - 2);
        System.out.println(" ");
        i++;
        }while (i <= nim.length);
    
        
    }
}
