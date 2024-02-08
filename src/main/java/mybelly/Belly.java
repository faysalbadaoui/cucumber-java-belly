package mybelly;

public class Belly {

    private int cukes;

    public void eatCukes(int cukes) {
        this.cukes = this.cukes + cukes;
    }

    public String getSound(int waitingTime) {
        if( 0 < cukes && cukes <= 20 && waitingTime <= 1 || waitingTime == 0){
            return "silent";
        }else{
            return "growl";
        }
    }
}
