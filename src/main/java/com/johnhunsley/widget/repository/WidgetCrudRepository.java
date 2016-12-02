package com.johnhunsley.widget.repository;

import com.johnhunsley.widget.domain.Widget;
import com.johnhunsley.widget.domain.WidgetId;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

/**
 * @author John Hunsley
 */
@EnableScan
public interface WidgetCrudRepository extends CrudRepository<Widget, WidgetId> {

    Collection<Widget> findByGroup(@Param("group") Long group);

}
