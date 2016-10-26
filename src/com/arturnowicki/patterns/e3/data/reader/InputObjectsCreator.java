package com.arturnowicki.patterns.e3.data.reader;

import java.io.BufferedReader;
import java.io.IOException;

import com.arturnowicki.patterns.e3.data.ObjectTypes;
import com.arturnowicki.patterns.e3.data.OrderObject;
import com.arturnowicki.patterns.e3.data.RequestObject;

public class InputObjectsCreator {

	public void parseLines(BufferedReader br) throws IOException {
		String newLine;
		while((newLine = br.readLine()) !=null) {
			newLine = br.readLine();
			if(newLine.startsWith(ObjectTypes.REQUEST.toString())) {
				RequestObject request = new RequestObject(newLine.split(","));
			} else if (newLine.startsWith(ObjectTypes.ORDER.toString())) {
				OrderObject order = new OrderObject(newLine.split(","));
			}
			System.out.println(newLine);
		}
	}
//	
//	private RequestObject createNewRequest(String[] parameters) {
//		return new RequestObject(parameters);
//	}
//	private OrderObject createNewOrder(String[] parameters) {
//		return new OrderObject(parameters);
//	}
}