// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** RP Rehydration Info. */
@Fluent
public final class RecoveryPointRehydrationInfo {
    /*
     * How long the rehydrated RP should be kept
     * Should be ISO8601 Duration format e.g. "P7D"
     */
    @JsonProperty(value = "rehydrationRetentionDuration")
    private String rehydrationRetentionDuration;

    /*
     * Rehydration Priority
     */
    @JsonProperty(value = "rehydrationPriority")
    private RehydrationPriority rehydrationPriority;

    /**
     * Get the rehydrationRetentionDuration property: How long the rehydrated RP should be kept Should be ISO8601
     * Duration format e.g. "P7D".
     *
     * @return the rehydrationRetentionDuration value.
     */
    public String rehydrationRetentionDuration() {
        return this.rehydrationRetentionDuration;
    }

    /**
     * Set the rehydrationRetentionDuration property: How long the rehydrated RP should be kept Should be ISO8601
     * Duration format e.g. "P7D".
     *
     * @param rehydrationRetentionDuration the rehydrationRetentionDuration value to set.
     * @return the RecoveryPointRehydrationInfo object itself.
     */
    public RecoveryPointRehydrationInfo withRehydrationRetentionDuration(String rehydrationRetentionDuration) {
        this.rehydrationRetentionDuration = rehydrationRetentionDuration;
        return this;
    }

    /**
     * Get the rehydrationPriority property: Rehydration Priority.
     *
     * @return the rehydrationPriority value.
     */
    public RehydrationPriority rehydrationPriority() {
        return this.rehydrationPriority;
    }

    /**
     * Set the rehydrationPriority property: Rehydration Priority.
     *
     * @param rehydrationPriority the rehydrationPriority value to set.
     * @return the RecoveryPointRehydrationInfo object itself.
     */
    public RecoveryPointRehydrationInfo withRehydrationPriority(RehydrationPriority rehydrationPriority) {
        this.rehydrationPriority = rehydrationPriority;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
