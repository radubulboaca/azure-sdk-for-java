// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.fluent.models.AzureDatabricksDeltaLakeDatasetTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Azure Databricks Delta Lake dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureDatabricksDeltaLakeDataset")
@Fluent
public final class AzureDatabricksDeltaLakeDataset extends Dataset {
    /*
     * Properties specific to this dataset type.
     */
    @JsonProperty(value = "typeProperties")
    private AzureDatabricksDeltaLakeDatasetTypeProperties innerTypeProperties;

    /**
     * Get the innerTypeProperties property: Properties specific to this dataset type.
     *
     * @return the innerTypeProperties value.
     */
    private AzureDatabricksDeltaLakeDatasetTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the table property: The name of delta table. Type: string (or Expression with resultType string).
     *
     * @return the table value.
     */
    public Object table() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().table();
    }

    /**
     * Set the table property: The name of delta table. Type: string (or Expression with resultType string).
     *
     * @param table the table value to set.
     * @return the AzureDatabricksDeltaLakeDataset object itself.
     */
    public AzureDatabricksDeltaLakeDataset withTable(Object table) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureDatabricksDeltaLakeDatasetTypeProperties();
        }
        this.innerTypeProperties().withTable(table);
        return this;
    }

    /**
     * Get the database property: The database name of delta table. Type: string (or Expression with resultType string).
     *
     * @return the database value.
     */
    public Object database() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().database();
    }

    /**
     * Set the database property: The database name of delta table. Type: string (or Expression with resultType string).
     *
     * @param database the database value to set.
     * @return the AzureDatabricksDeltaLakeDataset object itself.
     */
    public AzureDatabricksDeltaLakeDataset withDatabase(Object database) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureDatabricksDeltaLakeDatasetTypeProperties();
        }
        this.innerTypeProperties().withDatabase(database);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() != null) {
            innerTypeProperties().validate();
        }
    }
}
