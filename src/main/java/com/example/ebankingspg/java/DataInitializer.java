package com.example.ebankingspg.java;

import com.example.ebankingspg.java.model.*;
import com.example.ebankingspg.java.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

import static com.example.ebankingspg.java.model.Admin.*;

@Component
public class DataInitializer implements CommandLineRunner {

    private static final boolean LOAD_INITIAL_DATA = true;
    private static final String ROLE_ADMIN = "ROLE_ADMIN";
    private static final String ROLE_CLIENT = "ROLE_CLIENT";
    private static final String ROLE_CLIENT_MANAGER = "ROLE_CLIENT_MANAGER";
    private static final String ROLE_TRANSACTION_MANAGER = "ROLE_TRANSACTION_MANAGER";

    private final UserService userService;
    private final AdminService adminService;
    private final ClientService clientService;
    private final GestClientService gestClientService;
    private final GestTransacService gestTransacService;
    private final RoleService roleService;


    @Autowired
    public DataInitializer(UserService userService, AdminService adminService, ClientService clientService, GestClientService gestClientService, GestTransacService gestTransacService, RoleService roleService) {
        this.userService = userService;
        this.adminService = adminService;
        this.clientService = clientService;
        this.gestClientService = gestClientService;
        this.gestTransacService = gestTransacService;
        this.roleService = roleService;
    }

    @Override
    public void run(String... args) throws Exception {
        /*
        if(LOAD_INITIAL_DATA){

            Role role_client_manager = Role.builder().role(ROLE_CLIENT_MANAGER).build();
            Role role_client = Role.builder().role(ROLE_CLIENT).build();
            Role role_admin = Role.builder().role(ROLE_ADMIN).build();
            Role role_transaction_manager = Role.builder().role(ROLE_TRANSACTION_MANAGER).build();

            roleService.create(role_admin);
            roleService.create(role_client);
            roleService.create(role_client_manager);
            roleService.create(role_transaction_manager);

            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

            Set<Role> roles = new HashSet<Role>();
            roles.add(roleService.findByRole(ROLE_ADMIN));

            Admin admin = builder().
                    email("admin@gmail.com").
                    password(passwordEncoder.encode("admin")).
                    roles(roles).isValid(true)
                    .firstname("test")
                    .lastname("test")
                    .adress("marrakech")
                    .numtel("642215381")
                    .status("test")
                    .build();

            userService.create(admin);

            Set<Role> roles1 = new HashSet<Role>();
            roles1.add(roleService.findByRole(ROLE_CLIENT));
            Client client = Client.
                    builder()
                    .email("client@gmail.com")
                    .password(passwordEncoder.encode("client"))
                    .isValid(true)
                    .roles(roles1)
                    .adress("marrakech")
                    .firstname("test")
                    .lastname("test")
                    .numtel("642215381")
                    .status("test")
                    .build();
            userService.create(client);

            Set<Role> roles2 = new HashSet<Role>();
            roles2.add(roleService.findByRole(ROLE_CLIENT_MANAGER));
            GestClient clientManager = GestClient.builder()
                    .email("client_manager@gmail.com")
                    .password(passwordEncoder.encode("client_manager"))
                    .isValid(true)
                    .adress("Marrakech")
                    .firstname("test")
                    .lastname("test")
                    .numtel("0642215381")
                    .status("test")
                    .roles(roles2).build();
            userService.create(clientManager);

            Set<Role> roles3 = new HashSet<Role>();
            roles3.add(roleService.findByRole(ROLE_TRANSACTION_MANAGER));
            GestTransac transactionManager = GestTransac.builder().email("transaction_manager@gmail.com").password(passwordEncoder.encode("transaction_manager")).isValid(true).roles(roles3).build();
            userService.create(transactionManager);

        }
    */

    }

}
