public class vetclass 
{
    private String doctor;
    private int vetnum;
    private int officenum;
    
    public vetclass(String doctor, int vetnum, int officenum)
    {
        this.doctor = doctor;
        this.vetnum = vetnum;
        this.officenum = officenum;
    }
    public void displayInfo()
    {
        System.out.println("Doctot name: " + doctor+ " vet number: "+ vetnum +" office number: "+ officenum );
    }
    
    
}
