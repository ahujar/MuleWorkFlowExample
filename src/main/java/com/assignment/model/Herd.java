package com.assignment.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
@XmlRootElement(name= "herd" )
public class Herd implements Serializable{
	
	private List<Yak> yaks;

	public List<Yak> getYaks() {
		return yaks;
	}
	
	@Override
	public String toString() {
		//return "Herd [yaks=" + yaks + "]";
		return String.format("\n\tHerd:\n\t%s",yaks);
	}

	@XmlElement(name= "labyak")
	public void setYaks(List<Yak> yaks) {
		this.yaks = yaks;
	}
	

}