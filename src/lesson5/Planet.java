package lesson5;

public class Planet {
	private String vietnamName;
	private String englishName;
	private double chuKy;
	private double area;
	private double weight;
	public Planet(String vietnamName, String englishName, double chuKy, double area, double weight) {
		super();
		this.vietnamName = vietnamName;
		this.englishName = englishName;
		this.chuKy = chuKy;
		this.area = area;
		this.weight = weight;
	}
	public String getVietnamName() {
		return vietnamName;
	}
	public void setVietnamName(String vietnamName) {
		this.vietnamName = vietnamName;
	}
	public String getEnglishName() {
		return englishName;
	}
	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}
	public double getChuKy() {
		return chuKy;
	}
	public void setChuKy(double chuKy) {
		this.chuKy = chuKy;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Planet: Ten tieng viet " + vietnamName + " - Ten tieng Anh: " + englishName + " - Chu ki: " + chuKy + " - Dien tich: "
				+ area + " - Khoi luong: " + weight;
	}
	public static void main(String[] args) {
			Planet mercury = new Planet("Sao Thủy", "Mercury", 1407.6, 4879, 0.330);
			Planet venus = new Planet("Sao Kim", "Venus", -5832.5, 12104, 4.87);
			Planet earth = new Planet("Trái Đất", "Earth", 23.9, 12756, 5.97);
			Planet mars = new Planet("Sao Hỏa", "Mars", 24.6, 6792, 0.642);
			Planet jupiter = new Planet("Sao Mộc", "Jupiter", 9.9, 142984, 1898);
			Planet saturn = new Planet("Sao Thổ", "Saturn", 10.7, 120536, 568);
			Planet uranus = new Planet("Sao Thiên Vương", "Uranus", -17.2, 51118, 86.8);
			Planet neptune = new Planet("Sao Hải Vương", "Neptune", 16.1, 49528, 102);

			System.out.println(mercury);
			System.out.println(venus);
			System.out.println(earth);
			System.out.println(mars);
			System.out.println(jupiter);
			System.out.println(saturn);
			System.out.println(uranus);
			System.out.println(neptune);
	}
}
