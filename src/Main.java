import final_pack.A;
import final_pack.B;
import final_pack.U;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<A> aArrayList = new ArrayList<>();
        B b = new B();
        ArrayList<U> arrayList = b.arrayList;

        for(int i = 0; i < 10; i++) {
            U u = new A.NestedA();
            arrayList.add(u);
        }
    }
}
