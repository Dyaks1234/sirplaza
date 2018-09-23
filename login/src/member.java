public class member {
    private int id;
    private String FName;
    private String LName;
    private String MName;
    private String NName;
    private String Address;
    private String age;
    private String Gender;
    private String Course;
    private String YLevel;
    private String CStatus;
    private String CSchool;
    
    public member (int ID, String FirstName, String LastName, String MiddleName, String NickName, String Address, String Age, String Gender, String Course, String YearLevel, String CivilStatus ,String CurrentSchool){
        this.id = ID;
        this.FName = FirstName;
        this.MName = MiddleName;
        this.LName = LastName;
        this.NName = NickName;
        this.Address = Address;
        this.age = Age;
        this.Gender = Gender;
        this.Course = Course;
        this.CSchool = CurrentSchool;
        this.YLevel = YearLevel;
        this.CStatus = CivilStatus;
    }
    public int getID(){
        return id;
    }
    public String GetFirstName(){
        return FName;
}
    public String GetLastName(){
        return LName;
}
    public String GetMiddleName(){
        return MName;
}
    public String GetNickName(){
        return NName;
}
    public String GetAddress(){
        return Address;
}
    public String GetCurrentSchool(){
        return CSchool;
}
    public String GetYearLevel(){
        return YLevel;
}
    public String GetAge(){
        return age;
       
}     
     public String GetCourse(){
        return Course;
}   
     public String GetCivilStatus(){
        return CStatus;
}   
     public String GetGender(){
        return Gender;
}
     
 
}
