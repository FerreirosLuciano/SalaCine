package Practica;

import java.util.Arrays;

public class P1 {

	public static void main (String[] args) {
		
		int trolaso = 5;
		String vec[] = new String[3];
		String vec2[] = new String[3];
		
		
		System.out.println(vec.length);
		vec2= Arrays.copyOf(vec, vec.length +1);
		System.out.println(vec2.length);
		
	}

}
