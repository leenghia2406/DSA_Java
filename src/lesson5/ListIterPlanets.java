package lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Random;

public class ListIterPlanets {
	private static ListIterator<Planet> li;
	private int size = 0;
	public ListIterPlanets(Planet[]arr) {
		this.li = Arrays.asList(arr).listIterator();
		this.size = arr.length;
	}
	public static void refresh() {
		while (li.hasPrevious()) {
			li.previous();
		}
	}
	@Override
	public String toString() {
		refresh();
		String result = "";
		while (li.hasNext()) {
			result += li.next() + "\n";
		}
		return result;
	}
	public Planet findInfoPlanetByViName(String vietnamName) {
		refresh();
		Planet result = null;
		while(li.hasNext()) {
			Planet temp = li.next();
			if (temp.getVietnamName().equalsIgnoreCase(vietnamName)) { 
				result = temp;
			}
		}
		return result;
	}
	public Planet findInfoPlanetByEngName(String engName) {
		refresh();
		Planet result = null;
		while(li.hasNext()) {
			Planet temp = li.next();
			if (temp.getEnglishName().equalsIgnoreCase(engName)) { 
				result = temp;
			}
		}
		return result;
	}
	public boolean isContainEnglishName(String engName) {
		refresh();
		while (li.hasNext()) {
			if (li.next().getEnglishName().equals(engName)) {
				return true;
			}
		}
		return false;
	}
	public Planet findMaxArea() {
	    refresh();
	    double maxArea = li.next().getArea();
	    Planet result = null;
	    while (li.hasNext()) {
	        Planet currentPlanet = li.next();
	        if (currentPlanet.getArea() > maxArea) {
	            maxArea = currentPlanet.getArea();
	            result = currentPlanet;
	        }
	    }
	    return result;
	}
	public Planet findMaxWeight() {
		refresh();
		double maxWeight = li.next().getWeight();
		Planet result = null;
		while (li.hasNext()) {
			Planet currentPlanet = li.next();
			if (currentPlanet.getWeight() > maxWeight) {
				maxWeight = currentPlanet.getWeight();
				result = currentPlanet;
			}
		}
		return result;
	}
	
	
	public Planet findMaxChuky() {
		refresh();
		double maxCK = li.next().getChuKy();
		Planet result = null;
		while (li.hasNext()) {
			Planet com = li.next();
			double newCK = com.getChuKy();
			if (maxCK < newCK) {
				maxCK = newCK;
				result = com;
			}
		}
		return result;
	}
	public Planet getRandomPlanet() {
		refresh();
		Random ran = new Random();
		int ranNum = ran.nextInt(size);
		int step = 0;
		Planet result = null;
		while (step < ranNum) {
			if (li.hasNext()) {
				result = li.next();
			}
			step++;
		}
		return result;
	}

	public static void main(String[] args) {
		Planet mercury = new Planet("Sao Thủy", "Mercury", 1407.6, 4879, 0.330);
		Planet venus = new Planet("Sao Kim", "Venus", 5832.5, 12104, 4.87);
		Planet earth = new Planet("Trái Đất", "Earth", 23.9, 12756, 5.97);
		Planet mars = new Planet("Sao Hỏa", "Mars", 24.6, 6792, 0.642);
		Planet jupiter = new Planet("Sao Mộc", "Jupiter", 9.9, 142984, 1898);
		Planet saturn = new Planet("Sao Thổ", "Saturn", 10.7, 120536, 568);
		Planet uranus = new Planet("Sao Thiên Vương", "Uranus", 17.2, 51118, 86.8);
		Planet neptune = new Planet("Sao Hải Vương", "Neptune", 16.1, 49528, 102);
		Planet[] planets = {mercury, venus, earth, mars, jupiter, saturn, uranus, neptune};
	    ListIterPlanets ltsPlan = new ListIterPlanets(planets);
	    System.out.println(ltsPlan);
	    System.out.println(ltsPlan.findInfoPlanetByViName("Sao Mộc"));
	    System.out.println(ltsPlan.findInfoPlanetByEngName("Sao Mộc"));
	    System.out.println(ltsPlan.getRandomPlanet());
	    System.out.println(ltsPlan.findMaxChuky());
	    System.out.println(ltsPlan.findMaxArea());
	    System.out.println(ltsPlan.findMaxWeight());
	}
}
