package final_pack;

public class A {
    public void reference() {
        U u = new NestedA();
    }

    public static class NestedA implements U {

        @Override
        public void first() {

        }

        @Override
        public void second() {

        }

        @Override
        public void third() {

        }
    }
}
