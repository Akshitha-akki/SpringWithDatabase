package com.Spring.DB;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService 
{
	@Autowired
	private PersonRepository PersonRepo;
	
	//List of All persons details
	public List<Person> PersonList()
	{
		return this.PersonRepo.findAll();
	}
	
	//Add Person details
	public Person AddPerson(Person p)
	{
		return PersonRepo.save(p);
	}
	
	//Search PersonDetails using ID
	public Optional<Person> searchPersonWithId(int personId)
	{
		return PersonRepo.findById(personId);
	}
	
	//delete PersonDetails using ID
	public String removePersondetails(int personId)
	{
		PersonRepo.deleteById(personId);
		return "Deleted Successfully";
	}
		
	//Update
	public Person updatePerson(Person person)
	{
		return PersonRepo.save(person);
	}
	
	
	
	

	
	
}
	
