/*
 * Copyright (C) 2014 University of Dundee & Open Microscopy Environment.
 * All rights reserved.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package ome.util.search;

/**
 * Exception to indicate that the query string was invalid
 * 
 * @author Dominik Lindner &nbsp;&nbsp;&nbsp;&nbsp;
 *         <a href="mailto:d.lindner@dundee.ac.uk">d.lindner@dundee.ac.uk</a>
 * 
 * @since 5.0
 */
public class InvalidQueryException extends Exception {

    public InvalidQueryException() {
        super();
    }

    public InvalidQueryException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

    public InvalidQueryException(String arg0) {
        super(arg0);
    }

    public InvalidQueryException(Throwable arg0) {
        super(arg0);
    }

}
