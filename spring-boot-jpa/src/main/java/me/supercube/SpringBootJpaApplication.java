package me.supercube;

import org.aspectj.apache.bcel.generic.RET;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootJpaApplication {

    @Autowired
    private ClientRepository clientRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaApplication.class, args);
    }


    @RequestMapping(method = RequestMethod.GET)
    public List<Client> home() {
        return clientRepository.findAll();
    }

}


interface ClientRepository extends JpaRepository<Client, Long> {

}

@Entity
class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long clientuid;
    private String clientid;
    private String clientname;

    public long getClientuid() {
        return clientuid;
    }

    public void setClientuid(long clientuid) {
        this.clientuid = clientuid;
    }

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }
}
