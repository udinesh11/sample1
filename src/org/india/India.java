package org.india;

import org.tamilnadu.Tamilnadu;

//Q 4 ...4 packages combine with multilevel inheritance

public class India extends Tamilnadu{
public void india() {
	System.out.println("India has diverse languages in various region");

}
public static void main(String[] args) {
	India i=new India();
	i.india();
	i.tamilLanguage();
	i.telugu();
	i.malayalam();
}
}
