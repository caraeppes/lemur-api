package com.caraeppes.lemurapi.repository;

import com.caraeppes.lemurapi.model.Lemur;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;


@Repository
@RepositoryRestResource(collectionResourceRel = "lemurs", path = "lemurs")
public interface LemurRepo extends PagingAndSortingRepository<Lemur, Long> {


}
