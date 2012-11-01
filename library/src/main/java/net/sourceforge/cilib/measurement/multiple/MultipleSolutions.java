/**           __  __
 *    _____ _/ /_/ /_    Computational Intelligence Library (CIlib)
 *   / ___/ / / / __ \   (c) CIRG @ UP
 *  / /__/ / / / /_/ /   http://cilib.net
 *  \___/_/_/_/_.___/
 */
package net.sourceforge.cilib.measurement.multiple;


import net.sourceforge.cilib.algorithm.Algorithm;
import net.sourceforge.cilib.measurement.Measurement;
import net.sourceforge.cilib.problem.solution.OptimisationSolution;
import net.sourceforge.cilib.type.types.container.Vector;

/**
 *
 * @deprecated This class is no longer valid. A combination of the
 *             {@link CompositeMeasurement} and {@link net.sourceforge.cilib.measurement.single.Solution}
 *             should be used instead
 */
@Deprecated
public class MultipleSolutions implements Measurement<Vector> {
    private static final long serialVersionUID = 1617755270627315980L;

    @Override
    public MultipleSolutions getClone() {
        return this;
    }

    @Override
    public Vector getValue(Algorithm algorithm) {
        Vector.Builder v = Vector.newBuilder();

        for (OptimisationSolution solution : algorithm.getSolutions()) {
            v.copyOf((Vector) solution.getPosition());
        }

        return v.build();
    }

}
