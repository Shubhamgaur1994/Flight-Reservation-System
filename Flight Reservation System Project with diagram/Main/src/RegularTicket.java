public class RegularTicket extends Ticket{
    private String Specialservice;
    private Boolean isCancelled;

    public RegularTicket(String PNR,Boolean isCancelled,String checkstatus, String duration, int id, int departuretime, int arrivaltime, int seatno, int flight,  String depature, String depatureDate, String arrival, String arrivalDate, String passengerType,String Specialservice) {
        super(PNR,isCancelled, checkstatus, duration,  id, departuretime, arrivaltime, seatno, flight, depature, depatureDate, arrival, arrivalDate, passengerType);
        this.Specialservice = Specialservice;
        this.isCancelled=isCancelled;
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
    public String getSpecialservice() {
        return Specialservice;
    }

    public void setSpecialservice(String Specicalservice) {
        this.Specialservice = Specicalservice;
    }


    public String RegularTicket() {
        return "RegularTicket Detail:"+isCancelled()+" , "+getPNR()+" , "+getCheckstatus()+" , "+getArrival()+" , "+getArrivalDate()+" , "+getDepatureDate()+" , "+getDuration()+" , "+getPassengerType()+" , "+getArrivaltime()+" , "+getDeparturetime()+" , "+getFlight()+" , "+getSeatno()+" , "+getId()+" , "+getSpecialservice();
    }
}
