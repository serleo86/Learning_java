/**
 * Created by sbt-panichev-sl on 31.05.2018.
 */
public class Person {
    private String Fname;
    private String Lname;

    public Person (String fn, String ln){
        Fname=fn;
        Lname=ln;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }
}
