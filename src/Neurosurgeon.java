public class Neurosurgeon extends Surgeon{
    private int amountOfSuccessfulSurgeries;

    public Neurosurgeon(String fullName,int experience, int amountOfSuccessfulSurgeries){
        super(fullName,"Neurosurgeon",experience);
        this.amountOfSuccessfulSurgeries = amountOfSuccessfulSurgeries;
    }

    public int getAmountOfSuccessfulSurgeries(){
        return amountOfSuccessfulSurgeries;
    }

    @Override
    public void getInfo(){
        System.out.println(getFullName() +
                " Neurosurgeon "+
                getExperience() + " years of experience "
                + getAmountOfSuccessfulSurgeries() + " Of successful surgeries");
//        return (getFullName() +
//                " Neurosurgeon "+
//                getExperience() + " years of experience "
//                + getAmountOfSuccessfulSurgeries() + " Of successful surgeries");
    }

    @Override
    public void doWork(){
        System.out.println(getFullName() + "doing neurosurgery");
    }



}
