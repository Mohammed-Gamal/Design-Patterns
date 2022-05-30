public class Mehanic {
    
    private String car;
    
    public void setCarType(String car) {
        this.car = car;
    }
    
    public void disassembleCar() {
    
        if(car == "Toyota")
            System.out.println("Performimg Toyota algorithm!\n");
        else if(car == "Chevrolet")
            System.out.println("Performing Chevrolet algorithm\n");   
        else if(car == "Honda")
             System.out.println("Performing Honda algorithm\n"); 
        else
            System.out.println("No algorithm for this car!\n");   

        // Other car types could be added here using else if ...
    }

    public static void main(String[] args) {

        Mehanic m = new Mehanic();

        m.setCarType("Toyota");
        m.disassembleCar();

        m.setCarType("Chevrolet");
        m.disassembleCar();

        m.setCarType("Honda");
        m.disassembleCar();
    }
    
}
