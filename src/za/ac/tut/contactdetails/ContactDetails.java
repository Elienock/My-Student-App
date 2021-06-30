package za.ac.tut.contactdetails;

public class ContactDetails {
   private String cellNum;
   private String email;

   public ContactDetails(){
       this.cellNum="N/A";
       this.email="N/A";
   }
   public ContactDetails(String cellNum,String email){
       this.cellNum=cellNum;
       this.email=email;
   }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellNum() {
        return cellNum;
    }

    public void setCellNum(String cellNum) {
        this.cellNum = cellNum;
    }
}
