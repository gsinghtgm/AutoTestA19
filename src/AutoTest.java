import java.awt.Color;

import org.junit.*;

import static org.junit.Assert.*;
//git@github.com:gsinghtgm/AutoTestA19.git
public class AutoTest {
	private Auto a2;
	
	@Test
	public void testAuto1(){
		Auto a = new Auto();
		a.setType("Fiat");
		String t = a.getType();
		if(!t.equals("Fiat")){
			Assert.fail("Das ist kein Fiat!");
		}
	}
	@Test
	public void testAuto2(){
		Auto a = new Auto();
		a.setFarbe(Color.black);
		Color c = a.getFarbe();
		if(!c.equals(Color.black)){
			Assert.fail("Falsche farbe");
		}
		System.out.println(a.toString());
	}
		@Test
		public void testAuto3(){
			Auto a = new Auto();
			a.setLeistung(88);
			int l = a.getLeistung();
			if(l!=88){
				Assert.fail("Fail");
			}
		}
		@Test
		public void testAuto4(){
			Auto a = new Auto();
			a.setType(null);
			System.out.println(a.toString());
		}
	@After
	public void afterMethode(){
		System.out.println("Methode afterMethode");
	}
	
	@Test
	public void testAutoname(){
		System.out.println("Methode testKonstruktorname");
		assertEquals("Konstruktor passt nicht", "Huso", a2.getType());
	}
	public static void main(String[] args) {
		AutoTest a1 = new AutoTest();
		a1.testAuto2();
	}
}