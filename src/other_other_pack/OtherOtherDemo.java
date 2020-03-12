package other_other_pack;

import other_pack.Demo;

public class OtherOtherDemo extends Demo {
    private PDemo PDemo;

    public PDemo invoke() {
        PDemo pDemo = (Demo.PDemo) PDemo;
        return pDemo;
    }
}
