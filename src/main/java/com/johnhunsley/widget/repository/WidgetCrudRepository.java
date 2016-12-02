package com.johnhunsley.widget.repository;

import com.johnhunsley.widget.domain.Widget;
import com.johnhunsley.widget.domain.WidgetId;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * @author John Hunsley
 */
@EnableScan
@RepositoryRestResource(path = "widgets", itemResourceRel = "widget", collectionResourceRel = "widgets")
public interface WidgetCrudRepository extends CrudRepository<Widget, WidgetId> {

    List<Widget> findByGroup(@Param("group") Long group);


}
