import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class MainUser {
    public static void main(String[] args) {
        ArrayList<User> listUser = new ArrayList<>();
        User user1 = new User("Сакович", 25, new Address("Лида", "Кооперативная 26"));
        User user2 = new User("Дышко", 24, new Address("Береза", "Северный Городок 10"));
        User user3 = new User("Зарубин", 15, new Address("Береза", "Северный Городок 5"));
        User user4 = new User("Лазовский", 31, new Address("Москва", "Красная площадь"));
        User user5 = new User("Лазовский", 32, new Address("Москва", "Красная площадь"));

        Collections.addAll(listUser, user1, user2, user3, user4, user5);
        AtomicInteger atomic = new AtomicInteger(0);

        List<NewUser> listNewUser = listUser
                .stream()
                .filter(x -> x.getAge() > 18)
                .map(x -> new NewUser(atomic.incrementAndGet(),x.getName(), x.getAddress().getCity(), x.getAddress().getStreet(), x.getAge()))
                .collect(Collectors.toList());

       listNewUser.forEach(user -> System.out.println(user.getName()));
        Collections.sort(listNewUser, Comparator.comparing(NewUser::getName)
                .thenComparing(NewUser::getAge));
        listNewUser.forEach(user -> System.out.println(user.getName()));


    }
}
