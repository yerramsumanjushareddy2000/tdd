package com.epam.tddjunit.tddjunit;

public class RemoveA {

	public String remove(String string) {
		if(string.length()==0)
			return string;
		else if (string.length()==1 && string.charAt(0)=='A')
			return "";
		char firstChar=string.charAt(0);
		char secondChar=string.charAt(1);
		if(firstChar=='A' && secondChar=='A'){
			string=string.substring(2);
		}
		else if(firstChar=='A'){
			string=string.substring(1);
		}
		else if(secondChar=='A'){
			string=string.charAt(0)+string.substring(2);
		}
		return string;
	}

}
