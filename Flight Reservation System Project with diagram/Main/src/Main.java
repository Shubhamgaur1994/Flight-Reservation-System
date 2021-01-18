public class Main {
    public static void main(String[] args) {
        // For Ticket PNR//
        Ticket TicketPNRNumber = new Ticket("P12N3R",false,"Delay","1 hour",1,22,23,20,64578,"delhi","18Jan21","Ahmedabad","19Jan21","General");
        System.out.println(TicketPNRNumber.PNRStatus());


        //For calling Other objects like(Ticket,Flight,Passenger,Ticket,Regular Ticket, Tourist Ticket)
        //For that please uncomment the following code
        // For Ticket//
        /*Ticket Ticket = new Ticket("P12N3R",false,"Before Time","1 hour",1,22,23,20,64578,"delhi","18Jan21","Ahmedabad","19Jan21","General");
        System.out.println(Ticket.Ticket());
        // For Regular Ticket//
        RegularTicket RegularTicket = new RegularTicket("P12N3R",false,"Delay","1 hour",1,22,23,20,64578,"delhi","18Jan21","Ahmedabad","19Jan21","General","yes");
        System.out.println(RegularTicket.RegularTicket());
        // For Tourist Ticket//
        TouristTicket TouristTicket = new TouristTicket("P12N3R",false,"On Time","1 hour",1,22,23,20,64578,"delhi","18Jan21","Ahmedabad","19Jan21","General","Radisson Blue","Banglore","Mumbai","Banglore");
        System.out.println(TouristTicket.TouristTicket());
        // For Flight//
        Flight Flight = new Flight(1,"Indigo","6E64578",30,20);
        System.out.println(Flight.Flight());
        //For Passenger//
        Passenger Passenger = new Passenger();
        String passenger =Passenger.Passenger("Ioc Road", "Ahmedabad","Gujarat","shubham","123456789","shubham@gmail.com");
        System.out.println(passenger);*/
    }


}

