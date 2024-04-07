package org.ddiachenko.service;

import org.ddiachenko.dao.PlanetDaoImpl;
import org.ddiachenko.entity.Planet;

public class PlanetCrudService {

    private final PlanetDaoImpl planetDao = new PlanetDaoImpl();

    public boolean createClient(Planet planet){
        return planetDao.createPlanet(planet);
    }

    public Planet findClientById(Long id){
        return planetDao.getPlanetById(id);
    }

    public boolean updateClient(Planet planet){
        return planetDao.updatePlanet(planet);
    }

    public void deleteClient(Long id){
        planetDao.deletePlanetById(id);
    }
    
}