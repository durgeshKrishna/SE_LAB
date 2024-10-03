public class MVCmain {
    public static void main(String[] args) {
        EmpMod model=referencefromDB();
        EmpView view=new EmpView();
        EmpController controller=new EmpController(model,view);
        controller.updateView();
        controller.setName("Sugan");
        controller.updateView();
        
    }
    static EmpMod referencefromDB(){
        EmpMod per1=new EmpMod();
        per1.setName("Durgesh");
        per1.setId("1");
        per1.setDept("CSE");
        return per1;
    }
}
