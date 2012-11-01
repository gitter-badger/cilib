/**           __  __
 *    _____ _/ /_/ /_    Computational Intelligence Library (CIlib)
 *   / ___/ / / / __ \   (c) CIRG @ UP
 *  / /__/ / / / /_/ /   http://cilib.net
 *  \___/_/_/_/_.___/
 */
package net.sourceforge.cilib.functions.continuous.unconstrained;

import net.sourceforge.cilib.functions.ContinuousFunction;
import net.sourceforge.cilib.type.types.container.Vector;

/**
 * Easom function as taken from
 * www-optima.amp.i.kyoto-u.ac.jp/member/student/hedar/Hedar_files/TestGO_files
 *
 * <p>
 * Characteristics:
 * <ul>
 * <li>Multimodal</li>
 * <li>Not separable</li>
 * <li>Regular</li>
 * </ul>
 *
 * f(x) = -1.0;  x = (Pi, Pi);
 *
 * R(-100, 100)^2
 *
 */
public class Easom implements ContinuousFunction {

    private static final long serialVersionUID = 7173528343222997045L;

    /**
     * {@inheritDoc}
     */
    @Override
    public Double apply(Vector input) {
        double powerTerm1 = -((input.doubleValueOf(0)-Math.PI)*(input.doubleValueOf(0)-Math.PI));
        double powerTerm2 = -((input.doubleValueOf(1)-Math.PI)*(input.doubleValueOf(1)-Math.PI));
        double power = powerTerm1 + powerTerm2;
        return -Math.cos(input.doubleValueOf(0)) * Math.cos(input.doubleValueOf(1)) * Math.exp(power);
    }
}
