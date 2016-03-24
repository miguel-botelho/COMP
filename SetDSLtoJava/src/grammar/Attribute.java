package grammar;

import java.util.ArrayList;

public class Attribute {
	private String variable;
	private Integer size;
	private Boolean type; // true é INPUT, false é OUTPUT
	private ArrayList<Integer> content;

	public Attribute(String variable, Integer size, Boolean type, ArrayList<Integer> content) {
		this.variable = variable;
		this.size = size;
		this.type = type;
		this.content = content;
	}

	public String getVariable() {
		return variable;
	}

	public Integer getSize(){
		return size;
	}

	public Boolean getType() {
		return type;
	}
	
	public ArrayList<Integer> getContent() {
		return content;
	}
	
	public void setContent(ArrayList<Integer> content) {
		this.content = content;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}

	public void setSize(Integer size) {
	  	this.size = size;
	}

	public void setType(Boolean type){
		this.type = type;
	}

	public boolean equals(Attribute attr) {
        return this.getVariable() == attr.getVariable();
    }
	
	public String toString() {
		return "Var: " + variable + ", Content: " + content.toString() + " ,Size: " + size + "\n";
	}
	
	public ArrayList<Integer> copyContent() {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i = 0; i < this.content.size(); i++) {
			ret.add(this.content.get(i));
		}
		return ret;
	}
}
