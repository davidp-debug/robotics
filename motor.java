class motorSpeed
{   
    public float getSpeed(float maxTime,float distanceToTravel)
    {  
        float speed = distanceToTravel / maxTime;
        return speed;
    }
}

class status
{
    public String isRunning(float speed)
    {
        boolean running = speed>0;
        String runner = "bob";
        if(running == true)
        {
            runner = "RUNNING";
        }
        else
        {
            runner = "STOPPED";
        };
        return runner;
    }
}

public class motor
{
public static void main(String a[])
{
    System.out.println("_____Motor 1 Interface_____");
    System.out.println("Model name: Kraken x60");
       
        int motorID = 30;
    System.out.println("Motor ID: " + motorID);
        
        int maxRPM = 800;
    System.out.println("Max RPM: " + maxRPM);
    System.out.println("___________________________");
    
        float maxTime = 3;
        float distanceToTravel = 10;
        motorSpeed mS = new motorSpeed();
        float speed =mS.getSpeed(maxTime, distanceToTravel);
    System.out.print("Motor speed: ");
    System.out.print(speed);
    System.out.println(" kph");

    status run = new status();
    String runner = run.isRunning(speed);
    System.out.print("Motor status: ");
    System.out.println(runner);
    System.out.println("___________________________");
    if(runner.equals ("STOPPED"))
    {
        System.out.println("KRAKEN x60 is stopped. Enter distance to travel and max time before motor will run.");
        System.out.println("KRAKEN x60 motor stopped.");
        System.out.println("KRAKEN x60 speed = 0.00 kph");
    }
    else
    {
        System.out.println("KRAKEN x60 is moving. Motor information below.");
        System.out.println("KRAKEN x60 motor moving.");
        System.out.print("KRAKEN x60 speed = " + speed);
        System.out.println(" kph");
    };
}
}