package entity;

import com.sun.beans.introspect.PropertyInfo.Name;

public class ex_35_Manager extends ex_35_Employee{
	private int bonus;
	
	public ex_35_Manager(String name, int salary, int bonus) {
		super(name, salary);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}
	// gaf
	// chao em

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getSalary() {
		return super.getSalary() + bonus;
	}
	@Override
	public void display() {
		System.out.println("Name: " + getName());
		System.out.println("Salary: " + getSalary());
	}
}
