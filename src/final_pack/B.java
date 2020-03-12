package final_pack;

import java.util.ArrayList;

public class B {
    public ArrayList<U> arrayList = new ArrayList<>();

    public void createArray() {
        for(int i = 0; i < 10; i++) {
            U u = new A.NestedA();
            arrayList.add(u);
        }
    }

    public void referenceToNull(Integer index) {
        U i = arrayList.set(index, null);
    }

    public void moveToArray() {
        for(int i = 0; i < 10; i++) {
            U u = arrayList.get(i);
            u.first();
        }
    }
}
