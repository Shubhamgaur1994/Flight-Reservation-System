public class Passenger {

    public static class Address {
        private String street, city, state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }

    public static class Contact {
        private String name, phone, email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

    }

    public String Passenger( String street, String city, String state,String name,String phone,String email) {
        Address Address = new Address(street, city, state);
        Contact Contact = new Contact(name, phone, email);
        return "Passenger Details: "+ street + " , " + city + " , " + state+","+name+" , "+ phone+ " , "+ email;
    }
        }



