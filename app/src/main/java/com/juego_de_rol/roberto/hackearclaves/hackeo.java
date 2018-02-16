package com.juego_de_rol.roberto.hackearclaves;



 /*Please dont change class name, Dcoder 
 and class must not be public*/

 //Compiler version JDK 1.8


 public class hackeo{

 	private boolean acertada;
        public hackeo(){
            this.acertada=false;

        }
 	
 	
 	private int contraseña()
 	{
 		int x=(int)(Math.random()*4);
 		return x;
 	}
 	private String revienta(){
            int c=this.contraseña();
            String resultado="";
            
 		if(c==3){


                        resultado="Hackeo exitoso"+"\n"+"Usuario: "+"Admin"+"\n"+"Contraseña: "+this.mostrarClave();
 			this.acertada=true;

 		}
 		if(!this.acertada) resultado="Fracaso en el hackeo";

 		return resultado;
                
 	}
 	private String mostrarClave(){

        String claves="";
        for(int i=0;i<7;i++){

                int n=this.contraseña();
                claves+=n;




        }



        return claves;

 	}
 	public String hackear() {
 		String resultado="";
                    resultado="Iniciando hackeo......"+"\n"+/*this.cosasHacker()+*/"\n"+this.revienta();


        return resultado;
    }
        private String cosasHacker() {
            String resultado="...................................";
            


            resultado+="\n"+"ijahfhqofetfg4rgy6et4hy8r9u4ujhr6u"+"\n";

            resultado+="agfngjklah4j6ay4j894g65h4564j5h4j8"+"\n";

            resultado+="adfh4jh96h8j76sgjh456gh156gf4h64gj"+"\n";

            resultado+="dnsogjnsghet864jh8ryjh98wryj74984j"+"\n";

            resultado+="fgh4gh54y7jy8794ju849jyd4j98yj74y8"+"\n";

            resultado+="shstj489yj489sy4j56h46jh45j4hg54j3"+"\n";

            resultado+="fshth4t89h4g56h456g1h5648t4h8rd6h5"+"\n";

            return  resultado;
           
        }

     public boolean isAcertada() {
         return acertada;
     }
        /*  private void fracaso() throws InterruptedException {
         gestor.escribirLinea("Error");
         Thread.sleep (250);
                      gestor.escribirLinea("Clave no hallada en ningun intento");
                      Thread.sleep (250);
                       gestor.escribirLinea("Boots detectados");
                       Thread.sleep (250);
                        gestor.escribirLinea("Cortando conexion");
                        Thread.sleep (250);
                         gestor.escribirLinea("Conexion cortada");
                         Thread.sleep (250);
    }
        */
 } 