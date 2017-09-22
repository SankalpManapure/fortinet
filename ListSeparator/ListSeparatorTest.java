package com.test.fortinet;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fortinet.ListSeparator;

import junit.framework.Assert;


public class ListSeparatorTest {
	
	@Test
	public void elementsInListLessThanK(){
		ListSeparator as = new ListSeparator();
		List<Integer>  ls = new ArrayList<Integer>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		int k = 4;
		as.separate(ls,k);
		Assert.assertEquals(false, as.separate(ls, k));
	}
	
	@Test
	public void canSeparate(){
		ListSeparator as = new ListSeparator();
		List<Integer>  l = new ArrayList<Integer>();
		l.add(3);
		l.add(2);
		l.add(1);
		l.add(1);
		l.add(2);
		int k = 3;
		Assert.assertEquals(true, as.separate(l, k));
	}
	
	@Test
	public void canDivideByK(){
		ListSeparator as = new ListSeparator();
		List<Integer>  l = new ArrayList<Integer>();
		l.add(3);
		l.add(2);
		int k = 3;
		Assert.assertEquals(false, as.separate(l, k));
	}

}
