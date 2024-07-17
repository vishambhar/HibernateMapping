package ManyToMany;

public class Teacher {
	private int t_id;
	private String t_name;
	private String sub;
	
	public Teacher(int t_id, String t_name, String sub) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
		this.sub = sub;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	@Override
	public String toString() {
		return "Teacher [t_id=" + t_id + ", t_name=" + t_name + ", sub=" + sub + "]";
	}
	
	

}
