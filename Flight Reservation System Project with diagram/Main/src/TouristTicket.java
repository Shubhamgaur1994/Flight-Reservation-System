public class TouristTicket extends Ticket{
    private Boolean isCancelled;
    private String Hoteladdress;
    private String Location;
    private String AddLocation,RemoveLocation;
    public String getHoteladdress() {
        return Hoteladdress;
    }

    public void setHoteladdress(String hoteladdress) {
        Hoteladdress = hoteladdress;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getAddLocation() {
        return AddLocation;
    }

    public void setAddLocation(String addLocation) {
        AddLocation = addLocation;
    }

    public String getRemoveLocation() {
        return RemoveLocation;
    }

    public void setRemoveLocation(String removeLocation) {
        RemoveLocation = removeLocation;
    }

    public TouristTicket(String PNR,Boolean isCancelled,String checkstatus, String duration,  int id, int departuretime, int arrivaltime, int seatno, int flight,  String depature, String depatureDate, String arrival, String arrivalDate, String passengerType, String Hoteladdress, String Location,String AddLocation,String RemoveLocation ) {
        super(PNR,isCancelled, checkstatus, duration, id, departuretime, arrivaltime, seatno, flight, depature, depatureDate, arrival, arrivalDate, passengerType);
        this.isCancelled=isCancelled;
        this.Hoteladdress = Hoteladdress;
        this.Location = Location;
        this.AddLocation=AddLocation;
        this.RemoveLocation=RemoveLocation;
    }
    public String isCancelled() {
        String Str = new String("str1");
        String str1;
        if (isCancelled == true) {
            str1 = "The flight is cancelled";
            return str1;
        }
        if (isCancelled == false) {
            str1 = "The flight is confirmed";
            return str1;
        }
        return Str;
    }
    public String TouristTicket() {
        return "TouristTicket Detail: " +isCancelled()+" , "+getPNR()+" , "+getCheckstatus()+" , "+getArrival()+" , "+getArrivalDate()+" , "+getDepatureDate()+" , "+getDuration()+" , "+getPassengerType()+" , "+getArrivaltime()+" , "+getDeparturetime()+" , "+getFlight()+" , "+getSeatno()+" , "+getId()+" , "+getHoteladdress()+" , "+getLocation()+" , "+getAddLocation()+" , "+getRemoveLocation();
    }


}