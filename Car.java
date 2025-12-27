class Car{
    private String carid;
    private String carname;
    private String carbrand;
    private double basepriceperday;
    private boolean isavailable;

    public Car(String carid, String carname, String carbrand ,double basepriceperday, boolean isavailable ){
        this.carid= carid;
        this.carname= carname;
        this.carbrand=carbrand;
        this.basepriceperday = basepriceperday;
        this.isavailable = true;
    }
    public String getId(){
        return carid;
    }
    public String getName(){
        return carname;
    }
    public String getBrand(){
        return carbrand;
    }
    public double calculatePrice(int rental_days){
        return basepriceperday*rental_days;
    }
    public boolean isavailable(){
        return isavailable;
    }
    public void rent(){
        isavailable = false;
    }
    public void returncar(){
        isavailable = true;
    }
}