package com.AJDG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Appjson {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper om=new ObjectMapper();
		InputStream is=new FileInputStream(new File("E:\\Mulesoft\\jsonreadnwrite.json"));
		TypeReference<List<Model>> tr= new TypeReference<List<Model>>(){};
		List<Model> models = om.readValue(is, tr);
		for(Model m:models)
		{
			System.out.println(m.getFirstname() + m.getLastname() + m.cars[0]);
		}	
		Model mout = new Model();
		mout.setFirstname("jesvith");
		mout.setLastname("poosarla");
		mout.setAge(34);
		mout.setAddress(new Address("12stree","hghghg","hgfhg"));
		mout.setCars(new String[] {"a","b"});
		om.writeValue(new File("E:\\Mulesoft\\personoutjson.json"),mout);
		is.close();
	}
}
