package me.supercube.web;

import me.supercube.mapper.ClientMapper;
import me.supercube.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by chenping on 2016/10/27.
 */
@RestController
public class ClientController {

    @Autowired
    private ClientMapper clientMapper;


    @RequestMapping(value = "/clients",method = RequestMethod.GET)
    public List<Client> getClients() {
        return clientMapper.findAll();
    }

    @RequestMapping(value = "/clients/{id}", method = RequestMethod.GET)
    public Client getClient(@PathVariable long id) {
        return clientMapper.findById(id);
    }

}
