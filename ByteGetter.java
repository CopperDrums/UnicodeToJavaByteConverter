import java.lang.Math.*;
import java.lang.StringBuilder;

public class ByteGetter  {
        public static void main(String[] args)  {
                   //сделать таблицу юникода + таблицы кодировок => n - dec какой-то кодировки             
                   int n=208;
                   int k=159;
                   int e=208;
                   int m=181;
                   
                   System.out.println(getByteDecimal(n));
                   System.out.println(getByteDecimal(k));
                   System.out.println(getByteDecimal(e));
                   System.out.println(getByteDecimal(m));
                   //printBinArray(getTwosCompBinary(n));
        }
        
        private static void printBinArray(int[] array)  {
                for (int i=array.length-1; i>=0; i--)  {
                        System.out.print(array[i]);
                }
        }
        
        private static int getByteDecimal(int tableDecimal)  {
                return getTwosCompDecimal(getTwosCompBinary(tableDecimal));
        }
        
        
        
        private static int[] getTwosCompBinary(int number)  {
                int binary[]=new int[log2(number)+1];
                int i=0;
                while (number>0)  {
                        binary[i++]=number%2;
                        number/=2;
                }
                
                if (binary.length%8==0)  {  //should work for >8 bits, not sure about <8 numbers;
                        return binary;
                }
                
                 int[] result=new int[binary.length+1];
                pasteArray(binary, result);
                result[result.length-1]=0;
                return result;
        } 
               
         private static int getTwosCompDecimal(int[] binary)  {
                    double result=-binary[binary.length-1]*Math.pow(2, binary.length-1);
                    for (int i=0; i<binary.length-1; i++)  {
                            result+=binary[i]*Math.pow(2, i);
                    }
                    
                    return (int) result;
        }
        
         private static void pasteArray(int[] array0, int[] array1)  {
                for (int i=0; i<Math.min(array1.length, array0.length); i++)  {
                    array1[i]=array0[i];
                } 
        }
        
      
        //THESE FUNCTIONS ARE NOT USED - AS OF NOW

        private static int[] getTwosComplement(int[] tableBinary)  {
            
                for (int i=0; i<tableBinary.length; i++)  {
                        if (tableBinary[i]==1)  {
                            tableBinary[i]=0;
                        }
                        else  {
                            tableBinary[i]=1;
                        }
                }
                
                return plusOne(tableBinary);
        }
        
        private static int getDecimal(int[] binary)  {
            
                int result=0;
                for (int i=0; i<binary.length; i++)  {
                    result+=Math.pow(2, i);
                }
                return result;
        }
        
        private static int[] plusOne(int[] binary)  {
                if (binary[0]==0)  {
                        binary[0]=1;
                        return binary;
                }
                
                binary[0]=0;
                for (int i=1; i<binary.length; i++)  {
                        if (binary[i]==0)  {
                            binary[i]=1;
                            return binary;
                        }
                        
                        binary[i]=0;
                }
                
                int[] result=new int[binary.length+1];
                pasteArray(binary, result);
                result[result.length]=1;
                return result;
            }
        
      
    
        private static int[] minusOne(int[] binary)  {
                int k=0;
                for (int i=0; i<binary.length; i++)  {
                        if (binary[i]==1)  {
                                k=1;
                                binary[i]=0;
                                return binary;
                        }
                        
                        binary[i]=1;
                }
                
                return binary;
        }        

        private static int log2(int number)  {
                return (int) (Math.log(number)/Math.log(2));
        }
        
        private static String constructString(int[] numbers)  {
                StringBuilder sb=new StringBuilder();
                for (int i=numbers.length-1; i>=0; i--)  {
                        sb.append(numbers[i]);
                }
                return sb.toString();
        }
}
