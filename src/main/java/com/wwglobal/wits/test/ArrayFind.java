package com.wwglobal.wits.test;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;

import com.wwglobal.wits.corews.railreceive.RailReceiveResultWSBean;

import static java.lang.System.out;

public class ArrayFind {
    public static void main(String... args) {
	boolean found = false;
 	Class<?> cls = new ArrayList<RailReceiveResultWSBean>().getClass();
	Field[] flds = cls.getDeclaredFields();
	for (Field f : flds) {
	Class<?> c = f.getType();
	if (c.isArray()) {
	    found = true;
	    out.format("%s%n"
	                       + "           Field: %s%n"
		       + "            Type: %s%n"
		       + "  Component Type: %s%n",
		       f, f.getName(), c, c.getComponentType());
	}
	}
	if (!found) {
	out.format("No array fields%n");
	}
    }
}