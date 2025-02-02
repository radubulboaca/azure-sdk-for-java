// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Address prefix type. */
public final class AddressPrefixType extends ExpandableStringEnum<AddressPrefixType> {
    /** Static value IPPrefix for AddressPrefixType. */
    public static final AddressPrefixType IPPREFIX = fromString("IPPrefix");

    /** Static value ServiceTag for AddressPrefixType. */
    public static final AddressPrefixType SERVICE_TAG = fromString("ServiceTag");

    /**
     * Creates or finds a AddressPrefixType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AddressPrefixType.
     */
    @JsonCreator
    public static AddressPrefixType fromString(String name) {
        return fromString(name, AddressPrefixType.class);
    }

    /**
     * Gets known AddressPrefixType values.
     *
     * @return known AddressPrefixType values.
     */
    public static Collection<AddressPrefixType> values() {
        return values(AddressPrefixType.class);
    }
}
