public class Surgeon implements IDoctor {
    private String fullName;
    private String specialization;
    private int experience;


    public Surgeon(String fullName, String specialization, int experience){
        this.fullName = fullName;
        this.specialization = specialization;
        this.experience = experience;
    }


    @Override
    public String getFullName(){
        return fullName;
    }

    @Override
    public String getSpecialization(){
        return specialization;
    }

    @Override
    public int getExperience(){
        return experience;
    }

    @Override
    public void getInfo(){
        System.out.println(fullName + specialization + experience + " years of experience");
        //return (fullName + specialization + experience + " years of experience");
    }

    @Override
    public void doWork(){
        System.out.println(fullName + "doing the surgery ");
    }
}

