package com.johnhunsley.widget.domain;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonRawValue;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * @author John Hunsley
 */
@DynamoDBTable(tableName = "widget")
public class Widget implements Serializable {
    private static final long serialVersionUID = 100L;

    @Id
    @DynamoDBIgnore
    @JsonIgnore
    private WidgetId widgetId;

    @JsonRawValue
    @DynamoDBAttribute(attributeName = "properties")
    private String properties;

    public Widget() {}

    public Widget(String properties, WidgetId widgetId) {
        this.properties = properties;
        this.widgetId = widgetId;
    }

    @DynamoDBHashKey(attributeName = "group")
    public Long getGroup() {
        return widgetId != null ? widgetId.getGroup() : null;
    }

    public void setGroup(final Long group) {
        if(widgetId == null) widgetId = new WidgetId();
        widgetId.setGroup(group);
    }

    @DynamoDBRangeKey(attributeName = "id")
    public String getId() {
        return widgetId != null ? widgetId.getId() : null;
    }

    public void setId(final String id) {
        if(widgetId == null) widgetId = new WidgetId();
        widgetId.setId(id);
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Widget widget = (Widget) o;
        return !(widgetId != null ? !widgetId.equals(widget.widgetId) : widget.widgetId != null);
    }

    @Override
    public int hashCode() {
        return widgetId != null ? widgetId.hashCode() : 0;
    }
}
