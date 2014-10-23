/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 */

package org.jboss.ballroom.client.widgets.forms;

import java.util.Set;

/**
 * @author Heiko Braun
 * @date 3/4/11
 */
public class RenderMetaData {
    int numColumns = 1; // enforce a single column
    int titleWidth;
    private Set<String> filteredFields;

    public int getNumColumns() {
        return numColumns;
    }

    public void setNumColumns(int numColumns) {
        //this.numColumns = numColumns;
    }

    public int getTitleWidth() {
        return titleWidth;
    }

    public void setTitleWidth(int titleWidth) {
        this.titleWidth = titleWidth;
    }

    public void setFilteredFields(Set<String> filteredFields) {
        this.filteredFields = filteredFields;
    }

    public Set<String> getFilteredFields() {
        return filteredFields;
    }
}
