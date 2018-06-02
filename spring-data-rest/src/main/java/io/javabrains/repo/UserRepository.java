package io.javabrains.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import io.javabrains.model.WebSiteUser;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "Users", path = "Users")
public interface UserRepository extends PagingAndSortingRepository<WebSiteUser, Long> {
    List<WebSiteUser> findByName(@Param("name") String name);
}