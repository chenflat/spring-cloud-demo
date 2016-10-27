package me.supercube.mapper;

import me.supercube.model.Client;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * Created by chenping on 2016/10/27.
 */
@Mapper
public interface ClientMapper {

    @Select("SELECT CLIENTUID, CLIENTID, CLIENTNAME FROM CLIENT")
    List<Client> findAll();

    @Select("SELECT CLIENTUID, CLIENTID, CLIENTNAME FROM CLIENT WHERE CLIENTUID = #{id}")
    Client findById(Long id);

}
