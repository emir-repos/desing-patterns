public class EnemyRobotAdapter implements EnemyAttacker{

  EnemyRobot theRobot;

  public EnemyRobotAdapter(EnemyRobot newRobot) {
    theRobot = newRobot;
  }

  @Override
  public void fireWeapon() {
    theRobot.smashWithHands();
  }

  @Override
  public void driveForward() {
    theRobot.walkForward();
  }

  @Override
  public void assignDriver(final String driverName) {
    theRobot.reactToHuman(driverName);
  }
}
