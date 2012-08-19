/**
 * SPINdle (version 2.2.0)
 * Copyright (C) 2009-2012 NICTA Ltd.
 *
 * This file is part of SPINdle project.
 * 
 * SPINdle is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * SPINdle is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with SPINdle.  If not, see <http://www.gnu.org/licenses/>.
 *
 * @author H.-P. Lam (oleklam@gmail.com), National ICT Australia - Queensland Research Laboratory 
 */
package spindle.core.dom;



/**
 * Indicates some problems have encountered in generating an application constant.
 * 
 * @author H.-P. Lam (oleklam@gmail.com), National ICT Australia - Queensland Research Laboratory
 * @since 2011.07.26
 * @since version 2.1.0
 */
public class AppConstantException extends TheoryException {
	private static final long serialVersionUID = 1L;

	public AppConstantException(Throwable cause) {
		this(null, cause, (Object[]) null);
	}

	public AppConstantException(String errorTag, Object... arguments) {
		this(errorTag, null, (Object[]) arguments);
	}

	protected AppConstantException(String errorTag, Throwable cause, Object... arguments) {
		super(errorTag, null, cause, arguments);
	}
}
