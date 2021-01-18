public class Flight {
       private int id;
        private String Flightnumber;
        private String AirlineName;
        private int Capacity;
        private int Numberofseatbooked;


    public int getId () {
            return id;
        }

        public void setId ( int id){
            this.id = id;
        }

        public String getFlightnumber () {
            return Flightnumber;
        }

        public void setFlightnumber (String flightnumber){
            Flightnumber = flightnumber;
        }

        public String getAirlineName () {
            return AirlineName;
        }

        public void setAirlineName (String airlineName){
            AirlineName = airlineName;
        }

        public int getCapacity () {
            return Capacity;
        }

        public void setCapacity ( int capacity){
            Capacity = capacity;
        }

        public int getNumberofseatbooked () {
            return Numberofseatbooked;
        }

        public void setNumberofseatbooked ( int numberofseatbooked){
            Numberofseatbooked = numberofseatbooked;
        }

    public Flight( int id, String airlineName, String flightnumber, int Capacity, int Numberofseatbooked) {
        this.id = id;
        this.Capacity = Capacity;
        this.Numberofseatbooked = Numberofseatbooked;
        this.AirlineName = airlineName;
        this.Flightnumber = flightnumber;
    }

    public String Flight() {
        return "Flight Detail: " +this.getId()+" , "+this.getAirlineName()+" , "+this.getFlightnumber()+" , "+this.getCapacity()+" , "+this.getNumberofseatbooked();
    }
    }
