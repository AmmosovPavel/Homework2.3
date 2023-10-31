public class Organisation {
    public static void main(String[] args) {
        final int PROGRAMMERS = 10;
        final int TESTERS_FOR_1PROGRAMMERS = 2;
        final int SUPPORT_SPEC_FOR_1PROGRAMMERS = 3;
        final int TESTERS_ON_PROJECT = PROGRAMMERS * TESTERS_FOR_1PROGRAMMERS;
        final int SUPPORT_SPEC_ON_PROJECT = PROGRAMMERS * SUPPORT_SPEC_FOR_1PROGRAMMERS;
        final int ALL_SPEC_ON_PROJECT = TESTERS_ON_PROJECT + SUPPORT_SPEC_ON_PROJECT + PROGRAMMERS;

        System.out.println("На проекте задействовано " + PROGRAMMERS + " программистов");
        System.out.println(TESTERS_FOR_1PROGRAMMERS + " тестировщикa необходимо, чтобы протестировать код одного программиста");
        System.out.println(SUPPORT_SPEC_FOR_1PROGRAMMERS + " специалистов поддержки необходимо,чтобы обработать вопросы, возникающие у пользователей по поводу кода, написанного одним программистом");
        System.out.println("На проекте задействовано " + TESTERS_ON_PROJECT + " тестировщиков");
        System.out.println("На проекте задействовано " + SUPPORT_SPEC_ON_PROJECT + " специалистов поддержки");
        System.out.println("Всего на проекте задействовано " + ALL_SPEC_ON_PROJECT + " технических специалистов");
    }
}