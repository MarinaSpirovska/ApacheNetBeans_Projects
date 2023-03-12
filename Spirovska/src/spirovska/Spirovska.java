/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spirovska;

/**
 *
 * @author Lenovo
 */
public class Spirovska {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Marina");
        int a=3;
        int b=2;
        int p=a*b;
        System.out.println("p="+p+" m2");
        //Instance
        	Matematika objKM=new Matematika();
				objKM.pPravoagolnik(3,6);
                                objKM.pKruznica(2.0);
                //Fizika objKMSF=new Fizika();
                                //objKMSF.convertCtoF(23);//K=273.15+C
                                //objKMSF.convertFtoC(42);
                Matematika objTA=new Matematika(13.1415);
				objTA.pPravoagolnik(3,6);
                                objTA.pKruznica(2.0);
        //Instance
    Person objBebe = new Person(21);
	System.out.println(objBebe.getFirst_name());//"llll"
	System.out.println(objBebe.last_name);//"pppp"
	objBebe.isAdult(1);

        //Promena na default llll=>Ljubisha
	objBebe.setFirst_name("Ljubisha");
	//pppp=>Popovski
	objBebe.last_name="Popovski";
        
        System.out.println(objBebe.getFirst_name());//Ljubisha
	System.out.println(objBebe.last_name);//Popovski

        //Instance
	Fizika kalitea=new Fizika();
	kalitea.convertCtoF(2.0);
    }
}