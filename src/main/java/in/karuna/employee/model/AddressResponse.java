package in.karuna.employee.model;

public class AddressResponse {
	
	private int id;
	private String lane1;
	private String state;
	private long zip;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLane1() {
		return lane1;
	}
	public void setLane1(String lane1) {
		this.lane1 = lane1;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getZip() {
		return zip;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}

}


