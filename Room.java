package module5.homeOrk1and2;

import java.util.GregorianCalendar;
import java.util.Objects;

public class Room {
    long id;
    int price;
    int persons;
    GregorianCalendar dateAvailableFrom;
    String hotelName;
    String cityName;



    public Room(long id, int price, int persons,
                int fromYear, int fromMonth, int fromDate,
                String hotelName, String cityName) {
        this. id = id;
        this.price = price;
        this.persons = persons;
        this.dateAvailableFrom = new GregorianCalendar(fromYear, fromMonth, fromDate);
        this.hotelName = hotelName;
        this.cityName = cityName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        return price == room.price && persons == room.persons
                && Objects.equals(cityName, room.cityName);

    }

    @Override
    public int hashCode() {
        return Objects.hash(price, persons, cityName);
    }

    @Override
    public String toString(){
        return "Room { " +
                this.id + " " +
                this.price + " " +
                this.persons + " " +
                this.hotelName + " " +
                this.cityName + " " +
                ")";
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public GregorianCalendar getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public void setDateAvailableFrom(GregorianCalendar dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}



