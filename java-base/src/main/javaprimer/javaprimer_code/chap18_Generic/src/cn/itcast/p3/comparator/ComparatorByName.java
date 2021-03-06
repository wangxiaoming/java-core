package org.alpha.javabase.javaprimer.javaprimer_code.chap18_Generic.src.cn.itcast.p3.comparator;

import java.util.Comparator;

import org.alpha.javabase.javaprimer.javaprimer_code.chap18_Generic.src.cn.itcast.p2.bean.Person;

public class ComparatorByName implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		
		int temp = o1.getName().compareTo(o2.getName());
		return temp==0? o1.getAge()-o2.getAge(): temp;
	}

}
