/**           __  __
 *    _____ _/ /_/ /_    Computational Intelligence Library (CIlib)
 *   / ___/ / / / __ \   (c) CIRG @ UP
 *  / /__/ / / / /_/ /   http://cilib.net
 *  \___/_/_/_/_.___/
 */
package net.sourceforge.cilib.math.random;

import net.sourceforge.cilib.math.random.generator.RandomProvider;

/**
 * An interface for probability distribution functions. Concrete classes of
 * this type provide methods to sample random values from specific probability
 * distributions.
 *
 */
public interface ProbabilityDistributionFunction {

    /**
     * Sample a random number from the distribution.
     * @return A random number, sampled from the distribution.
     */
    double getRandomNumber();

    /**
     * Sample a random number from the distribution, given a number of control
     * parameters.
     * The control parameters can be any parameters needed by the specific
     * concrete distribution.
     * eg. mean and variance, or upper and lower bounds etc.
     *
     * @param parameters The control parameter for the distribution function.
     * @return
     */
    double getRandomNumber(double... parameters);

    RandomProvider getRandomProvider();

    void setRandomProvider(RandomProvider provider);
}
