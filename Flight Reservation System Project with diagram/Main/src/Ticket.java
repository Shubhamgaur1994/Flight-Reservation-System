import javax.swing.*;

public class Ticket {
    private String checkstatus;
    private String Duration;
    private String CancelledorConfirmed;
    private int id, Departuretime, Arrivaltime, seatno, Flight;
    private String PNR, Depature, DepatureDate, Arrival, ArrivalDate, PassengerType;
    private Boolean isCancelled;

    public Ticket( String PNR,Boolean isCancelled, String checkstatus, String duration,  int id, int departuretime, int arrivaltime, int seatno, int flight, String depature, String depatureDate, String arrival, String arrivalDate, String passengerType) {
        this.isCancelled = isCancelled;
        this.checkstatus = checkstatus;
        this.Duration = duration;
        this.id = id;
        this.Departuretime = departuretime;
        this.Arrivaltime = arrivaltime;
        this.seatno = seatno;
        this.Flight = flight;
        this.PNR = PNR;
        this.Depature = depature;
        this.DepatureDate = depatureDate;
        this.Arrival = arrival;
        this.ArrivalDate = arrivalDate;
        this.PassengerType = passengerType;
    }

    public String getCheckstatus() {
        return checkstatus;
    }

    public void setCheckstatus(String checkstatus) {
        this.checkstatus = checkstatus;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDeparturetime() {
        return Departuretime;
    }

    public void setDeparturetime(int departuretime) {
        Departuretime = departuretime;
    }

    public int getArrivaltime() {
        return Arrivaltime;
    }

    public void setArrivaltime(int arrivaltime) {
        Arrivaltime = arrivaltime;
    }

    public int getSeatno() {
        return seatno;
    }

    public void setSeatno(int seatno) {
        this.seatno = seatno;
    }

    public int getFlight() {
        return Flight;
    }

    public void setFlight(int flight) {
        Flight = flight;
    }

    public String getPNR() {
        return PNR;
    }

    public void setPNR(String PNR) {
        this.PNR = PNR;
    }

    public String getDepature() {
        return Depature;
    }

    public void setDepature(String depature) {
        Depature = depature;
    }

    public String getDepatureDate() {
        return DepatureDate;
    }

    public void setDepatureDate(String depatureDate) {
        DepatureDate = depatureDate;
    }

    public String getArrival() {
        return Arrival;
    }

    public void setArrival(String arrival) {
        Arrival = arrival;
    }

    public String getArrivalDate() {
        return ArrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        ArrivalDate = arrivalDate;
    }

    public String getPassengerType() {
        return PassengerType;
    }

    public void setPassengerType(String passengerType) {
        PassengerType = passengerType;
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

    public String Ticket() {
        return "Ticket Detail:" +isCancelled()+" , "+getPNR()+" , "+getCheckstatus()+" , "+getArrival()+" , "+getArrivalDate()+" , "+getDepatureDate()+" , "+getDuration()+" , "+getPassengerType()+" , "+getArrivaltime()+" , "+getDeparturetime()+" , "+getFlight()+" , "+getSeatno()+" , "+getId();
    }

    public String PNRStatus() {
        return "PNR Number: " + this.getPNR();
    }


    
}


