// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.compute.models.InstanceSku;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Describes the cloud service role instance. */
@Fluent
public final class RoleInstanceInner {
    /*
     * Resource Id
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Resource Name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Resource Type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Resource Location.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * The role instance SKU.
     */
    @JsonProperty(value = "sku")
    private InstanceSku sku;

    /*
     * Role instance properties.
     */
    @JsonProperty(value = "properties")
    private RoleInstancePropertiesInner properties;

    /**
     * Get the id property: Resource Id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: Resource Name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Resource Type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the location property: Resource Location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Get the sku property: The role instance SKU.
     *
     * @return the sku value.
     */
    public InstanceSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The role instance SKU.
     *
     * @param sku the sku value to set.
     * @return the RoleInstanceInner object itself.
     */
    public RoleInstanceInner withSku(InstanceSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the properties property: Role instance properties.
     *
     * @return the properties value.
     */
    public RoleInstancePropertiesInner properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Role instance properties.
     *
     * @param properties the properties value to set.
     * @return the RoleInstanceInner object itself.
     */
    public RoleInstanceInner withProperties(RoleInstancePropertiesInner properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (properties() != null) {
            properties().validate();
        }
    }
}
