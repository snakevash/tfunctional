package fpij;


import java.util.function.Consumer;

/**
 * Author: snake
 * Date: 14-6-23
 * Time: 下午9:29
 */
public class Iteration {
    public static void main(final String[] args) {
        for (int i = 0; i < Folks.friends.size(); i++) {
            System.out.println(Folks.friends.get(i));
        }

        for (String name:Folks.friends){
            System.out.println(name);
        }

        Folks.friends.forEach(new Consumer<String>() {
            @Override
            public void accept(final String s) {
                System.out.println(s);
            }
        });

        Folks.friends.forEach((final String name) -> {
            System.out.println(name);
        });

        Folks.friends.forEach(System.out::print);
    }
}
