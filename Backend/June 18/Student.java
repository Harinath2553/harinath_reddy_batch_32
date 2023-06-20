
public class Student {
    private String fn;
    private String ln;
    private double gpa;

    public Student(String fn,String ln,int gpa){
        this.fn=fn;
        this.ln=ln;
        this.gpa=gpa;
    }
    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getLn() {
        return ln;
    }

    public void setLn(String ln) {
        this.ln = ln;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
