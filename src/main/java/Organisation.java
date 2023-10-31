public class Organisation {
    public static void main(String[] args) {
        final int programmers = 10;
        final int testersPerProgrammer = 2;
        final int supportSpecPerProgrammer = 3;
        final int testersOnProject = programmers * testersPerProgrammer;
        final int supportSpecOnProject = programmers * supportSpecPerProgrammer;
        final int allSpecOnProject = testersOnProject + supportSpecOnProject + programmers;

        System.out.println("На проекте задействовано " + programmers + " программистов");
        System.out.println(testersPerProgrammer + " тестировщикa необходимо, чтобы протестировать код одного программиста");
        System.out.println(supportSpecPerProgrammer + " специалистов поддержки необходимо,чтобы обработать вопросы, возникающие у пользователей по поводу кода, написанного одним программистом");
        System.out.println("На проекте задействовано " + testersOnProject + " тестировщиков");
        System.out.println("На проекте задействовано " + supportSpecOnProject + " специалистов поддержки");
        System.out.println("Всего на проекте задействовано " + allSpecOnProject + " технических специалистов");
    }
}