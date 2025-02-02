// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SAP request to get list of availability zones. */
@Fluent
public final class SapAvailabilityZoneDetailsRequest {
    /*
     * The geo-location where the SAP resources will be created.
     */
    @JsonProperty(value = "appLocation", required = true)
    private String appLocation;

    /*
     * Defines the SAP Product type.
     */
    @JsonProperty(value = "sapProduct", required = true)
    private SapProductType sapProduct;

    /*
     * The database type. Eg: HANA, DB2, etc
     */
    @JsonProperty(value = "databaseType", required = true)
    private SapDatabaseType databaseType;

    /**
     * Get the appLocation property: The geo-location where the SAP resources will be created.
     *
     * @return the appLocation value.
     */
    public String appLocation() {
        return this.appLocation;
    }

    /**
     * Set the appLocation property: The geo-location where the SAP resources will be created.
     *
     * @param appLocation the appLocation value to set.
     * @return the SapAvailabilityZoneDetailsRequest object itself.
     */
    public SapAvailabilityZoneDetailsRequest withAppLocation(String appLocation) {
        this.appLocation = appLocation;
        return this;
    }

    /**
     * Get the sapProduct property: Defines the SAP Product type.
     *
     * @return the sapProduct value.
     */
    public SapProductType sapProduct() {
        return this.sapProduct;
    }

    /**
     * Set the sapProduct property: Defines the SAP Product type.
     *
     * @param sapProduct the sapProduct value to set.
     * @return the SapAvailabilityZoneDetailsRequest object itself.
     */
    public SapAvailabilityZoneDetailsRequest withSapProduct(SapProductType sapProduct) {
        this.sapProduct = sapProduct;
        return this;
    }

    /**
     * Get the databaseType property: The database type. Eg: HANA, DB2, etc.
     *
     * @return the databaseType value.
     */
    public SapDatabaseType databaseType() {
        return this.databaseType;
    }

    /**
     * Set the databaseType property: The database type. Eg: HANA, DB2, etc.
     *
     * @param databaseType the databaseType value to set.
     * @return the SapAvailabilityZoneDetailsRequest object itself.
     */
    public SapAvailabilityZoneDetailsRequest withDatabaseType(SapDatabaseType databaseType) {
        this.databaseType = databaseType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (appLocation() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property appLocation in model SapAvailabilityZoneDetailsRequest"));
        }
        if (sapProduct() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sapProduct in model SapAvailabilityZoneDetailsRequest"));
        }
        if (databaseType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property databaseType in model SapAvailabilityZoneDetailsRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SapAvailabilityZoneDetailsRequest.class);
}
