package me.supercube.web;

import me.supercube.mapper.SynonymDomainMapper;
import me.supercube.model.SynonymDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by chenping on 2016/10/27.
 */
@RestController
public class SysdomainController {


    @Autowired
    private SynonymDomainMapper synonymDomainMapper;


    @RequestMapping(value = "/domains", method = RequestMethod.GET)
    public List<SynonymDomain> getSynonymDomains() {
        return synonymDomainMapper.findAll();
    }

}
