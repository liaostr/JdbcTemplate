package com.zenoc.core.interfaces;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface linkTable {
	public String linkField();
	public String to();
}
