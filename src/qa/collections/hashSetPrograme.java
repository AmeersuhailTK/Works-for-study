package qa.collections;

import java.lang.foreign.AddressLayout;
import java.util.HashSet;
import java.util.Iterator;

import javax.print.DocFlavor.STRING;

import org.w3c.dom.NamedNodeMap;

import qa.loop.forEach;

public class hashSetPrograme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<STRING> nameset = new HashSet<>();
		nameset.add(null);
		nameset.add(null);
		nameset.add(null);
		nameset.add(null);
		
		
		
		System.out.println(nameset);
		
		
		for(STRING name : nameset);{
		System.out.println(nameset);
		}
		
//		Iterator<String> nameIterator = nameset.iterator(){
//			while (nameset.hasNext()) {
//				System.out.println(name.next);}
//				
			}
		
		
			
			

	}


