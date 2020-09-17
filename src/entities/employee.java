package entities;

public class employee {
	private Integer id;
	private String name;
	private Double salary;





	public void salaryinc(Double inc) {
		this.salary = ((inc*this.salary)/100)+this.salary;
	}



	public employee(Integer id, String name, Double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}




	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Double getSalary() {
		return salary;
	}



	public void setSalary(Double salary) {
		this.salary = salary;
	}



	public String toString() {
		return "\n|-----------------------|\n"
				+ "employee id=" 
				+ id + "\nname=" 
				+ name + String.format("\nsalary=%.2f",salary);
	}


}
