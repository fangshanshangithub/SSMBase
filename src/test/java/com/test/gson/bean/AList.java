package com.test.gson.bean;

import java.util.List;

public class AList {
	
	private Apojo apojo;
	
	private List<Bpojo> bpojo;

	public Apojo getApojo() {
		return apojo;
	}

	public void setApojo(Apojo apojo) {
		this.apojo = apojo;
	}

	public List<Bpojo> getBpojo() {
		return bpojo;
	}

	public void setBpojo(List<Bpojo> bpojo) {
		this.bpojo = bpojo;
	}
	
}
