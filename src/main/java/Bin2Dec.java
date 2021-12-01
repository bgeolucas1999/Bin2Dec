/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author georg
 */
public class Bin2Dec {
    public static void main (String[] args){
        
    }    

        public int transformar(String entrada){
            //String entrada;
            int potencia = 0;
            int decimal = 0;
            for(int i = entrada.length()- 1; i>= 0; i--){
            decimal += Math.pow(2, potencia)*
                    Character.getNumericValue(entrada.charAt(i));
                    potencia = i;
            }
            return decimal;
        }
        
        public String autenticacao(String entrada){
            

            boolean aut = false;
            int i;
            if(entrada.length()<8){
                for ( i = 0; i<entrada.length();i++){
                    int ver = Character.getNumericValue(entrada.charAt(i));
                    if (ver == 1 || ver == 0){

                        aut = true;

                    }else{
                        aut = false;
                    }
                }
                if (aut == true){
                   return Integer.toString(transformar(entrada));
                }else{
                    return "ERRO NUMERO NAO BINARIO";
                }
                
            }else{
                return "ERRO LIMITE DE NUMEROS";
            }
        }
        
}
