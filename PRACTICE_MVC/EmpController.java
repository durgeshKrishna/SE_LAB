public class EmpController {
    EmpMod model;
    EmpView view;
    public EmpController(EmpMod model,EmpView view){
        this.model=model;
        this.view=view;
    }
    public void setName(String name){
            model.setName(name);
    }
    public void updateView(){
        view.print(model.getName(),model.getId(),model.getDept());        
    }
}
