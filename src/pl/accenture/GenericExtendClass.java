package pl.accenture;

public class GenericExtendClass <T extends Dog>{
    public void writeDog(T dog){
        System.out.println(dog.toString());

        if(dog instanceof DogOrigin) System.out.println(((DogOrigin) dog).getOrigin());

        if(dog instanceof DogRace) System.out.println(((DogRace) dog).getRace());

        dog.playWithABall();
        IDog.bark();
    }
}
