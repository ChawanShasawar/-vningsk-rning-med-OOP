public class Car implements Vehicle {
    private boolean isRunning;
     private int currentSpeed;

    public Car(boolean isRunning, int currentSpeed){
        this.isRunning = isRunning;
        this.currentSpeed = currentSpeed;

    }

    @Override
    public void start(){
        isRunning = true;
        System.out.println("Bilen är startat");
    }

    @Override
    public void accelerate(){
        if (isRunning){
            currentSpeed =+ 1;
            System.out.println("Bilen är startat");

        }else{
            System.out.println("Starta bilen först");
        }
    }

    @Override
    public void brake(){
        if (isRunning){
            if(currentSpeed>=10){
                currentSpeed -= 10;
                System.out.println("Hastigheten är sänkt med 10km/h");
             }
            
        }else{
            currentSpeed = 0;
            System.out.println("Bilen var inte startad!");
        }

    }

    @Override
    public void stop(){
       if( !isRunning){
        isRunning = false;
        currentSpeed = 0;
         System.out.println("Bilen har stannat");
       }else {
        System.out.println("Bilen var inte startat!");
       }

       }
    
    } 
    



    

