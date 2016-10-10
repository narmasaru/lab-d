package co.grandcircus.movies.model;

/**
 * Responsibility: Hold weather data for a point in time
 */
public class Weather {

	/**
	 * URL of image depicting weather
	 */
	private String image;
	/**
	 * Temperature in degrees Fahrenheit
	 */
	private Integer temperature;
	private String weather;
	private String firstvalue;

	public String getFirstvalue() {
		return firstvalue;
	}

	public void setFirstvalue(String firstvalue) {
		this.firstvalue = firstvalue;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getTemperature() {
		return temperature;
	}

	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}

}