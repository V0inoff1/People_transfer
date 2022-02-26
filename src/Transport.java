public abstract class Transport implements Transferer, Billable {

    private int fuel;

    public Transport (int fuel) {
        this.fuel = fuel;
    }

    public void spendFuel (int fuel){
        this.fuel-=fuel;
    }

   // public abstract void transfer (String name,String from,String to) ;


    @Override
    public void pay(int ammount) {
        System.out.println(" Уплачено в размере " + ammount);
    }
}
