package arrayListExercise;

public class Customer {
	private String fullName;
	private int score;
	private String superMarketID;
	public Customer(String fullName, int score, String superMarketID) {
		super();
		this.fullName = fullName;
		this.score = score;
		this.superMarketID = superMarketID;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getSuperMarketID() {
		return superMarketID;
	}
	public void setSuperMarketID(String superMarketID) {
		this.superMarketID = superMarketID;
	}
	@Override
	public String toString() {
		return fullName + "\t" + "|" + score + "\t" + "|" + superMarketID;
	}
	
	
}
