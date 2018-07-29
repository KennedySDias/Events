package br.kennedysdias.data;

public class EventModel {

	private int id;
	private String image;
	private String name;
	private String category;
	private String date;
	private String address;

	public EventModel(int id, String image, String name, String category, String date, String address) {
		this.id = id;
		this.image = image;
		this.name = name;
		this.category = category;
		this.date = date;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
