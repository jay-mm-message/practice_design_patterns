package ch02_observer_pattern;

public class test_weather_data {
    public static void main(String [] args) {
        implt_weatherData weatherData = new implt_weatherData();

        implt_current_conditions_display current_conditions_display = 
            new implt_current_conditions_display(weatherData);

        implt_statistics_display statistics_display =
            new implt_statistics_display(weatherData);

        implt_third_party_display third_party_display = 
            new implt_third_party_display(weatherData);

        int update_times = 0;

            update_times++;
            System.out.println("Update: " + Integer.toString(update_times));
            weatherData.setMeasurements(80, 65, 30.4f);

            update_times++;
            System.out.println("Update: " + Integer.toString(update_times));
            weatherData.setMeasurements(82, 70, 29.2f);
            update_times++;
            System.out.println("Update: " + Integer.toString(update_times));
            weatherData.setMeasurements(78, 90, 29.2f);
            
            weatherData.removeObservers(statistics_display);
            update_times++;
            System.out.println("Update: " + Integer.toString(update_times));
            weatherData.setMeasurements(62, 90, 28.1f);
    }
}
