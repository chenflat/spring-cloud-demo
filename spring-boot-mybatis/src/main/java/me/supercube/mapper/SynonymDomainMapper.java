package me.supercube.mapper;

import me.supercube.model.SynonymDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by chenping on 2016/10/27.
 */
@Mapper
public interface SynonymDomainMapper {

    @Select("SELECT SYNON.SYNONYMDOMAINID,SYNON.DOMAINID,DOMAIN.DESCRIPTION as DOMAINNAME,SYNON.DESCRIPTION FROM SYNONYMDOMAIN SYNON,SYSDOMAIN DOMAIN WHERE SYNON.DOMAINID=DOMAIN.DOMAINID")
    List<SynonymDomain> findAll();

}
