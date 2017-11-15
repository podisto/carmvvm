package sn.mas.carmvvm;

import java.util.List;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;

import entities.Car;
import services.CarService;
import services.CarServiceImpl;

public class SearchViewModel {

	private String keyword;
	private List<Car> carList;
	private Car selectedCar;
	
	private CarService carService = new CarServiceImpl();

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public List<Car> getCarList() {
		return carList;
	}

	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}

	public Car getSelectedCar() {
		return selectedCar;
	}

	public void setSelectedCar(Car selectedCar) {
		this.selectedCar = selectedCar;
	}
	
	@Command
	@NotifyChange("carList")
	public void search() {
		carList = carService.search(keyword);
	}

}
