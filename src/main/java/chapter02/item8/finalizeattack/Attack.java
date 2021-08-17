package chapter02.item8.finalizeattack;

public class Attack extends SuperAttack{
    static SuperAttack superAttack;
    public Attack(Integer value) {
        super(value);
    }
    public void finalize(){
        superAttack = this;
    }
    public static void main(String[] args) {
        try{
            new Attack(-1);
        }catch (Exception e){
            System.out.println("e = " + e);
        }
        System.gc();
        System.runFinalization();
        System.out.println("superAttack = " + superAttack);
    }
}
