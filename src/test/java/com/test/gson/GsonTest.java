package com.test.gson;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.test.gson.bean.AList;
import com.test.gson.bean.Apojo;
import com.test.gson.bean.Bpojo;

public class GsonTest {

	public static void main(String args[]) {
		Gson gson = new Gson();
		
		Apojo a = new Apojo();
		a.setStr1("aa11");
		a.setStr2("aa22");
		a.setStr3("aa33");
		List<Apojo> list = new ArrayList<Apojo>();
		list.add(a);
		
		AList alist = new AList();
		Bpojo bpojo = new Bpojo();
		bpojo.setStr1("b1");
		bpojo.setStr2("b2");
		bpojo.setStr3("b3");
		List<Bpojo> listb = new ArrayList<Bpojo>();
		listb.add(bpojo);
		listb.add(bpojo);
		alist.setApojo(a);
		alist.setBpojo(listb);
		
		
		//System.out.println(gson.toJson(a));
		//System.out.println(gson.toJson(list));
		System.out.println(gson.toJson(alist));
		
	}
}
