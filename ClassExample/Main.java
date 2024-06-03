public class main {
    
    public static void main(String[] args) {
        
        Car maruti = new Car();
        maruti.color="red";
        maruti.weight=200;
        maruti.accelerate(20);
        maruti.brake();
        System.out.println("Maruti weight = "+maruti.weight);
        System.out.println("maruti color = "+maruti.color);
        Car BMW = new Car();
        BMW.color="blue";
        BMW.weight=500;
        BMW.accelerate(50);
        BMW.brake();
        System.out.println("BMW weight = "+BMW.weight);
        System.out.println("BMW color = "+BMW.color);
    }
}
