package com.johnhunsley.widget.repository;

import com.johnhunsley.widget.domain.Widget;
import com.johnhunsley.widget.domain.WidgetId;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.security.access.prepost.PreAuthorize;

import java.util.Collection;

/**
 * @author John Hunsley
 */
@EnableScan
public interface WidgetCrudRepository extends CrudRepository<Widget, WidgetId> {

    @PreAuthorize("hasPermission('functionalAccess', 'SERVICE_PROVIDER')")
    Collection<Widget> findByGroup(@Param("group") Long group);

}
