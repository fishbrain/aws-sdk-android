/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;

/**
 * <p>
 * Summary of the details of a <code>ChannelModerator</code>.
 * </p>
 */
public class ChannelModeratorSummary implements Serializable {
    /**
     * <p>
     * The data for a moderator.
     * </p>
     */
    private Identity moderator;

    /**
     * <p>
     * The data for a moderator.
     * </p>
     *
     * @return <p>
     *         The data for a moderator.
     *         </p>
     */
    public Identity getModerator() {
        return moderator;
    }

    /**
     * <p>
     * The data for a moderator.
     * </p>
     *
     * @param moderator <p>
     *            The data for a moderator.
     *            </p>
     */
    public void setModerator(Identity moderator) {
        this.moderator = moderator;
    }

    /**
     * <p>
     * The data for a moderator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param moderator <p>
     *            The data for a moderator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChannelModeratorSummary withModerator(Identity moderator) {
        this.moderator = moderator;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getModerator() != null)
            sb.append("Moderator: " + getModerator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModerator() == null) ? 0 : getModerator().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChannelModeratorSummary == false)
            return false;
        ChannelModeratorSummary other = (ChannelModeratorSummary) obj;

        if (other.getModerator() == null ^ this.getModerator() == null)
            return false;
        if (other.getModerator() != null
                && other.getModerator().equals(this.getModerator()) == false)
            return false;
        return true;
    }
}