public class Main {
    public static void main(String[] args) {
        Surgeon surgeon1 = new Surgeon("Valeriy Bah ","General surgery ", 27);
        Surgeon surgeon2 = new Surgeon("Stanislav Marin ","General surgery ", 6);
        Neurosurgeon neurosurgeon1 = new Neurosurgeon("Gleb Kolchin ",14,112);

        IDoctor[] doctors = {surgeon1,surgeon2,neurosurgeon1};

        for (IDoctor doctor : doctors){
            doctor.getInfo();
            doctor.doWork();
            System.out.println();
        }
    }
}