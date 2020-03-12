class OutsideClass {
    private static Integer var = 5;

    private static void print_var() {
        System.out.println(var);
    }

    private static void nested_call_method() {
        NestedOutsideClass nestedOutsideClass = new NestedOutsideClass();

        nestedOutsideClass.call_print_var_nested();
    }

    public static class NestedOutsideClass {
        OutsideClass.NestedOutsideClass nestedOutsideClass = new OutsideClass.NestedOutsideClass();

        public void print_var_nested() {
            var = 4;
            System.out.println(var);
        }

        public void call_print_var_nested() {
            print_var();
        }
    }
}
