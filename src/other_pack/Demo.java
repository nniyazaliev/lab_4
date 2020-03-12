package other_pack;
import prog_lang.Transports;

public class Demo {
    protected static class PDemo implements Transports {
        Transports transports = new PDemo();

        @Override
        public void show() {
            System.out.println(CAR);
        }

        public Transports getTransports() {
            System.out.println(transports.SHIP);
            return transports;
        }

        public void nestedClass() {
            class Nested {
                private Transports transports = new PDemo();

                public Transports getTransports() {
                    System.out.println(transports.AIRPLANE);
                    return transports;
                }
            }
        }
    }
}
