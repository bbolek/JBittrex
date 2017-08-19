package jbittrex.model;

public class Id {

	String uuid;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Override
	public String toString() {
		return "Id [uuid=" + uuid + "]";
	}
}
