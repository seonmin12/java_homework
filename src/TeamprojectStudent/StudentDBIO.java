package TeamprojectStudent;

public abstract class StudentDBIO extends ObjectIO implements StudentIO {
    private static final StudentDBIO INSTANCE = null;


    public StudentDBIO(){}
    public StudentDBIO getInstance(){
        return INSTANCE;
    }


    
}
