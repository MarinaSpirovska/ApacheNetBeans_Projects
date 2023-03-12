/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spirovska;

/**
 *
 * @author Lenovo
 */
public class Person{
	//class Attributes
	private String first_name="llll";
	public String last_name ="pppp";
	public int ageP = 	18;
	//construct
	public Person(){}
	public Person(int ageP){
		this.ageP=ageP;
	}
	//Setter
	public void setFirst_name(String first_name) {
		this.first_name=first_name;
	}
	//Getter
	public String getFirst_name(){
		return this.first_name;
	}
	//methods
	public void isAdult(int age){
	System.out.println("polnoletstvo");
        //instanca
    }
}