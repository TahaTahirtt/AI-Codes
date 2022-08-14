public class Test {
    public static void main(String[] a){
        Environment vacuumCleaner = new Environment();
        System.out.println("Starting Score = " + vacuumCleaner.getScore());
        vacuumCleaner.moveRight();
        System.out.println(vacuumCleaner.getScore());
        vacuumCleaner.moveLeft();
        System.out.println(vacuumCleaner.getScore());
        System.out.println(vacuumCleaner.isDirty(1));
        if(vacuumCleaner.isDirty(1)){
            vacuumCleaner.suck();
            System.out.println("Score After Cleaning = " + vacuumCleaner.getScore());
        }
    }
}
