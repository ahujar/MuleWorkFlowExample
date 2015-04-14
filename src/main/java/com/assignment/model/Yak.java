package com.assignment.model;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonAutoDetect;


@JsonAutoDetect
@XmlRootElement(name = "labyak")
public class Yak {
	
	private String yakId;

	private Double ageOfYak;

	private String nameOfYak;

	private String sex;

	public String getSex() {
		return sex;
	}

	@XmlAttribute(name = "sex")
	public void setSex(String sex) {
		this.sex = sex;
	}

	public Double getAgeOfYak() {
		return ageOfYak;
	}

	@XmlAttribute(name = "age")
	public void setAgeOfYak(Double ageOfYak) {
		this.ageOfYak = ageOfYak;
	}

	public String getNameOfYak() {
		return nameOfYak;
	}

	@XmlAttribute(name = "name")
	public void setNameOfYak(String nameOfYak) {
		this.nameOfYak = nameOfYak;
	}

	public String getYakId() {
		return yakId;
	}
	
	@XmlAttribute(name = "id")
	public void setYakId(String yakId) {
		this.yakId = yakId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((ageOfYak == null) ? 0 : ageOfYak.hashCode());
		result = prime * result
				+ ((nameOfYak == null) ? 0 : nameOfYak.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result + ((yakId == null) ? 0 : yakId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Yak other = (Yak) obj;
		if (ageOfYak == null) {
			if (other.ageOfYak != null)
				return false;
		} else if (!ageOfYak.equals(other.ageOfYak))
			return false;
		if (nameOfYak == null) {
			if (other.nameOfYak != null)
				return false;
		} else if (!nameOfYak.equals(other.nameOfYak))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (yakId == null) {
			if (other.yakId != null)
				return false;
		} else if (!yakId.equals(other.yakId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Yak [yakId=" + yakId + ", ageOfYak=" + ageOfYak
				+ ", nameOfYak=" + nameOfYak + ", sex=" + sex + "]";
	}

}
