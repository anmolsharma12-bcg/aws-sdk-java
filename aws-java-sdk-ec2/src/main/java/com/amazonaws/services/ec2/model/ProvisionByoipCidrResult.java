/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionByoipCidrResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the address range.
     * </p>
     */
    private ByoipCidr byoipCidr;

    /**
     * <p>
     * Information about the address range.
     * </p>
     * 
     * @param byoipCidr
     *        Information about the address range.
     */

    public void setByoipCidr(ByoipCidr byoipCidr) {
        this.byoipCidr = byoipCidr;
    }

    /**
     * <p>
     * Information about the address range.
     * </p>
     * 
     * @return Information about the address range.
     */

    public ByoipCidr getByoipCidr() {
        return this.byoipCidr;
    }

    /**
     * <p>
     * Information about the address range.
     * </p>
     * 
     * @param byoipCidr
     *        Information about the address range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionByoipCidrResult withByoipCidr(ByoipCidr byoipCidr) {
        setByoipCidr(byoipCidr);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getByoipCidr() != null)
            sb.append("ByoipCidr: ").append(getByoipCidr());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionByoipCidrResult == false)
            return false;
        ProvisionByoipCidrResult other = (ProvisionByoipCidrResult) obj;
        if (other.getByoipCidr() == null ^ this.getByoipCidr() == null)
            return false;
        if (other.getByoipCidr() != null && other.getByoipCidr().equals(this.getByoipCidr()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getByoipCidr() == null) ? 0 : getByoipCidr().hashCode());
        return hashCode;
    }

    @Override
    public ProvisionByoipCidrResult clone() {
        try {
            return (ProvisionByoipCidrResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
