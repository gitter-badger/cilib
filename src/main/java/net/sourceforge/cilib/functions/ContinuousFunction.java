/**
 * Computational Intelligence Library (CIlib)
 * Copyright (C) 2003 - 2010
 * Computational Intelligence Research Group (CIRG@UP)
 * Department of Computer Science
 * University of Pretoria
 * South Africa
 *
 * This library is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, see <http://www.gnu.org/licenses/>.
 */
package net.sourceforge.cilib.functions;

import net.sourceforge.cilib.type.types.container.Vector;

/**
 * @author Edwin Peer
 * @author Olusegun Olorunda
 */
public abstract class ContinuousFunction extends AbstractFunction<Vector, Double> {
    private static final long serialVersionUID = -2483529496289508896L;

    /**
     * Create an instance of {@code ContinuousFunction}.
     */
    public ContinuousFunction() {
        // constraint.add(new ContentValidator(new TypeValidator(Real.class)));
    }

    /**
     * Copy constructor. Create a copy of the provided instance.
     * @param copy The instance to copy.
     */
    public ContinuousFunction(ContinuousFunction copy) {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public abstract ContinuousFunction getClone();

    /**
     * {@inheritDoc}
     */
    @Override
    public Double getMinimum() {
        return -Double.MAX_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double getMaximum() {
        return Double.MAX_VALUE;
    }

}
