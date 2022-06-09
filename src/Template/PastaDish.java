package Template;

public abstract class PastaDish {
    public final void makeRecipe(){
//        it's final to not be override and to show consistency between subclasses
//        boilWater();
//        addPaste();
//        cookPasta();
//        drainAndPlate();
//        addSauce()
//        addProtein()
//        addGarnish()
    }
    protected abstract void addPasta();
    protected abstract void addSauce();
    protected abstract void addProtein();
    protected abstract void addGarnish();
    private  void boilWater(){
        System.out.println("boiling water");
    }
}
