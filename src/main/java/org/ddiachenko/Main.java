package org.ddiachenko;


import org.ddiachenko.entity.Client;
import org.ddiachenko.service.ClientCrudService;
import org.ddiachenko.service.PlanetCrudService;
import org.ddiachenko.utils.DatabaseMigrationService;

public class Main {

    public static void main(String[] args) {

        DatabaseMigrationService.doMigrate();

        ClientCrudService clientCrudService = new ClientCrudService();
        PlanetCrudService planetCrudService = new PlanetCrudService();

        String name = "Client 11";
        Client client1 = new Client();
        client1.setName(name);
        clientCrudService.createClient(client1);


    }
}