package serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.MessageFormat;

public class TestObjSerializeAndDeserialize {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		SerializePerson();
		Person p=DeserializePerson();
		System.out.println(MessageFormat.format("name={0},age={1},sex={2}",p.getName(),p.getAge(),p.getSex()));

	}
	
	private static void SerializePerson()throws FileNotFoundException,IOException {
		Person person=new Person();
		person.setName("wys");
		person.setAge(23);
		person.setSex("男");
		
		ObjectOutputStream oo=new ObjectOutputStream(new 
				FileOutputStream(
						new File("D:/Java/Person.txt")));
		oo.writeObject(person);
		System.out.println("Person对象序列化成功！");
		oo.close();
	}
	
	private static Person DeserializePerson() throws Exception,IOException{
		ObjectInputStream ois=new ObjectInputStream(new
				FileInputStream(
						new File("D:/Java/Person.txt")));
		Person person=(Person)ois.readObject();
		System.out.println("Person对象反序列化成功！");
		return person;
	}

}

