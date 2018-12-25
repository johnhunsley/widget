package com.johnhunsley.widget.repository;

import com.johnhunsley.widget.domain.Widget;
import com.johnhunsley.widget.domain.WidgetId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * @author John Hunsley
 */
@Repository
public interface WidgetCrudRepository extends CrudRepository<Widget, WidgetId> {

    Collection<Widget> findByGroup(@Param("group") Long group);

}
