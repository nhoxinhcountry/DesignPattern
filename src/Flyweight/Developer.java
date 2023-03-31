package Flyweight;
public class Developer implements Employee{
  private final String JOB;
  private String skill ;
  public Developer(){
   JOB = "Fix the issue";
  }
  @Override
 public void assignSkill(String skill){
   this.skill = skill ;
  }
  public void task(){
   System.out.println("Developer with skill: " + this.skill + "with job: " +JOB);
  }

}



