public class Movie {
    private String movieName;
    private int year;
    private double money;
    private boolean director;
    private String LMaleActor;
    private String LFemaleActor;
    private boolean oscar;
    private int numOscar;

    public Movie() {
        movieName = "Unassigned";
        System.out.println("Initial settings: movie name - " + movieName);
    }

    public Movie(String movieName, int year, boolean director) {
        this.movieName = movieName;
        this.year = year;
        this.director = director;
    }


    //GETTERS
    public String getMovieName() {
        return this.movieName;
    }

    public int getYear() {
        return this.year;
    }

    public double getMoney() {
        return this.money;
    }

    public boolean getDirector() {
        return this.director;
    }

    public String getLMaleActor() {
        return this.LMaleActor;
    }

    public String getLFemaleActor() {
        return this.LFemaleActor;
    }

    public boolean getOscar() {
        return this.oscar;
    }

    public int getNumOscar() {
        return this.numOscar;
    }

//SETTERS 1

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setYear(int yea) {
        this.year = year;
    }

    public void setMoney(double money) {
      this.money = money;
    }

    public void setDirector(boolean director) {
        this.director = director;
    }

    public void setLMaleActor(String LMaleActor) {this.LMaleActor = LMaleActor;
    }

    public void setLFemaleActor(String LFemaleActor) {this.LFemaleActor = LFemaleActor;
    }

    public void setOscar(boolean oscar) {
        this.oscar = oscar;
    }

    public void setNumOscar(int numOscar) {
        this.numOscar = numOscar;
    }




    public String toString() {
        return this.movieName + " Year: " + year +  ". Director: " + this.director + ". Leading Male: " + this.LMaleActor + ". Leading Female: " + this.LFemaleActor + ". Earnings: " + money + "USD dollars. Number of Oscars: " + numOscar ;
    }


}
