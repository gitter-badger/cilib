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
package net.sourceforge.cilib.functions.continuous.unconstrained;

import static org.junit.Assert.assertEquals;
import net.sourceforge.cilib.functions.ContinuousFunction;
import net.sourceforge.cilib.type.types.Real;
import net.sourceforge.cilib.type.types.container.Vector;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Andries Engelbrecht
 */


public class BealeTest {

    private ContinuousFunction function;

    @Before
    public void instantiate() {
        this.function = new Beale();
    }

    /** Test of evaluate method, of class za.ac.up.cs.ailib.Functions.Beale. */
    @Test
    public void testEvaluate() {
        function = new Beale();
        function.setDomain("R(-4.5, 4.5)^2");

        Vector x = new Vector();
        x.append(new Real(1.0));
        x.append(new Real(2.0));
        assertEquals(126.4531250, function.apply(x), 0.0);

        x.setReal(0, 3.0);
        x.setReal(1, 0.5);
        assertEquals(0.0, function.apply(x), 0.0);
    }

    @Test
    public void minimum() {
        Assert.assertEquals(0.0, function.getMinimum().doubleValue(), 0.0001);
    }
}
