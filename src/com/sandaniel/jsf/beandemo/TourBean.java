package com.sandaniel.jsf.beandemo;

import java.util.Objects;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TourBean {

	private String kindOfTour;
	
	public TourBean() {}

	public String getKindOfTour() {
		return kindOfTour;
	}

	public void setKindOfTour(String kindOfTour) {
		this.kindOfTour = kindOfTour;
	}
	
	
	public String startTheTour() {
		
		return this.kindOfTour.equals("city") && !Objects.isNull(kindOfTour) ? "city_tour":"country_tour";
	}
	
}
