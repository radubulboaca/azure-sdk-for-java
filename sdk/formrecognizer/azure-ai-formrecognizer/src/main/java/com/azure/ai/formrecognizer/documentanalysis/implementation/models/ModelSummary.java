// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** Model summary. */
@Fluent
public class ModelSummary {
    /*
     * Unique model name.
     */
    @JsonProperty(value = "modelId", required = true)
    private String modelId;

    /*
     * Model description.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Date and time (UTC) when the model was created.
     */
    @JsonProperty(value = "createdDateTime", required = true)
    private OffsetDateTime createdDateTime;

    /*
     * API version used to create this model.
     */
    @JsonProperty(value = "apiVersion")
    private String apiVersion;

    /*
     * List of key-value tag attributes associated with the model.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the modelId property: Unique model name.
     *
     * @return the modelId value.
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * Set the modelId property: Unique model name.
     *
     * @param modelId the modelId value to set.
     * @return the ModelSummary object itself.
     */
    public ModelSummary setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * Get the description property: Model description.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Model description.
     *
     * @param description the description value to set.
     * @return the ModelSummary object itself.
     */
    public ModelSummary setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the createdDateTime property: Date and time (UTC) when the model was created.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: Date and time (UTC) when the model was created.
     *
     * @param createdDateTime the createdDateTime value to set.
     * @return the ModelSummary object itself.
     */
    public ModelSummary setCreatedDateTime(OffsetDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the apiVersion property: API version used to create this model.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * Set the apiVersion property: API version used to create this model.
     *
     * @param apiVersion the apiVersion value to set.
     * @return the ModelSummary object itself.
     */
    public ModelSummary setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Get the tags property: List of key-value tag attributes associated with the model.
     *
     * @return the tags value.
     */
    public Map<String, String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: List of key-value tag attributes associated with the model.
     *
     * @param tags the tags value to set.
     * @return the ModelSummary object itself.
     */
    public ModelSummary setTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }
}
