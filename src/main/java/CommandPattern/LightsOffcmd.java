package CommandPattern;

public class LightsOffcmd implements Command{
  //reference to the light
  Light light;
  public LightsOffcmd(Light light){
    this.light = light;
  }
  public void execute(){
    light.switchOff();
    System.out.println("Light off");
  }
}