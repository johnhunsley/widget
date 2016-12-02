package com.johnhunsley.widget.domain;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;

import java.io.Serializable;

/**
 * @author John Hunsley
 */
@DynamoDBDocument
public class WidgetId implements Serializable {
    private static final long serialVersionUID = 100L;

    @DynamoDBHashKey(attributeName = "group")
    private Long group;

    @DynamoDBRangeKey(attributeName = "id")
    private String id;

    public WidgetId() {}

    public WidgetId(final Long group, final String id) {
        this.group = group;
        this.id = id;
    }

    public Long getGroup() {
        return group;
    }

    public void setGroup(Long group) {
        this.group = group;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WidgetId widgetId = (WidgetId) o;
        if (!getGroup().equals(widgetId.getGroup())) return false;
        return getId().equals(widgetId.getId());
    }

    @Override
    public int hashCode() {
        int result = getGroup().hashCode();
        result = 31 * result + getId().hashCode();
        return result;
    }
}
