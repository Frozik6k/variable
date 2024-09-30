public class Main {
    public static void main(String[] args) {
        // task №1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog +
                " cat = " + cat +
                " paper = " + paper);

        // task №2
        dog += 4;
        cat += 4;
        paper += 4;

        // task №3
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog = " + dog +
                " cat = " + cat +
                " paper = " + paper);

        // task №4
        var friend = 19;
        System.out.println("friend = " + friend);
        friend += 2;
        System.out.println("friend = " + friend);
        friend /= 7;
        System.out.println("friend = " + friend);

        // task №5
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog *= 10;
        System.out.println("frog = " + frog);
        frog /= 3.5;
        System.out.println("frog = " + frog);
        frog += 4;
        System.out.println("frog = " + frog);

        // task №6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println("boxer1 + boxer2 = " + (boxer1+boxer2) );
        System.out.println("boxer2 - boxer1 = " + (boxer2-boxer1) );

        // task №7
        System.out.println("boxer2 % boxer1 = " + (boxer2 % boxer1));

        // task №8
        var allTime = 640;
        var timeEmployee = 8;
        var Employees = allTime / timeEmployee;
        System.out.println("Всего работников в компании - " + Employees + " человек");
        Employees+=94;
        System.out.println("Если в компании работает " + Employees + " человек, то всего " +
                (allTime / Employees) + " часа работы может быть поделено между сотрудниками");



    }
}