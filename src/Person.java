public class Person {

        private String firstName; //
        private String lastName; //
        private String gender;
        private boolean leadingActor;
        private boolean director;
        private int age; //
        private String nationality;

 public Person() {
   firstName = "Unassigned";
   lastName = "Unassigned";
   age = 0;
   System.out.println("Initial settings: name - " + firstName + " " + lastName + "; age - " + age);
 }

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }


        //GETTERS
        public String getFName() {
            return this.firstName;
        }

        public String getLName() {
            return this.lastName;
        }

         public int getAge() {
            return this.age;
        }

        public String getGender() {
            return this.gender;
        }

        public boolean getLActor() {
            return this.leadingActor;
        }

        public boolean getDirector() {
            return this.director;
        }

        public String getNationality() {
                return this.nationality;
        }



    //SETTERS
        public void setFName(String firstName) {
            this.firstName = firstName;
        }

        public void setLName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public void setLActor(boolean leadingActor) {
            this.leadingActor = leadingActor;
        }

        public void setDirector(boolean director) {
            this.director = director;
        }

        public void setNationality(String nationality) {
            this.gender = gender;
        }


        public String toString() {
            return "The name of the person is " + this.firstName + " " + lastName +  ". The age of the person is " + this.age + ". " + "Director: " + this.director + ". " + "Leading actor: " + this.leadingActor ;
        }

}
