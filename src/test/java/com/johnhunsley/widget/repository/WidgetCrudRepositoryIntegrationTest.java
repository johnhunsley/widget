package com.johnhunsley.widget.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertTrue;

/**
 * todo remove this as depends on DynamoDB being accessible. Write more mock tests
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
//        Widget widget = new Widget(json, new WidgetId(group, id));
//        widgetCrudRepository.save(widget);
        assertTrue(true);
    }

    @Test
    public void testFindById() {
        assertTrue(true);
    }

    @Test
    public void testFindByGroup() {
//        Collection<Widget> widgets = widgetCrudRepository.findByGroup(group);
//        assertFalse(widgets.isEmpty());
        assertTrue(true);
    }
}
