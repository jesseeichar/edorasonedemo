package com.edorasware.bootstrap.rest.util;

import com.edorasware.commons.core.entity.WorkObject;
import com.edorasware.one.permission.view.ViewName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the response from a dynamic link REST endpoint (invoked by the dynamic link REST button).
 * <p/>
 * It holds navigation information, describing the target work object and view.
 */
public final class NavigationResponse {
    @JsonProperty
    private final String id;
    @JsonProperty
    private final String type;
    @JsonProperty
    private final String view;

    /**
     * Creates a new navigation response.
     *
     * @param workObject the target work object
     * @param viewName the target view name
     */
    public static NavigationResponse get(WorkObject<?, ?, ?> workObject, ViewName viewName) {
        return new NavigationResponse(
                workObject.getId().getValue(),
                workObject.getType().getName(),
                viewName.getId());
    }
    
    /**
     * Creates a new navigation response.
     *
     * @param id the target work object ID
     * @param type the target work object type
     * @param view the target view name
     */
    private NavigationResponse(String id, String type, String view) {
        this.id = id;
        this.type = type;
        this.view = view;
    }
}
