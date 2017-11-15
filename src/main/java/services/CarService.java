package services;

import java.util.List;

import entities.Car;

public interface CarService {
	
	public List<Car> findAll();
	
	public List<Car> search(String keyword);
}
