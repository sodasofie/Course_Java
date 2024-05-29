package com.example.fitness.bootstrap;

import com.example.fitness.domain.Memberships;
import com.example.fitness.domain.Users;
import com.example.fitness.repositories.MembershipsRepository;
import com.example.fitness.repositories.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final UsersRepository usersRepository;
    private final MembershipsRepository membershipsRepository;

    public BootStrapData(UsersRepository usersRepository, MembershipsRepository membershipsRepository) {
        this.usersRepository = usersRepository;
        this.membershipsRepository = membershipsRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Users Ann = new Users("Ann", "Anny", "Annah", "2000-01-01", "a@gmail.com", "0111111111", "2020-01-01");
        Memberships A = new Memberships("Fitness", "Active",200.0,"2020-01-02 12:00","2020-01-02 14:00");
        A.setUser(Ann);

        membershipsRepository.save(A);

        System.out.println("Started in Bootstrap");
        System.out.println("idk " + membershipsRepository.count());
    }
}
