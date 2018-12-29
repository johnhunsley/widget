package com.johnhunsley.widget.repository;

import com.johnhunsley.widget.domain.Widget;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * @author John Hunsley
 */
@Repository
public interface WidgetCrudRepository extends CrudRepository<Widget, Long> {

    Collection<Widget> findByGroup(@Param("group") String group);

}
