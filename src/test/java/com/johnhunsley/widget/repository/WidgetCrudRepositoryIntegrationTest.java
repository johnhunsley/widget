package com.johnhunsley.widget.repository;

import com.johnhunsley.widget.domain.Widget;
import com.johnhunsley.widget.domain.WidgetId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Collection;

import static org.junit.Assert.assertFalse;

/**
 * @author John Hunsley
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class WidgetCrudRepositoryIntegrationTest {

    @Autowired
    private WidgetCrudRepository widgetCrudRepository;

    final Long group = 6565L;
    final String id = "abc-1234-def-5678";
    final String json = "{\"key\":\"dataAttribute1\",\"value\":\"dataValue1\"}";


    @Test
    public void testWrite() {
        Widget widget = new Widget(json, new WidgetId(group, id));
        widgetCrudRepository.save(widget);
    }

    @Test
    public void testFindById() {

    }

    @Test
    public void testFindByGroup() {
        Collection<Widget> widgets = widgetCrudRepository.findByGroup(group);
        assertFalse(widgets.isEmpty());

    }
}
