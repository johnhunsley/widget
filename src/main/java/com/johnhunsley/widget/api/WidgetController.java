package com.johnhunsley.widget.api;

import com.johnhunsley.widget.domain.Widget;
import com.johnhunsley.widget.repository.WidgetCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author John Hunsley
 */
@RestController
@RequestMapping("widgets/")
public class WidgetController {
    @Value("${some.param}")
    private String someParam;

    @Autowired
    private WidgetCrudRepository widgetCrudRepository;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json", value = "/{group}")
    public ResponseEntity<Collection<Widget>> getWidgetsByGroup(@PathVariable final String group) {
        System.out.println("################################# "+someParam);
        return new ResponseEntity<>(widgetCrudRepository.findByGroup(group), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = "application/json", value = "/{group}/{id}")
    public void updateWidget(@PathVariable final String group,
                             @RequestBody final String properties) {
        Widget widget = new Widget(properties+" "+someParam, group);
        widgetCrudRepository.save(widget);
    }
}
