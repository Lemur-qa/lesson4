package beepers;

public class FancyMusic implements Beeper{
    @Override
    public String makeSound() {
        return "Rickroll";
    }
    public String checkArtist(){
        return "Various Artist";
    }

}
