// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

import com.azure.core.util.Context;

/** Samples for ManagementLocks Delete. */
public final class ManagementLocksDeleteSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Authorization/stable/2017-04-01/examples/ManagementLocks_DeleteAtResourceGroupLevel.json
     */
    /**
     * Sample code: Delete management lock at resource group level.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteManagementLockAtResourceGroupLevel(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .genericResources()
            .manager()
            .managementLockClient()
            .getManagementLocks()
            .deleteWithResponse("resourcegroupname", "testlock", Context.NONE);
    }
}
