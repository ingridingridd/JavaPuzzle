/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapuzzle;

import javax.swing.JLabel;

public class SubI {
	JLabel lab;
	int loc;

	/**
	 * @return label value
	 */
	public JLabel getLab() {
		return lab;
	}

	/**
	 * @param lab label value
	 * @param loc location in grid index form parameterized construction
	 */
	public SubI(JLabel lab, int loc) {
		super();
		this.lab = lab;
		this.loc = loc;
	}

	/**
	 * @param lab label value
	 */
	public void setLab(JLabel lab) {
		this.lab = lab;
	}

	/**
	 * default constructor
	 */
	public SubI() {
		super();
	}

	/**
	 * @return location in grid index
	 */
	public int getLoc() {
		return loc;
	}

	/**
	 * @param loc location in grid index
	 */
	public void setLoc(int loc) {
		this.loc = loc;
	}

}
