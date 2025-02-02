// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.network.fluent.models.WebApplicationFirewallPolicyInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Result of the request to list WebApplicationFirewallPolicies. It contains a list of WebApplicationFirewallPolicy
 * objects and a URL link to get the next set of results.
 */
@Immutable
public final class WebApplicationFirewallPolicyListResult {
    /*
     * List of WebApplicationFirewallPolicies within a resource group.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<WebApplicationFirewallPolicyInner> value;

    /*
     * URL to get the next set of WebApplicationFirewallPolicy objects if there are any.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: List of WebApplicationFirewallPolicies within a resource group.
     *
     * @return the value value.
     */
    public List<WebApplicationFirewallPolicyInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: URL to get the next set of WebApplicationFirewallPolicy objects if there are any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
